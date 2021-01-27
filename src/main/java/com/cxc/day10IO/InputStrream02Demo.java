package com.cxc.day10IO;

import org.omg.CORBA.ARG_OUT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author cxc
 * @Date 2020/12/20 20:53
 * @Version 1.0
 * @Email cxc_work@163.com
 * 一次读取多个字节
 * 方法参数作用:
 * 方法的返回值:
 */
public class InputStrream02Demo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\ideaWorkspace\\fistWorld\\src\\main\\java\\com\\cxc\\day10IO\\b.txt ");
        byte[] bytes = new byte[2];
        int len = fis.read(bytes);
//        System.out.println(len);
//        System.out.println(new String(bytes));
//        len = fis.read(bytes);
//        System.out.println(len);
//        System.out.println(new String(bytes));
        while ((len = fis.read(bytes)) != -1) {
            System.out.println(new String(bytes));
        }

        fis.close();
    }
}
