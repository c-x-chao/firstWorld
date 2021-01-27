package com.cxc.day14stream;

import java.util.stream.Stream;

/**
 * @Author cxc
 * @Date 2021/1/3 15:25
 * @Version 1.0
 * @Email cxc_work@163.com
 * 过滤
 */
public class Demo05Stream_Filter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三","李四","王五","小六子","七仔","张翠山");
        stream.filter((name)->name.contains("张")).forEach((name)-> System.out.println(name));
    }
}
