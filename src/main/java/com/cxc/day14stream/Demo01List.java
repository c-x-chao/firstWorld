package com.cxc.day14stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author cxc
 * @Date 2021/1/3 14:46
 * @Version 1.0
 * @Email cxc_work@163.com
 * 对集合中的数据进行过滤  使用传统集合
 */
public class Demo01List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("赵敏");
        list.add("小昭");
        list.add("周芷若");
        list.add("张三丰");
        list.add("张家界诶");

        List<String> listA = new ArrayList<>();
        //只要张开头的,存放到一个集合中
        for (String s : list) {
            if(s.contains("张")){
                listA.add(s);
            }
        }

        //只要张开头的且长度为3的
        List<String> listB = new ArrayList<>();
        for (String s : listA) {
            if(s.length()==3){
                listB.add(s);
            }
        }

        for (String s : listB) {
            System.out.println(s);
        }

    }
}
