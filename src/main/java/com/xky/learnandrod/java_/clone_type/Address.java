package com.xky.learnandrod.java_.clone_type;

import java.io.Serializable;

/**
 * Created by xky on 15/6/12.
 *
 * 地址
 */
public class Address implements Serializable{
    private String province;
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {

        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province.toString() + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
