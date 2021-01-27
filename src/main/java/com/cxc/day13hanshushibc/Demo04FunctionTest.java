package com.cxc.day13hanshushibc;

import java.util.function.Function;

/**
 * @Author cxc
 * @Date 2021/1/3 14:28
 * @Version 1.0
 * @Email cxc_work@163.com
 * ��ϰ:���к���ģ�͵�ƴ��
 * 1. ���ַ�����ȡ�������䲿��,�õ��ַ���
 * 2. ����һ���õ�������תΪint���͵�����
 * 3. ����һ����int���������ۼӵ�100
 */
public class Demo04FunctionTest {

    public static int getAge(String s, Function<String,String> fun1,Function<String,Integer> fun2,Function<Integer,Integer> fun3){
        return fun1.andThen(fun2).andThen(fun3).apply(s);

    }

    public static void main(String[] args) {
        String s = "����ӱ,25";
        int age = getAge(s, (str) -> str.split(",")[1], (str) -> Integer.parseInt(str), (i) -> i + 100);
        System.out.println(age);
    }
}
