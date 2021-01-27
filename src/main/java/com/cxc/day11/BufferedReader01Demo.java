package com.cxc.day11;

import java.io.*;

/**
 * @Author cxc
 * @Date 2020/12/27 23:00
 * @Version 1.0
 * @Email cxc_work@163.com
 * 字符缓冲输入流
 */
public class BufferedReader01Demo {
    public static void main(String[] args) throws IOException {
        show();
    }

    private static void show() throws IOException {
        //创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("D:\\ideaWorkspace\\fistWorld\\src\\main\\java\\com\\cxc\\day11\\g.txt"));
        while ((br.readLine())!=null){
            System.out.println(br.readLine());
        }
    }
}
