package com.cxc.day14stream;

import java.util.stream.Stream;

/**
 * @Author cxc
 * @Date 2021/1/3 15:29
 * @Version 1.0
 * @Email cxc_work@163.com
 * ”≥…‰
 */
public class Demo06Stream_map {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1","56","567","564","22","776");
        stream.map(s -> Integer.parseInt(s)).filter(i->i!=567).forEach(i-> System.out.println(i));
    }
}
