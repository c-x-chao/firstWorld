package com.cxc.day13hanshushibc;

import java.util.function.Consumer;

/**
 * @Author cxc
 * @Date 2021/1/2 19:37
 * @Version 1.0
 * @Email cxc_work@163.com
 * ����ʽ�ӿڱ��
 * �����ͽӿ� consumer
 */
public class Demo02Consumer {
    /**
     * ����һ������,�����Ĳ�������һ���ַ���������
     * �����Ĳ�������Consumer�ӿ�,����ʹ��ΪString
     */
     public static void method(String name, Consumer<String> con){
         con.accept(name);
     }

    public static void main(String[] args) {
        method("����ӱ",(String name)->{
            //�Դ��ݵ��ַ�����������
//            System.out.println(name);//���ѷ�ʽ,ֱ������ַ���
            //���ѷ�ʽ:���ַ�����ת
            String rename = new StringBuilder(name).reverse().toString();
            System.out.println(rename);
        });
    }

}
