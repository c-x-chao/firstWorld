package com.cxc.day16reflect;

import java.lang.reflect.Constructor;

/**
 * @Author cxc
 * @Date 2021/1/5 22:52
 * @Version 1.0
 * @Email cxc_work@163.com
 * ����  ��ȡ������
 */
public class ReflectDemo03 {
    public static void main(String[] args) throws Exception {
        //��ȡPerson��class����
        Class personClass = Person.class;
        Constructor constructor = personClass.getConstructor(String.class, int.class);
//        System.out.println(constructor);
        Object o = constructor.newInstance("����", 25);
        System.out.println(o);
    }
}
