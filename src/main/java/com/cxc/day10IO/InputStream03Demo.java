package com.cxc.day10IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author cxc
 * @Date 2020/12/20 22:48
 * @Version 1.0
 * @Email cxc_work@163.com
 * 文件复制
 */
public class InputStream03Demo {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("C:\\Users\\13768238378\\Pictures\\Saved Pictures\\张靓颖.jpg");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\13768238378\\Pictures\\Saved Pictures\\张靓颖37.jpg");
       /* int len = fis.read();
        while ((len = fis.read()) != -1) {
            fos.write(len);
        }*/
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len=fis.read(bytes))!= -1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println("复制文件一共用了:"+(end-start));
    }
}
