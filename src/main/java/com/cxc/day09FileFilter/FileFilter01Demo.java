package com.cxc.day09FileFilter;

import java.io.File;

/**
 * @Author cxc
 * @Date 2020/12/18 22:06
 * @Version 1.0
 * @Email cxc_work@163.com
 * 文件过滤器
 */
public class FileFilter01Demo {
    public static void main(String[] args) {
        File file = new File("D:\\BaiduNetdiskDownload\\new\\mybatis-generator-core\\mybatis-generator-core");
        getAllFile(file);
    }

    public static void getAllFile(File dir) {
        File[] files = dir.listFiles(new FileFilterImpl());
        for (File file : files) {
            if (file.isDirectory()) {
                getAllFile(file);
            } else {
                System.out.println(file);
            }
        }
    }
}
