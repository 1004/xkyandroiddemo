package com.xky.learnandrod.view;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.xky.learnandrod.BaseActivity;
import com.xky.learnandrod.R;
import com.xky.learnandrod.domains.DesignItem;
import com.xky.learnandrod.java_.Client;
import com.xky.learnandrod.java_grammar.anno.impl.AnnotationClient;
import com.xky.learnandrod.java_grammar.thread_task.impl.WorkClient;
import com.xky.learnandrod.java_grammar.thread_threadLocal.ThreadLocalClient;
import com.xky.learnandrod.java_grammar.thread_tools.ToolsClient;
import com.xky.learnandrod.view.adapter.DesignAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xky on 15/5/18.
 */
public class JavaGrammarActivity extends BaseActivity{
    private ListView mListView;
    private DesignAdapter mAdapters;
    private List<DesignItem> mDatas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design);
        initView();
        initData();
        setlistener();
//        Log.i("test","DesignTypeActivity");
    }


    private void setlistener() {
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                mDatas.get(i).getClient().test();
            }
        });
    }

    private void initData() {
        mDatas = new ArrayList<DesignItem>();
        mDatas.add(getDesignItem("并发-ThreadLocal",new ThreadLocalClient()));
        mDatas.add(getDesignItem("并发-ThreadTool【Exectors,CyClicBarrier,Semaphor,CountDownLathc】",new ToolsClient()));
        mDatas.add(getDesignItem("注解",new AnnotationClient()));
        mDatas.add(getDesignItem("工作Task",new WorkClient()));

        mAdapters = new DesignAdapter(this);
        mAdapters.setData(mDatas);

        mListView.setAdapter(mAdapters);
    }

    private void initView(){
        mListView = (ListView) findViewById(R.id.all_design_listview);
        findViewById(R.id.title_inf).setVisibility(View.GONE);
    }

    private DesignItem getDesignItem(String title,Client client){
        DesignItem item = new DesignItem();
        item.setClient(client);
        item.setDesignName(title);
        return item;
    }
    
    


}
