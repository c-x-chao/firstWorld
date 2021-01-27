package com.cxc.day13hanshushibc;

import java.util.function.Predicate;

/**
 * @Author cxc
 * @Date 2021/1/2 20:36
 * @Version 1.0
 * @Email cxc_work@163.com
 * 取反
 */
public class Demo03Predicate_negate {
    /**
     * 定义一个方法
     * @param s
     * @param p1
     * @return
     */
    public static boolean checkString(String s, Predicate<String> p1){
//        return !p1.test(s);
        return p1.negate().test(s);
    }

    public static void main(String[] args) {
        String s = "helloWorlds";
        boolean d = checkString(s, str -> str.length() > 5);
        System.out.println(d);
    }
}
