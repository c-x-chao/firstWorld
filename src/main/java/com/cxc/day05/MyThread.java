package com.cxc.day05;

/**
 * @Author cxc
 * @Date 2020/12/15 21:22
 * @Version 1.0
 * @Email cxc_work@163.com
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().setName("线程名称"));
    }
}
