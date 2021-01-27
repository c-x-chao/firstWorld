package com.cxc.day14stream;

import java.util.stream.Stream;

/**
 * @Author cxc
 * @Date 2021/1/3 15:44
 * @Version 1.0
 * @Email cxc_work@163.com
 * 跳过前几次
 * 延迟方法
 */
public class Demo09Stream_skip {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张无忌", "张三丰", "李苏苏");
        stream.skip(1).forEach(name-> System.out.println(name));
    }
}
