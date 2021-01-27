package com.cxc.day13hanshushibc;

import java.util.function.Function;

/**
 * @Author cxc
 * @Date 2021/1/3 14:05
 * @Version 1.0
 * @Email cxc_work@163.com
 * 根据一个类型的数据得到一个类型的数据
 */
public class Demo04FuntionApply {
    /**
     * 定义一个方法
     * 方法的参数传递一个字符串的整数
     * 方法的参数传递一个function接口,接口泛型为<String,Integer>
     *     使用function接口中的方法apply();把string类型的整数转化为integer的整数
     */
    public static void chnage(String s, Function<String,Integer> function){
        Integer in = function.apply(s);
        System.out.println(in);
    }

    public static void main(String[] args) {
        //定义一个字符串类型的整数
        String s = "100";
        chnage(s,(str)-> Integer.parseInt(str));
    }
}
