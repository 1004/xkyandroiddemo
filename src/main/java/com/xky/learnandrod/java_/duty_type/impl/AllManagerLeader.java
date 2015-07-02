package com.xky.learnandrod.java_.duty_type.impl;

import com.xky.learnandrod.java_.duty_type.ALeader;
import com.xky.learnandrod.java_.duty_type.Employee;

/**
 * Created by xky on 15/6/12.
 *
 * 主任
 */
public class AllManagerLeader extends ALeader{
    ALeader leader = null;

    public AllManagerLeader() {
        super("总经理");
    }

    @Override
    public void setNextLeader(ALeader leader) {
        this.leader = leader;
    }

    @Override
    public void operateRequest(Employee employee) {
        if (employee.getLeaveDay()>=20 && employee.getLeaveDay()<30){
            System.out.println(mtype+"批准了"+employee.toString());
        }else {
            System.out.println("请假天数太长,拒绝"+employee.toString());
        }
    }
}
