package com.cxc.day11;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @Author cxc
 * @Date 2020/12/28 22:18
 * @Version 1.0
 * @Email cxc_work@163.com
 * ����ķ����л���
 * �����ķ�ʽ��ȡ����
 * ǰ��:
 * �����ʵ�����л��ӿ�(���)
 * ClassNotFoundException  �ļ��������쳣
 */
public class ObjectInputStream01Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        show1();
    }

    /**
     * ����ķ����л���
     */
    private static void show1() throws IOException, ClassNotFoundException {
        //���������л�����
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\ideaWorkspace\\fistWorld\\src\\main\\java\\com\\cxc\\day11\\f.txt"));
        //��ȡ����
        Object o = ois.readObject();
        ois.close();
        System.out.println(o);
    }
}
