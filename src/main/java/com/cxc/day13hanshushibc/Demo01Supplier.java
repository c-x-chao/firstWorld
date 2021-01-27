package com.cxc.day13hanshushibc;

import java.util.function.Supplier;

/**
 * @Author cxc
 * @Date 2021/1/2 19:21
 * @Version 1.0
 * @Email cxc_work@163.com
 * 函数式接口
 * 生产型数据接口
 */
public class Demo01Supplier {
    //定义一个方法 参数传递supperiler<T>,泛型为String,执行get方法,返回一个String
    public static String getString(Supplier<String> supplier){
        return  supplier.get();
    }

    public static void main(String[] args) {
        String s = getString(()-> "赵丽颖");
        System.out.println(s);

    }
}
