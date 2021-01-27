package com.cxc.day10IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author cxc
 * @Date 2020/12/18 22:49
 * @Version 1.0
 * @Email cxc_work@163.com
 * 文件输出流 写一个字节
 */
public class OutPutStream01Demo {
    public static void main(String[] args) {
        //创建文件输出流对象
        try {
            FileOutputStream fos = new FileOutputStream("D:\\ideaWorkspace\\fistWorld\\src\\main\\java\\com\\cxc\\day10IO\\a.txt ");
            fos.write(97);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
