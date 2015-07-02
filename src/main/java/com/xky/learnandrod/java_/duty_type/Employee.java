package com.xky.learnandrod.java_.duty_type;

/**
 * Created by xky on 15/6/12.
 *
 * 就没做抽象
 * 员工类
 */
public class Employee {

    private String name;
    private int leaveDay;

    public Employee(String name) {
        this.name = name;
    }

    public int getLeaveDay() {
        return leaveDay;
    }

    public void setLeaveDay(int leaveDay) {
        this.leaveDay = leaveDay;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", leaveDay=" + leaveDay +
                '}';
    }
}
