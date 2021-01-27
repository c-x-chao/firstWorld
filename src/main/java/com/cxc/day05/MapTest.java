package com.cxc.day05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author cxc
 * @Date 2020/12/13 15:49
 * @Version 1.0
 * @Email cxc_work@163.com
 * 使用map集合判断每一个字母出现的次数
 */
public class MapTest {
    public static void main(String[] args) {
//        String str = "asdfgsadfhwoibfsjdbfhhedijkadfgbsakjfbwjrtgwufbsudfbvhajskdfghbaskljghkowinmkmllmokjnl";
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String str = scanner.next();
        char[] chars = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (char aChar : chars) {
            if(map.containsKey(aChar)){
                int value = map.get(aChar);
                value++;
                map.put(aChar,value);
            }else{
                map.put(aChar,1);
            }
        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            System.out.println(entry);
        }


    }
}
