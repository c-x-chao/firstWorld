package com.cxc.day16reflect;

import java.lang.reflect.Method;

/**
 * @Author cxc
 * @Date 2021/1/5 22:52
 * @Version 1.0
 * @Email cxc_work@163.com
 * ����  ��ȡ��Ա����
 */
public class ReflectDemo04 {
    public static void main(String[] args) throws Exception {
        //��ȡPerson��class����
        Class personClass = Person.class;

        //��ȡ��Ա����  ֻ�ܻ�ȡpublic���ε�
        Method getmethods = personClass.getMethod("getmethod");
        Person person = new Person();
        getmethods.invoke(person);


        System.out.println("================================");
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            String name = method.getName();
            System.out.println(name);
        }

    }
}
