package com.cxc.day13hanshushibc;

import java.util.function.Consumer;

/**
 * @Author cxc
 * @Date 2021/1/2 19:45
 * @Version 1.0
 * @Email cxc_work@163.com
 * consumer Ĭ�Ϸ��� andthen
 * ����:��Ҫ����consumer�ӿ� ���԰�����consumer�ӿ������һ��,�����ݽ�������
 */
public class Demo02AndThen {
    public static void method(String s,Consumer<String> con1,Consumer<String> con2){
//        con1.accept(s);
//        con2.accept(s);
        con1.andThen(con2).accept(s);
    }

    public static void main(String[] args) {
        method("Hello",(String name)->{
            System.out.println(name.toUpperCase());
        },(String name)->{
            System.out.println(name.toLowerCase());
        });
    }
}
