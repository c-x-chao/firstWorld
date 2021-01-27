package com.cxc.day02;

/**
 * @Author cxc
 * @Date 2020/11/29 20:03
 * @Version 1.0
 * @Email cxc_work@163.com
 */
public interface MyInterfaceAbstract {
    void method1();

    default void method2() {
        System.out.println("这是新添加的方法!");
    }
    static void method3(){
        System.out.println("这个是静态方法");
    }
}
