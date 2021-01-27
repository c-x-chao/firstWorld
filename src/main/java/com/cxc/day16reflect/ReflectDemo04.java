package com.cxc.day16reflect;

import java.lang.reflect.Method;

/**
 * @Author cxc
 * @Date 2021/1/5 22:52
 * @Version 1.0
 * @Email cxc_work@163.com
 * 反射  获取成员方法
 */
public class ReflectDemo04 {
    public static void main(String[] args) throws Exception {
        //获取Person的class对象
        Class personClass = Person.class;

        //获取成员变量  只能获取public修饰的
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
