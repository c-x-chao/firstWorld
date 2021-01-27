package com.cxc.day07;

import lombok.Data;

/**
 * @Author cxc
 * @Date 2020/12/17 21:01
 * @Version 1.0
 * @Email cxc_work@163.com
 */
@Data
public class Person {
    private String name;
    private Integer age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
