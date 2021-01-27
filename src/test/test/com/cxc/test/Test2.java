package com.cxc.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author cxc
 * @Date 2020/11/24 20:46
 * @Version 1.0
 * @Email cxc_work@163.com
 * 输入一个字符串,判断是否是按照大小顺序吗,是的话输出 数字正序输出,字母倒叙输出
 * 1. 先输入一个字符串(字符串好友数字和字母)
 * 2. 判断数字和字母,相邻数字或者字母是否是从小到大顺序,是的话数字输出顺序,字母倒叙输出,否则输出单个字符
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字或者字母:");
        String str = scanner.next();
        getprint(str);
    }

    private static void getprint(String str) {
//        if (str != null) {
//            String s = "";
//            List<String> array = new ArrayList<>();
//            char[] chars = str.toCharArray();
//            for (int i = 1; i < str.length(); i++) {
//                char c = chars[i];
//                if (0 <= c && c <= 9) {
//                    s += c;
//                    System.out.println("数字:"+s);
//                } else if (('A' < c && c < 'Z') || ('a' < c && c < 'z')) {
//                    s += c;
//                    System.out.println("字母:"+s);
//
//                }
//
//            }
//
//        }
    }
}
