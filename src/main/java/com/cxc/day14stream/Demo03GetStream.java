package com.cxc.day14stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * @Author cxc
 * @Date 2021/1/3 15:06
 * @Version 1.0
 * @Email cxc_work@163.com
 * 获取stream流的方式:
 * 1. 使用集合中的stream()方法;
 * 2. 使用功Stream中的静态方法 of();
 */
public class Demo03GetStream {
    public static void main(String[] args) {
        //把集合转换为stream流
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream = set.stream();

        Map<String,String> map = new HashMap<>();
        Set<String> set1 = map.keySet();
        Stream<String> stream2 = set.stream();

        //获取值
        Collection<String> collection = map.values();
        Stream<String> stream3 = collection.stream();

        //获取键值对
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Stream<Map.Entry<String, String>> stream4 = entrySet.stream();

        //数组
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);




    }
}
