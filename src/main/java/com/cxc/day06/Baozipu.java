package com.cxc.day06;

import jdk.nashorn.internal.ir.WhileNode;
import lombok.SneakyThrows;

/**
 * @Author cxc
 * @Date 2020/12/16 22:20
 * @Version 1.0
 * @Email cxc_work@163.com
 * 生产者
 */
public class Baozipu extends Thread {
    //创建一个锁对象
    private Baozi bz;

    //使锁对象唯一
    public Baozipu(Baozi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        //生产包子
        int count = 0;
        while (true){
            synchronized (bz) {
                //首先判断包子是否存在
                if(bz.flag==true){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if(count%2==0){
                    bz.pi="薄皮";
                    bz.xian = "大葱馅";
                }else{
                    bz.pi="厚皮";
                    bz.xian = "猪肉馅";
                }
                count++;
                System.out.println("正在做"+bz.pi+bz.xian+"包子");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.flag=true;
                bz.notify();
                System.out.println("包子做好了");
            }
        }

    }
}
