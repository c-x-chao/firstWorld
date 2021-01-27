package com.cxc.day06;

/**
 * @Author cxc
 * @Date 2020/12/16 22:38
 * @Version 1.0
 * @Email cxc_work@163.com
 */
public class Testbz {
    public static void main(String[] args) {
        //创建包子对象
        Baozi bz = new Baozi();
        //生产包子
        new Baozipu(bz).start();
        //吃包子
         new Chihuo(bz).start();
    }
}
