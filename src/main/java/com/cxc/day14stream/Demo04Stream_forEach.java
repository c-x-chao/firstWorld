package com.cxc.day14stream;

import java.util.stream.Stream;

/**
 * @Author cxc
 * @Date 2021/1/3 15:20
 * @Version 1.0
 * @Email cxc_work@163.com
 * Stream流中的终结方法
 */
public class Demo04Stream_forEach {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三","李四","王五","小六子","七仔");
        stream.forEach((name)-> System.out.println(name));
    }
}
