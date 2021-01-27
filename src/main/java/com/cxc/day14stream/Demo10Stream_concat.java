package com.cxc.day14stream;

import java.util.stream.Stream;

/**
 * @Author cxc
 * @Date 2021/1/3 15:49
 * @Version 1.0
 * @Email cxc_work@163.com
 * 合并 两个流
 */
public class Demo10Stream_concat {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("张无忌", "张三丰", "李苏苏");
        Stream<String> stream2 = Stream.of("赵丽颖", "李师师", "貂蝉");
        Stream.concat(stream1,stream2).forEach(name-> System.out.println(name));
    }
}
