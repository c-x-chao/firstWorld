package com.cxc.day17.annotation;

/**
 * @Author cxc
 * @Date 2021/1/6 22:28
 * @Version 1.0
 * @Email cxc_work@163.com
 * java 自带的基本注解 3个
 */

public class AnnoDemo1 {

    /**
     * 重写注解
     * @return
     */
    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * 已过时注解
     */
    @Deprecated
    public void getMethod(){
        System.out.println("此方法已过时");
    }

    /**
     * 抑制编译器警告注解,注解参数一般为 "all"  一般放在类上面
     */
    @SuppressWarnings("all")
    public void getAge(){
        System.out.println("预制编译器警告注解");
    }
}
