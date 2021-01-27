package com.cxc.day01;

import java.util.ArrayList;

/**
 * @Author cxc
 * @Date 2020/11/25 23:14
 * @Version 1.0
 * @Email cxc_work@163.com
 */
public class Test {
    public static void main(String[] args) {
        Manger manger = new Manger("群主",100);

        Member one = new Member("成员A",0);
        Member two = new Member("成员B",0);
        Member three = new Member("成员C",0);

        manger.show();
        one.show();
        two.show();
        three.show();


        System.out.println("========================");

        ArrayList<Integer> gedList = manger.send(20,3);
        one.receive(gedList);
        two.receive(gedList);
        three.receive(gedList);

        manger.show();
        one.show();
        two.show();
        three.show();
    }
}
