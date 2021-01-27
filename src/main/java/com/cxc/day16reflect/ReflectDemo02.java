package com.cxc.day16reflect;

import java.lang.reflect.Field;

/**
 * @Author cxc
 * @Date 2021/1/5 22:52
 * @Version 1.0
 * @Email cxc_work@163.com
 * ����  ��Ա��������
 * ��ȡ��Ա����  getFields()  �˷�����ȡpublic���εĳ�Ա������
 * ��ȡָ����Ա����  getField()  �˷�����ȡpublic���εĳ�Ա������
 */
public class ReflectDemo02 {
    public static void main(String[] args) throws Exception {
        //��ȡPerson��class����
        Class personClass = Person.class;

        //��ȡ��Ա����  ֻ�ܻ�ȡpublic���ε�
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("=============================");

        //��ȡָ����Ա���� ֻ�ܻ�ȡpublic���ε�
        Field address = personClass.getField("address");
        System.out.println(address);

        System.out.println("================================");
        
        //��ȡ��Ա������ֵ
        Person person = new Person();
        Object value = address.get(person);
        System.out.println(value);


        System.out.println("=============================");
        //���ó�Ա������ֵ
        address.set(person,"���ļ�");
        System.out.println(person);


        System.out.println("=========================");

        //��ȡ��Ա����  �������η�
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        System.out.println("===========================");
        //����˽�����Ե�ֵ,�ᱨ��
        Field age = personClass.getDeclaredField("age");
        // ���Ժ��Է���Ȩ�����η��İ�ȫ���
        age.setAccessible(true);
        Object value2 = age.get(person);
        System.out.println(value2);



    }
}
