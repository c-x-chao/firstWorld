package com.cxc.day14stream;

import java.util.stream.Stream;

/**
 * @Author cxc
 * @Date 2021/1/3 15:49
 * @Version 1.0
 * @Email cxc_work@163.com
 * �ϲ� ������
 */
public class Demo10Stream_concat {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("���޼�", "������", "������");
        Stream<String> stream2 = Stream.of("����ӱ", "��ʦʦ", "����");
        Stream.concat(stream1,stream2).forEach(name-> System.out.println(name));
    }
}
