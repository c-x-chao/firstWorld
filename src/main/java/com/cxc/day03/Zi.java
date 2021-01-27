package com.cxc.day03;

/**
 * @Author cxc
 * @Date 2020/11/29 20:47
 * @Version 1.0
 * @Email cxc_work@163.com
 */
public class Zi extends Fu{
    int num = 24;

    @Override
    public  void shouNum(){
        System.out.println(num);
    }

    @Override
    public void method(){
        System.out.println("子类方法");
    }

    public void methodZi(){
        System.out.println("这是子类特有方法!");
    }
}
