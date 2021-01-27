package com.cxc.day13hanshushibc;

import java.util.function.Consumer;

/**
 * @Author cxc
 * @Date 2021/1/2 19:45
 * @Version 1.0
 * @Email cxc_work@163.com
 * consumer 默认方法 andthen
 * 作用:需要两个consumer接口 可以把两个consumer接口组合在一起,对数据进行消费
 */
public class Demo02AndThen {
    public static void method(String s,Consumer<String> con1,Consumer<String> con2){
//        con1.accept(s);
//        con2.accept(s);
        con1.andThen(con2).accept(s);
    }

    public static void main(String[] args) {
        method("Hello",(String name)->{
            System.out.println(name.toUpperCase());
        },(String name)->{
            System.out.println(name.toLowerCase());
        });
    }
}
