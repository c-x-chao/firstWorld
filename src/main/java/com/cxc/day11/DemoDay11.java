package com.cxc.day11;

import java.io.*;
import java.util.ArrayList;

/**
 * @Author cxc
 * @Date 2020/12/28 22:36
 * @Version 1.0
 * @Email cxc_work@163.com
 * 序列化测试
 * 创建一个list集合,进行person的序列化、反序列化
 */
public class DemoDay11 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建集合
        ArrayList<Person> list = new ArrayList<>();
        //写入数据
        list.add(new Person("张三",18));
        list.add(new Person("李四",19));
        list.add(new Person("王五",20));
        list.add(new Person("赵丽颖",21));
        list.add(new Person("杨幂",22));
        //创建序列化流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\ideaWorkspace\\fistWorld\\src\\main\\java\\com\\cxc\\day11\\list.txt"));
        oos.writeObject(list);
        
        //创建反序列化流对象
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
