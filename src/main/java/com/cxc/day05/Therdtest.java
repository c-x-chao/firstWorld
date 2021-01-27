package com.cxc.day05;

/**
 * @Author cxc
 * @Date 2020/12/15 21:22
 * @Version 1.0
 * @Email cxc_work@163.com
 */
public class Therdtest {
    public static void main(String[] args) {
            MyThread mt = new MyThread();
            mt.start();
            mt.setName("小强");
        System.out.println(Thread.currentThread().getName());
    }
}
