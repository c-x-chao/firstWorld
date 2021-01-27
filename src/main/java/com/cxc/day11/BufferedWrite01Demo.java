package com.cxc.day11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author cxc
 * @Date 2020/12/27 22:52
 * @Version 1.0
 * @Email cxc_work@163.com
 * 字符缓冲输出流
 * newLine() 写入一个行分隔符
 */
public class BufferedWrite01Demo {
    public static void main(String[] args) throws IOException {
        show();
    }

    private static void show() throws IOException {
        //创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\ideaWorkspace\\fistWorld\\src\\main\\java\\com\\cxc\\day11\\g.txt"));
        //调用缓冲输出流的方法
//        bw.write("张三家");
        for (int i = 0; i <20 ; i++) {
            bw.write("张三家"+i);
//            bw.write("\r\n");
            bw.newLine();
        }
        bw.close();
    }

}
