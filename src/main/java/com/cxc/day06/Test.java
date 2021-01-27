package com.cxc.day06;

/**
 * @Author cxc
 * @Date 2020/12/16 21:10
 * @Version 1.0
 * @Email cxc_work@163.com
 * 线程安全  Lock锁
 */
public class Test {
    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);

        t1.start();
        t2.start();
        t3.start();
    }
}
