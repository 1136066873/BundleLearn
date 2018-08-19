package com.study.heguodong;

import java.io.Serializable;

/**
 * Created by 01438511 on 2018/8/19.
 */

public class Boom implements Serializable {


    private String name = "YangYang";
    private String age = "27";
    private String hair_lenth = "chang";
    private String haire_color = "zong";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHair_lenth() {
        return hair_lenth;
    }

    public void setHair_lenth(String hair_lenth) {
        this.hair_lenth = hair_lenth;
    }

    public String getHaire_color() {
        return haire_color;
    }

    public void setHaire_color(String haire_color) {
        this.haire_color = haire_color;
    }

    @Override
    public String toString() {
        return "Boom{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", hair_lenth='" + hair_lenth + '\'' +
                ", haire_color='" + haire_color + '\'' +
                '}';
    }
}
