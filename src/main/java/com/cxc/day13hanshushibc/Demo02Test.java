package com.cxc.day13hanshushibc;

import java.util.function.Consumer;

/**
 * @Author cxc
 * @Date 2021/1/2 19:57
 * @Version 1.0
 * @Email cxc_work@163.com
 * ��ʽ����ӡ��
 * ���ո�ʽ ����:xx  �Ա�:xx �ĸ�ʽ��ӡ����
 */
public class Demo02Test {
    public static void main(String[] args) {
        String[] array = {"�����Ȱ�,Ů", "��������,Ů", "���»�,��"};
        printInfo(array, (s) -> System.out.print("����:" + s.split(",")[0]),
                (s) -> System.out.println("�Ա�:" + s.split(",")[1]));
    }

    public static void printInfo(String[] array, Consumer<String> con1, Consumer<String> con2) {
        for (String s : array) {
            con1.andThen(con2).accept(s);
        }
    }
}
