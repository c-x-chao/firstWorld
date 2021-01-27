package com.cxc.day14stream;

import java.util.stream.Stream;

/**
 * @Author cxc
 * @Date 2021/1/3 15:25
 * @Version 1.0
 * @Email cxc_work@163.com
 * ����
 */
public class Demo05Stream_Filter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("����","����","����","С����","����","�Ŵ�ɽ");
        stream.filter((name)->name.contains("��")).forEach((name)-> System.out.println(name));
    }
}
