package com.cxc.day14stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author cxc
 * @Date 2021/1/3 15:36
 * @Version 1.0
 * @Email cxc_work@163.com
 * 终结方法  不能再继续使用stream流的其他方法了
 */
public class Demo07Stream_count {
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
        long count = stream.count();
        System.out.println(count);

    }
}
