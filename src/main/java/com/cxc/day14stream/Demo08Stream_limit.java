package com.cxc.day14stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author cxc
 * @Date 2021/1/3 15:39
 * @Version 1.0
 * @Email cxc_work@163.com
 * 获取前几个数据
 * 延迟方法
 */
public class Demo08Stream_limit {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(13);
        list.add(134);
        list.add(31);
        list.add(341);
        list.add(155);
        list.add(1343);
        Stream<Integer> stream = list.stream();
        stream.limit(3).forEach(name -> System.out.println(name));
    }
}
