package com.xky.learnandrod.java_.duty_type.impl;

import com.xky.learnandrod.java_.Client;
import com.xky.learnandrod.java_.duty_type.Employee;

/**
 * Created by xky on 15/6/12.
 */
public class DutyClient implements Client {
    @Override
    public void test() {
        Employee employee = new Employee("xky");
        DirectorLeader directorLeader = new DirectorLeader();
        ManagerLeader managerLeader = new ManagerLeader();
        AllManagerLeader allManagerLeader = new AllManagerLeader();
        //设置职责
        directorLeader.setNextLeader(managerLeader);
        managerLeader.setNextLeader(allManagerLeader);
        //发送职责
        for (int i = 1 ; i< 38;i+=5){
            employee.setLeaveDay(i);
            directorLeader.operateRequest(employee);
        }
    }
}
