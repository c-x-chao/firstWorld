package com.cxc.day13hanshushibc;

import java.util.function.Function;

/**
 * @Author cxc
 * @Date 2021/1/3 14:05
 * @Version 1.0
 * @Email cxc_work@163.com
 * ����һ�����͵����ݵõ�һ�����͵�����
 */
public class Demo04FuntionApply {
    /**
     * ����һ������
     * �����Ĳ�������һ���ַ���������
     * �����Ĳ�������һ��function�ӿ�,�ӿڷ���Ϊ<String,Integer>
     *     ʹ��function�ӿ��еķ���apply();��string���͵�����ת��Ϊinteger������
     */
    public static void chnage(String s, Function<String,Integer> function){
        Integer in = function.apply(s);
        System.out.println(in);
    }

    public static void main(String[] args) {
        //����һ���ַ������͵�����
        String s = "100";
        chnage(s,(str)-> Integer.parseInt(str));
    }
}
