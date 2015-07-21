package com.xky.learnandrod.java_grammar.thread_task;

import android.os.*;
import android.os.Process;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by xky on 15/7/17.
 */
public abstract class Task<Params,Progress,Result> {

    //搞一个内置线程池来执行任务
    private static final int COREPOOLSIZE = 10;
    private static final int MAXPOOLSIZE = 125;
    private static final long KEEPALIVETIEM = 1;
    private static final BlockingDeque<Runnable> mWorkQueue = new LinkedBlockingDeque<Runnable>();
    private static final ThreadFactory mFactory = new ThreadFactory() {
        private final AtomicInteger mCount = new AtomicInteger(1);

        @Override
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable,"Thread create #"+mCount.getAndIncrement());
        }
    };

    private static final Executor THREAD_POOL_EXECUTORS = new ThreadPoolExecutor(COREPOOLSIZE,MAXPOOLSIZE,KEEPALIVETIEM,
            TimeUnit.SECONDS,mWorkQueue,mFactory);

    private final WorkRunnalbe<Params,Result> mWorkRunnalbe ;
    private final FutureTask<Result> mFuture ;


    private Exception exception = null;
    private static final int MESSAGE_POST_PROGRESS = 0x01;
    private static final int MESSAGE_POST_RESULT = 0x02;

    private volatile Status mStatus = Status.PENDING;
    private final AtomicBoolean mInvokedRunning = new AtomicBoolean();

    public enum Status
    {
        PENDING,
        RUNNING,
        FINISHED
    }

    private static final InnerDispathcHandler mDispatchHandler = new InnerDispathcHandler();
    public Task()
    {
        mWorkRunnalbe = new WorkRunnalbe<Params, Result>() {
            @Override
            public Result call() throws Exception {
                mInvokedRunning.set(true);
                android.os.Process.setThreadPriority(Process.THREAD_PRIORITY_BACKGROUND);
                return postResult(doInBackground(paramses));
            }
        };

        mFuture = new FutureTask<Result>(mWorkRunnalbe){
            @Override
            protected void done() {
                try {
                    final Result result = get();
                    notInvokePostResult(result);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }
        };

    }

    protected abstract Result onDoBackground(Params ... paramses);

    private Result doInBackground(Params ...paramses){
        try {
            return onDoBackground(paramses);
        }catch (Exception e){
            exception = e;
        }
        return null;
    }


    private  static class InnerDispathcHandler extends Handler{
        @Override
        public void handleMessage(Message msg) {
            AsyncTaskResult  result = (AsyncTaskResult) msg.obj;
            switch (msg.what){
                case MESSAGE_POST_PROGRESS:
                    result.mTask.onProgress(result.mdata);
                    break;
                case MESSAGE_POST_RESULT:
                    result.mTask.finish(result.mdata[0]);
                    break;
            }
        }
    }

    private final Task executeByPool(Executor executor,Params ...paramses){
        switch (mStatus){
            case FINISHED:
                throw  new IllegalStateException("the thread has finsh");
//                break;
            case RUNNING:
                throw new IllegalStateException("the task is running ,don't execute the task");
//                break;
        }
        mStatus = Status.RUNNING;
        onPreExecute();
        mWorkRunnalbe.paramses = paramses;
        executor.execute(mFuture);
        return this;
    }

    public Task execute(Params ... paramses){
        return executeByPool(THREAD_POOL_EXECUTORS,paramses);
    }


    final protected void onPreExecute(){

    }

    final private void onPostExecute(Result result){
        if (exception == null){
            onSuccess(result);
        }else {
            onFailed(exception);
        }
        onFinish();
    }



    private Result postResult(Result result) {
        Message msg = mDispatchHandler.obtainMessage(MESSAGE_POST_RESULT, new AsyncTaskResult<Result>(this, result));
        msg.sendToTarget();
        return result;
    }

    private void notInvokePostResult(Result result){
        if (!mInvokedRunning.get()){
            postResult(result);
        }
    }



    /**
     * 准备执行
     */
    protected void onPrepare(){};

    /**
     * 执行中的进度
     * @param progress
     */
    protected void onProgress(Params ... progress){

    }
    /**
     * 执行完成 不管成功还是失败 都会执行
     */
    protected void onFinish(){

    }

    /**
     * 成功执行
     * @param result
     */
    protected void onSuccess(Result result){

    }

    /**
     * 失败执行
     * @param exception
     */
    protected void onFailed(Exception exception){

    }

    /**
     * 取消
     */
    protected void  onCanceled(){
        onFinish();
    }
    private void finish(Result result){
        if (isCanceled()){
            onFinish();
        }else {
            onPostExecute(result);
        }
        mStatus = Status.FINISHED;
    }

    public final boolean isCanceled(){
        return mFuture.isCancelled();
    }

    private static class AsyncTaskResult<Data>{

        final Task mTask ;
        final Data[] mdata;
        private AsyncTaskResult(Task task,Data ...datas) {
            mTask = task;
            mdata = datas;
        }
    }




    private abstract static class WorkRunnalbe<Params,Result> implements Callable<Result> {
        Params[] paramses;
    }



}
