package com.cxc.day11;

import java.io.*;

/**
 * @Author cxc
 * @Date 2020/12/28 22:09
 * @Version 1.0
 * @Email cxc_work@163.com
 * ��������л���
 * �����ķ�ʽ�������
 */
public class ObjectOutputStream01Demo  {
    public static void main(String[] args) throws IOException {
        show1();
    }

    /**
     * ���л�
     * @throws IOException
     */
    private static void show1() throws IOException {
        //�������л�����
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("D:\\ideaWorkspace\\fistWorld\\src\\main\\java\\com\\cxc\\day11\\f.txt"));
        //д������
        oos.writeObject(new Person("����",18));
        //�ر�
        oos.close();
    }

}
