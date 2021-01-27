package com.cxc.day06;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author cxc
 * @Date 2020/12/16 21:02
 * @Version 1.0
 * @Email cxc_work@163.com
 * Lock 锁
 */
public class RunnableImpl implements Runnable {
    private int ticket = 100;
    Lock l = new ReentrantLock();

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
//        while (true) {
//            l.lock();
//            if (ticket > 0) {
//                try {
//                    Thread.sleep(10);
//                    System.out.println(Thread.currentThread().getName() + "正在卖-->" + ticket + "票");
//                    ticket--;
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                } finally {
//                    l.unlock();
//                }
//            }
//        }
    }
}
