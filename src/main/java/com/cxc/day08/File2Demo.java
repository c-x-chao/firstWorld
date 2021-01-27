package com.cxc.day08;

import java.io.File;

/**
 * @Author cxc
 * @Date 2020/12/17 23:21
 * @Version 1.0
 * @Email cxc_work@163.com
 */
public class File2Demo {
    public static void main(String[] args) {
        File file = new File("D:\\BaiduNetdiskDownload\\new\\mybatis-generator-core\\mybatis-generator-core\\docs\\configreference");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);

        }


    }
}
