package com.cxc.day16reflect;

import java.lang.reflect.Field;

/**
 * @Author cxc
 * @Date 2021/1/5 22:52
 * @Version 1.0
 * @Email cxc_work@163.com
 * 反射  成员变量解释
 * 获取成员变量  getFields()  此方法获取public修饰的成员变量的
 * 获取指定成员变量  getField()  此方法获取public修饰的成员变量的
 */
public class ReflectDemo02 {
    public static void main(String[] args) throws Exception {
        //获取Person的class对象
        Class personClass = Person.class;

        //获取成员变量  只能获取public修饰的
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("=============================");

        //获取指定成员变量 只能获取public修饰的
        Field address = personClass.getField("address");
        System.out.println(address);

        System.out.println("================================");
        
        //获取成员变量的值
        Person person = new Person();
        Object value = address.get(person);
        System.out.println(value);


        System.out.println("=============================");
        //设置成员变量的值
        address.set(person,"李四家");
        System.out.println(person);


        System.out.println("=========================");

        //获取成员变量  忽略修饰符
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        System.out.println("===========================");
        //访问私有属性的值,会报错
        Field age = personClass.getDeclaredField("age");
        // 可以忽略访问权限修饰符的安全检查
        age.setAccessible(true);
        Object value2 = age.get(person);
        System.out.println(value2);



    }
}
