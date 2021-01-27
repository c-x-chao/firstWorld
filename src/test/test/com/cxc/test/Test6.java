package com.cxc.test;

import java.util.Scanner;

/**
 * @Author cxc
 * @Date 2020/12/5 15:07
 * @Version 1.0
 * @Email cxc_work@163.com
 */
public class Test6 {
    public static void main(String[] args) {
        //break和continue的区别

        //break 跳出当前循环,结束循环,不进行下一次了
        for (int i = 0; i < 10; i++) {
            if (i == 6) {
                //当i=6的时候,这个循环结束了,不继续输出i=6之后的数字了
                break;
            }
            //输出结果(没有数字6以及数字6之后的) 0 1 2 3 4 5
            System.out.print(i + " ");

        }

        System.out.println();
        //continue 跳出当前循环,执行下一次,本次不执行(continue之后的代码本次不执行)
        for (int j = 0; j < 10; j++) {
            if (j == 6) {
                //当i=6的时候,结束这一次循环,即循环中不能输出j=6,执行j=7
                continue;
            }
            //输出结果(没有数字6) 0 1 2 3 4 5 7 8 9
            System.out.print(j + " ");
        }
    }
}
