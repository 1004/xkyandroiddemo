package com.xky.learnandrod.java_.clone_type;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by xky on 15/6/12.
 */
public class Customer implements Cloneable,Serializable{
    private String name;
    private int sex;

    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getSex() {

        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * 此处是进行的浅copy 必须实现Cloneable接口
     * 只能copy对象自己   自己里面基本成员  里面的插件的地址
     * @return
     */
    @Override
    protected Customer clone()  {

        Customer obj = null;

        try {
             obj = (Customer) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("不能进行对象的copy哦");
        }
        return obj;
    }


    /**
     * 对象的深copy
     *
     * 如果想把对象写入流中
     * 必须实现序列话接口，插件也必须实现的
     * @return
     */
    public Customer DeepClone(){
        Customer customer = null;
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(this);

            ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            customer = (Customer) objectInputStream.readObject();

            objectOutputStream.close();
            objectInputStream.close();


        } catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return  customer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", address=" + address +
                '}';
    }
}

