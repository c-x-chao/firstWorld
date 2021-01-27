package com.cxc.day14stream;

import com.cxc.day15.Printable;

/**
 * @Author cxc
 * @Date 2021/1/3 16:03
 * @Version 1.0
 * @Email cxc_work@163.com
 */
public class Demo01Printable {
    public static void printString(Printable p){
        p.print("helloworld");
    }

    public static void main(String[] args) {
//        printString((s)-> System.out.println(s));
        printString(System.out::println);
    }
}
