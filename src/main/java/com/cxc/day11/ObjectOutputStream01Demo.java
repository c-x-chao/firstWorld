package com.cxc.day11;

import java.io.*;

/**
 * @Author cxc
 * @Date 2020/12/28 22:09
 * @Version 1.0
 * @Email cxc_work@163.com
 * 对象的序列化流
 * 以流的方式保存对象
 */
public class ObjectOutputStream01Demo  {
    public static void main(String[] args) throws IOException {
        show1();
    }

    /**
     * 序列化
     * @throws IOException
     */
    private static void show1() throws IOException {
        //创键序列化对象
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("D:\\ideaWorkspace\\fistWorld\\src\\main\\java\\com\\cxc\\day11\\f.txt"));
        //写入数据
        oos.writeObject(new Person("张三",18));
        //关闭
        oos.close();
    }

}
