package com.cxc.day08;

import java.io.File;

/**
 * @Author cxc
 * @Date 2020/12/18 21:43
 * @Version 1.0
 * @Email cxc_work@163.com
 * 遍历文件夹的目录和及其文件(包括子文件、子文件夹)
 * 筛选
 */
public class File03Demo {
    public static void main(String[] args) {
        File file = new File("D:\\BaiduNetdiskDownload\\new\\mybatis-generator-core\\mybatis-generator-core");
        getAllFile(file);
    }

    public static void getAllFile(File dir) {
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                getAllFile(file);
            } else {
                if (file.toString().endsWith(".html")) {
                    System.out.println(file);
                }
            }
        }
    }
}
