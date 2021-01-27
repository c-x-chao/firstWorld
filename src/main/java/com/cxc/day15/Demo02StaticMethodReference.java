package com.cxc.day15;

/**
 * @Author cxc
 * @Date 2021/1/3 22:37
 * @Version 1.0
 * @Email cxc_work@163.com
 * 通过类名引用静态成员方法
 * 前提:类已经存在,静态成员方法已经存在
 */
public class Demo02StaticMethodReference {
    //定义一个方法,方法的参数传递一个接口 计算绝对值的整数
    public static int method(int number,Calcable c){
        return c.calsAbs(number);
    }

    public static void main(String[] args) {
        //调用method方法
        int i = method(-10, (n) -> {
            return Math.abs(n);
        });
        System.out.println(i);


        /*使用方法引用优化lambda
         */
        int i1 = method(-11, Math::abs);
        System.out.println(i1);
    }
}
