package com.cxc.day13hanshushibc;

import java.util.function.Predicate;

/**
 * @Author cxc
 * @Date 2021/1/2 20:09
 * @Version 1.0
 * @Email cxc_work@163.com
 * 作用: 对某种数据类型作为判断,返回一个布尔值
 */
public class Demo03Predicate {
    //定义一个方法
    public static boolean checkString(String s, Predicate<String> predicate) {
        return predicate.test(s);
    }

    public static void main(String[] args) {
        String s = "abcde";
        boolean b = checkString(s, str -> str.length() > 5);
        System.out.println(b);
    }
}
