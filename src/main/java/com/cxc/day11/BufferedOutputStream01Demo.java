package com.cxc.day11;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author cxc
 * @Date 2020/12/21 22:05
 * @Version 1.0
 * @Email cxc_work@163.com
 * 字节缓冲输出流
 */
public class BufferedOutputStream01Demo {
    public static void main(String[] args) throws IOException {
        show1();
    }

    private static void show1() throws IOException {
        //创建文件输出流对象
        FileOutputStream fos = new FileOutputStream("D:\\ideaWorkspace\\fistWorld\\src\\main\\java\\com\\cxc\\day11\\h.txt");
        //创建字节缓冲输出流
        BufferedOutputStream bos = new BufferedOutputStream(fos,1024);
        bos.write("把数据存储到缓冲流中把数据存储到缓冲流中把数据存储到缓冲流中把数据存储到缓冲流中把数据存储到缓冲流中把数据存储到缓冲流中把数据存储到缓冲流中".getBytes());
        bos.close();
    }
}
