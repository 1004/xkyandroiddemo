package com.xky.learnandrod.java_.clone_type;

import com.xky.learnandrod.java_.Client;

/**
 * Created by xky on 15/6/12.
 */
public class CloneClient implements Client{
    @Override
    public void test() {
        Customer customer = new Customer();
        Address address = new Address();
        address.setCity("北京");
        address.setProvince("山东");
        customer.setAddress(address);
        customer.setName("xky");
        customer.setSex(1);

        //比较地址确定是否相等
        Customer simpleCustomer = customer.clone();
        simpleCustomer.setName("xky2");
        simpleCustomer.setSex(2);
//        simpleCustomer.getAddress().setCity("菏泽");
        System.out.println("simpleCustomer name---"+(customer.getName()==simpleCustomer.getName()));
        System.out.println("simpleCustomer sex---"+(customer.getSex()==simpleCustomer.getSex()));
        System.out.println("simpleCustomer address---"+(customer.getAddress()==simpleCustomer.getAddress()));
        System.out.println("simpleCustomer this---"+(customer == simpleCustomer));
        System.out.println("simpleCustomer ---"+(simpleCustomer.toString()));
        System.out.println("customer1 ---"+(customer.toString()));


        Customer deepCustomer = customer.DeepClone();
        deepCustomer.setName("xky2");
        deepCustomer.setSex(2);
        deepCustomer.getAddress().setCity("菏泽");
        System.out.println("deepCustomer name---"+(customer.getName()==deepCustomer.getName()));
        System.out.println("deepCustomer sex---"+(customer.getSex()==deepCustomer.getSex()));
        System.out.println("deepCustomer address---"+(customer.getAddress()==deepCustomer.getAddress()));
        System.out.println("deepCustomer this---"+(customer == deepCustomer));
        System.out.println("deepCustomer ---"+(deepCustomer.toString()));
        System.out.println("customer2 ---"+(customer.toString()));

    }
}
