package com.cxc.day13hanshushibc;

import java.util.function.Consumer;

/**
 * @Author cxc
 * @Date 2021/1/2 19:37
 * @Version 1.0
 * @Email cxc_work@163.com
 * 函数式接口编程
 * 消费型接口 consumer
 */
public class Demo02Consumer {
    /**
     * 定义一个方法,方法的参数传递一个字符串的姓名
     * 方法的参数传递Consumer接口,泛型使用为String
     */
     public static void method(String name, Consumer<String> con){
         con.accept(name);
     }

    public static void main(String[] args) {
        method("赵丽颖",(String name)->{
            //对传递的字符串进行消费
//            System.out.println(name);//消费方式,直接输出字符串
            //消费方式:把字符串反转
            String rename = new StringBuilder(name).reverse().toString();
            System.out.println(rename);
        });
    }

}
