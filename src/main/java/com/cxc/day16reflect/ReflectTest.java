package com.cxc.day16reflect;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @Author cxc
 * @Date 2021/1/10 13:58
 * @Version 1.0
 * @Email cxc_work@163.com
 * �������
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //1. ���������ļ�
        // ����properties����
        Properties properties = new Properties();
        // ���������ļ�,ת��Ϊһ������
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        properties.load(is);

        // 2.��ȡ�����ļ��ж��������
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        //3. ���ظ�����ڴ�
        Class cls = Class.forName(className);

        //4. ��������
        Object obj = cls.newInstance();

        // 5. ��ȡ����
        Method method = cls.getMethod(methodName);

        //6 ִ�з���
        method.invoke(obj);



    }
}
