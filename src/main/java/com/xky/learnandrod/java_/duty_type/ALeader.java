package com.xky.learnandrod.java_.duty_type;

/**
 * Created by xky on 15/6/12.
 *
 * 责任链
 * 必须明确 处理责任的元素  责任  发送责任
 * 恋和恋直接进行连接
 */
public abstract class ALeader {
    protected String mtype ;
    //类型
    public ALeader(String type){
         mtype = type;
    }

    /**
     * 设置下级处理者
     */
    public abstract void setNextLeader(ALeader leader);

    /**
     * 设置处理请求
     * @param employee
     */
    public abstract void operateRequest(Employee employee);
}
