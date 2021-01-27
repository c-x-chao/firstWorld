package com.cxc.day06;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author cxc
 * @Date 2020/12/16 23:42
 * @Version 1.0
 * @Email cxc_work@163.com
 */
public class DemoThreadPool {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
    }
}
