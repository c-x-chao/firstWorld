package com.cxc.day10IO;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author cxc
 * @Date 2020/12/20 20:45
 * @Version 1.0
 * @Email cxc_work@163.com
 * 文件输入流
 */
public class InputStream01Demo {
    public static void main(String[] args) throws IOException {
        //创建文件输入流对象
        FileInputStream fis = new FileInputStream("D:\\ideaWorkspace\\fistWorld\\src\\main\\java\\com\\cxc\\day10IO\\a.txt");
       int len = 0;
        while((len=fis.read())!=-1){
            System.out.println((char)len);
        }
        fis.close();

    }
}
