package com.cxc.secondchapter.text;

import java.sql.SQLOutput;

/**
 * @Author cxc
 * @Date 2020/11/8 17:53
 * @Version 1.0
 * @Email cxc_work@163.com
 */
public class PassObject {
    static void f(Letter y){
        y.c = 'z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1: x.c:"+x.c);
        f(x);
        System.out.println("1: x.c:"+x.c);
    }
}

class Letter {
    char c;
}
