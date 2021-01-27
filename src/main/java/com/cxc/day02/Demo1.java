package com.cxc.day02;

/**
 * @Author cxc
 * @Date 2020/11/29 20:04
 * @Version 1.0
 * @Email cxc_work@163.com
 */
public class Demo1 {
    public static void main(String[] args) {
        MyInterfaceAbstractImpl inter = new MyInterfaceAbstractImpl();
        inter.method1();
        inter.method2();
        MyInterfaceAbstract.method3();
    }
}
