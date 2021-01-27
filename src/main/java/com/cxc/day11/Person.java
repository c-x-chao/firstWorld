package com.cxc.day11;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author cxc
 * @Date 2020/12/28 22:11
 * @Version 1.0
 * @Email cxc_work@163.com
 * 实现序列化接口,进行标记Serializable
 * transient: 禁止序列化关键字
 */
@Data
public class Person implements Serializable {
    private static final long serialVersionUID = 42L;
    private String name;
//    private transient int age;
//    private static int age;
    public   int age;
    public Person(String name,int age){
        this.age = age;
        this.name = name;
    }
}
