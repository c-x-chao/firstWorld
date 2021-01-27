package com.cxc.day06;

/**
 * @Author cxc
 * @Date 2020/12/16 21:30
 * @Version 1.0
 * @Email cxc_work@163.com
 * 等待唤醒案例
 * 创建一个顾客线程(消费者):告知老板要的包子和数量,调用wait方法,放弃cpu的执行,进入waiting状态,无限等待
 * 创建一个老板线程(生产者):花了5秒做包子,包子做好之后,使用notify方法,唤醒顾客
 */
public class Test1 {
    public static void main(String[] args) {
        //创建所对象,唯一
        Object obj = new Object();
        //创建一个顾客线程
        new Thread(){
            @Override
            public void run() {
                while(true){
                    //保证唤醒和等待只有一个进行,需要使用同步技术
                    synchronized (obj){
                        System.out.println("告知老板需要的包子和数量");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //唤醒之后吃包子
                        System.out.println("老板做的包子真好吃!!!");
                    }
                    System.out.println("------------------------------");
                }

            }
        }.start();

        //创建一个老板线程
        new Thread(){
            @Override
            public void run() {
               while(true){
                   try {
                       Thread.sleep(5000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   //保证唤醒和等待只有一个进行,需要使用同步技术
                   synchronized (obj){
                       System.out.println("老板5秒钟之后,告诉顾客包子做好了");
                       obj.notify();
                   }
               }
            }
        }.start();
    }
}
