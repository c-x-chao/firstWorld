package com.cxc.day13hanshushibc;

import java.util.function.Supplier;

/**
 * @Author cxc
 * @Date 2021/1/2 19:21
 * @Version 1.0
 * @Email cxc_work@163.com
 * ����ʽ�ӿ�
 * ���������ݽӿ�
 */
public class Demo01Supplier {
    //����һ������ ��������supperiler<T>,����ΪString,ִ��get����,����һ��String
    public static String getString(Supplier<String> supplier){
        return  supplier.get();
    }

    public static void main(String[] args) {
        String s = getString(()-> "����ӱ");
        System.out.println(s);

    }
}
