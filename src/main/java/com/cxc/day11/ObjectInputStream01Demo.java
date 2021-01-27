package com.cxc.day11;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @Author cxc
 * @Date 2020/12/28 22:18
 * @Version 1.0
 * @Email cxc_work@163.com
 * 对象的反序列化流
 * 以流的方式读取对象
 * 前提:
 * 类必须实现序列化接口(标记)
 * ClassNotFoundException  文件不存在异常
 */
public class ObjectInputStream01Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        show1();
    }

    /**
     * 对象的反序列化流
     */
    private static void show1() throws IOException, ClassNotFoundException {
        //创建反序列化对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\ideaWorkspace\\fistWorld\\src\\main\\java\\com\\cxc\\day11\\f.txt"));
        //读取对象
        Object o = ois.readObject();
        ois.close();
        System.out.println(o);
    }
}
