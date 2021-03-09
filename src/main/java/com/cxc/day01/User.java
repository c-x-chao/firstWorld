package com.cxc.day01;

import lombok.Data;

/**
 * @Author cxc
 * @Date 2020/11/25 22:35
 * @Version 1.0
 * @Email cxc_work@163.com
 */
@Data
public class User {
    private String name;
    private Integer money;

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }


    /**
     * 展现一下用户有多少钱
     */
    public void     show(){
        System.out.println("我叫"+name+",有"+money+"钱");
    }
}
