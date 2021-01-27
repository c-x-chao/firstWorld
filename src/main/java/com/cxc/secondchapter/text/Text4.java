package com.cxc.secondchapter.text;

import java.util.Random;

/**
 * @Author cxc
 * @Date 2020/11/8 18:49
 * @Version 1.0
 * @Email cxc_work@163.com
 * 计算速度的程序,距离和时间都是常量
 */
public class Text4 {
    public static void main(String[] args) {
        Random ran = new Random();
        int s,l,t;
        l = ran.nextInt(100)+1;
        System.out.println("l: "+l);
        t = ran.nextInt(100)+1;
        System.out.println("t: "+t);
        s = l * t;
        System.out.println("s:"+s);
    }
}
