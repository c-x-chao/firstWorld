package com.cxc.day16reflect;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @Author cxc
 * @Date 2021/1/10 13:58
 * @Version 1.0
 * @Email cxc_work@163.com
 * 反射测试
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //1. 加载配置文件
        // 创建properties对象
        Properties properties = new Properties();
        // 加载配置文件,转换为一个集合
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        properties.load(is);

        // 2.获取配置文件中定义的数据
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        //3. 加载该类进内存
        Class cls = Class.forName(className);

        //4. 创建对象
        Object obj = cls.newInstance();

        // 5. 获取方法
        Method method = cls.getMethod(methodName);

        //6 执行方法
        method.invoke(obj);



    }
}
