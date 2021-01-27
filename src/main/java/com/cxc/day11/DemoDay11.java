package com.cxc.day11;

import java.io.*;
import java.util.ArrayList;

/**
 * @Author cxc
 * @Date 2020/12/28 22:36
 * @Version 1.0
 * @Email cxc_work@163.com
 * ���л�����
 * ����һ��list����,����person�����л��������л�
 */
public class DemoDay11 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //��������
        ArrayList<Person> list = new ArrayList<>();
        //д������
        list.add(new Person("����",18));
        list.add(new Person("����",19));
        list.add(new Person("����",20));
        list.add(new Person("����ӱ",21));
        list.add(new Person("����",22));
        //�������л�������
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\ideaWorkspace\\fistWorld\\src\\main\\java\\com\\cxc\\day11\\list.txt"));
        oos.writeObject(list);
        
        //���������л�������
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\ideaWorkspace\\fistWorld\\src\\main\\java\\com\\cxc\\day11\\list.txt"));
        Object o = ois.readObject();
        ArrayList<Person> list1 = (ArrayList<Person>) o;
        for (Person person : list1) {
            System.out.println(person);
        }
        ois.close();
        oos.close();
    }
}
