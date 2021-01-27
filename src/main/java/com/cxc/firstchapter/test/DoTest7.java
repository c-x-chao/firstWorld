package com.cxc.firstchapter.test;

/**
 * @Author cxc
 * @Date 2020/11/5 20:47
 * @Version 1.0
 * @Email cxc_work@163.com
 * 总结: 静态常量只能通过类名.常量名的方式调用
 * 创建类对象,再用类对象调用出错  直接显示报错
 */
public class DoTest7 {
    public static void main(String[] args) {
        System.out.println(StaticTest.i);
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
//        System.out.println("st1=" + st1.i);
//        System.out.println("st2=" + st2.i);

        Incrementable sf = new Incrementable();
        sf.increment();
    }
}

class StaticTest {
    public static int i;
//    int i = 47;
}

class Incrementable {
    public  void increment() {
        StaticTest.i++;
    }

}