package com.cxc.day14stream;

import java.util.stream.Stream;

/**
 * @Author cxc
 * @Date 2021/1/3 15:44
 * @Version 1.0
 * @Email cxc_work@163.com
 * ����ǰ����
 * �ӳٷ���
 */
public class Demo09Stream_skip {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("���޼�", "������", "������");
        stream.skip(1).forEach(name-> System.out.println(name));
    }
}
