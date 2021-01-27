package com.cxc.day14stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author cxc
 * @Date 2021/1/3 14:54
 * @Version 1.0
 * @Email cxc_work@163.com
 * ʹ��stream������ʽ,�Լ��Ͻ��й���
 * stream ��jdk1.8֮����ֵ�
 *
 * ���ڹܵ���  ֻ�ܱ�����һ��  �������֮��,���ݾͻ���ת����һ��stream��  ʹ�����֮��͹ر���
 */
public class Demo02Stream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("���޼�");
        list.add("����");
        list.add("С��");
        list.add("������");
        list.add("������");
        list.add("�żҽ���");

        list.stream()
                .filter(name->name.startsWith("��"))
                .filter(name->name.length()==3)
                .forEach(name-> System.out.println(name));
    }
}
