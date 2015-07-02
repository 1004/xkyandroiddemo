package com.xky.learnandrod.java_.duty_type.impl;

import com.xky.learnandrod.java_.duty_type.ALeader;
import com.xky.learnandrod.java_.duty_type.Employee;

/**
 * Created by xky on 15/6/12.
 *
 * 主任
 */
public class DirectorLeader extends ALeader{
    ALeader leader = null;

    public DirectorLeader() {
        super("主任");
    }

    @Override
    public void setNextLeader(ALeader leader) {
        this.leader = leader;
    }

    @Override
    public void operateRequest(Employee employee) {
        if (employee.getLeaveDay()<10){
            System.out.println(mtype+"批准了"+employee.toString());
        }else {
            if (leader != null){
                leader.operateRequest(employee);
            }
        }
    }
}
