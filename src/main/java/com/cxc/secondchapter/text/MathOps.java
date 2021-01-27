package com.cxc.secondchapter.text;

import java.util.Random;

/**
 * @Author cxc
 * @Date 2020/11/8 18:41
 * @Version 1.0
 * @Email cxc_work@163.com
 */
public class MathOps {
    public static void main(String[] args) {
        Random ran = new Random(47);
        int i, j, k;
        j = ran.nextInt(100) + 1;
        System.out.println("j:" + j);
        k = ran.nextInt(100) + 1;
        System.out.println("k:" + k);
        i = j + k;
        System.out.println("i=j+k:::   " + i);
        i = j - k;
        System.out.println("i=j-k:::   " + i);
        i = j / k;
        System.out.println("i=j/k:::   " + i);
    }
}
