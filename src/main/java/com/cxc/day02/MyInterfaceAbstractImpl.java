package com.cxc.day02;

/**
 * @Author cxc
 * @Date 2020/11/29 20:05
 * @Version 1.0
 * @Email cxc_work@163.com
 */
public class MyInterfaceAbstractImpl implements MyInterfaceAbstract{
    @Override
    public void method1() {
        System.out.println("这个是第一个方法");
    }

    @Override
    public void method2() {
        System.out.println("这个是接口实现中的重写方法!");
    }
}
