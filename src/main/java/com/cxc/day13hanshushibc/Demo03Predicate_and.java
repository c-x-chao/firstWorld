package com.cxc.day13hanshushibc;

import java.util.function.Predicate;

/**
 * @Author cxc
 * @Date 2021/1/2 20:27
 * @Version 1.0
 * @Email cxc_work@163.com
 */
public class Demo03Predicate_and {
    /**
     * 定义一个方法  用and连接
     * @param s
     * @param p1
     * @param p2
     * @return
     */
    public static boolean checkString(String s, Predicate<String> p1,Predicate<String> p2){
        return p1.test(s)&& p2.test(s);
    }

    public static void main(String[] args) {
        String s = "helloWorld";
        boolean d = checkString(s, str -> str.length() > 5
                , (str) -> str.endsWith("d"));
        System.out.println(d);
    }
}
