package com.cxc.day06;

/**
 * @Author cxc
 * @Date 2020/12/16 22:33
 * @Version 1.0
 * @Email cxc_work@163.com
 * 消费者类:吃货类
 */
public class Chihuo extends Thread{
    private Baozi bz;
    public Chihuo(Baozi bz){
        this.bz = bz;
    }

    @Override
    public void run() {
        //一直吃包子
        while(true){
            synchronized (bz){
                if(bz.flag==false){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("吃货正在吃"+bz.pi+bz.xian+"包子");
                bz.flag = false;
                bz.notify();
                System.out.println("吃货已经吃晚"+bz.pi+bz.xian+"包子");
                System.out.println("-------------------------------");
            }
        }
    }
}
