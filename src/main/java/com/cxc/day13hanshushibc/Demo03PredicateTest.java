package com.cxc.day13hanshushibc;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @Author cxc
 * @Date 2021/1/2 20:44
 * @Version 1.0
 * @Email cxc_work@163.com
 * 练习:打印出四个字,女生  满足返回到arrayList<>集合中
 */
public class Demo03PredicateTest {
    public static ArrayList<String> filter(String[] array, Predicate<String> p1, Predicate<String> p2) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : array) {
            boolean b = p1.and(p2).test(s);
            if (b) {
                list.add(s);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] array = {"迪丽热巴,女", "古力娜扎,女", "刘德华,男", "马尔咋哈化,女"};
        ArrayList<String> list = filter(array, (str) -> str.split(",")[0].length() == 4,
                (str) -> str.split(",")[1].equals("女"));
        for (String s : list) {
            System.out.println(s);
        }
    }
}