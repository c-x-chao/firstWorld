package com.cxc.day14stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * @Author cxc
 * @Date 2021/1/3 15:06
 * @Version 1.0
 * @Email cxc_work@163.com
 * ��ȡstream���ķ�ʽ:
 * 1. ʹ�ü����е�stream()����;
 * 2. ʹ�ù�Stream�еľ�̬���� of();
 */
public class Demo03GetStream {
    public static void main(String[] args) {
        //�Ѽ���ת��Ϊstream��
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream = set.stream();

        Map<String,String> map = new HashMap<>();
        Set<String> set1 = map.keySet();
        Stream<String> stream2 = set.stream();

        //��ȡֵ
        Collection<String> collection = map.values();
        Stream<String> stream3 = collection.stream();

        //��ȡ��ֵ��
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Stream<Map.Entry<String, String>> stream4 = entrySet.stream();

        //����
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);




    }
}
