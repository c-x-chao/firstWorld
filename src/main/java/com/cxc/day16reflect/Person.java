package com.cxc.day16reflect;

import lombok.Data;

/**
 * @Author cxc
 * @Date 2021/1/5 22:50
 * @Version 1.0
 * @Email cxc_work@163.com
 */
@Data
public class Person {
    private String name;
    private int age;

    public String address;
    public String home;
    public String school;
    public String family;

    public void getmethod(){
        System.out.println("成员方法");
    }
}
