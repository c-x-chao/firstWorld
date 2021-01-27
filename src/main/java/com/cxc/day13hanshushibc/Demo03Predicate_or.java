package com.cxc.day13hanshushibc;

import java.util.function.Predicate;

/**
 * @Author cxc
 * @Date 2021/1/2 20:36
 * @Version 1.0
 * @Email cxc_work@163.com
 * ��
 */
public class Demo03Predicate_or {
    /**
     * ����һ������  ��and����
     * @param s
     * @param p1
     * @param p2
     * @return
     */
    public static boolean checkString(String s, Predicate<String> p1, Predicate<String> p2){
//        return p1.test(s) || p2.test(s);
        return p1.or(p1).or(p2).test(s);
    }

    public static void main(String[] args) {
        String s = "helloWorlds";
        boolean d = checkString(s, str -> str.length() > 5
                , (str) -> str.endsWith("d"));
        System.out.println(d);
    }
}
