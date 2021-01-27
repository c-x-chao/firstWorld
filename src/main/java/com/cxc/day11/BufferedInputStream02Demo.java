package com.cxc.day11;

import java.io.*;
import java.util.Arrays;

/**
 * @Author cxc
 * @Date 2020/12/21 22:13
 * @Version 1.0
 * @Email cxc_work@163.com
 * 字节缓冲输入流
 */
public class BufferedInputStream02Demo {
    public static void main(String[] args) throws IOException {
        show3();
        
    }

    /**
     * 文件复制
     * 利用缓冲流来实现
     */
    private static void show3() throws IOException {
        long start = System.currentTimeMillis();
        //创建文件输入流读取文件
        //创建文件缓冲输入流
        BufferedInputStream bi = new BufferedInputStream( new FileInputStream("C:\\Users\\13768238378\\Pictures\\Saved Pictures\\张靓颖.jpg"), 1024);

        //创建文件输出流  复制文件
        //创建缓冲输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\13768238378\\Pictures\\Saved Pictures\\张靓颖42.jpg"),1024);
      /*  int len = 0;
        while((len=bi.read())!=-1){
            bos.write(len);
        }*/

        byte[] bytes = new byte[1024];
        int len = 0;
        while((len=bi.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bos.close();
        bi.close();
        long end = System.currentTimeMillis();
        System.out.println("复制文件一共用了:"+(end-start));
    }

    /**
     * 文件复制
     * @throws IOException
     */
    private static void show2() throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("C:\\Users\\13768238378\\Pictures\\Saved Pictures\\张靓颖.jpg");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\13768238378\\Pictures\\Saved Pictures\\张靓颖42.jpg");
      /*  int len = fis.read();
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

    private static void show() throws IOException {
        //创建文件输入流
        FileInputStream fis = new FileInputStream("D:\\ideaWorkspace\\fistWorld\\src\\main\\java\\com\\cxc\\day11\\h.txt");
        BufferedInputStream bi = new BufferedInputStream(fis,1024);
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len=bi.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        bi.close();
    }
}
