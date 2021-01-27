package com.cxc.day10IO;

import java.io.FileReader;
import java.io.IOException;

/**
 * @Author cxc
 * @Date 2020/12/20 23:15
 * @Version 1.0
 * @Email cxc_work@163.com
 * 字符输入流  磁盘-->内存中
 */
public class Reader01Demo {
    public static void main(String[] args) throws IOException {
        //创建字符输入流对象
        FileReader fr = new FileReader("D:\\ideaWorkspace\\fistWorld\\src\\main\\java\\com\\cxc\\day10IO\\c.txt");
        int len = 0;
        //一次性读入一个字符
       /* while ((len = fr.read()) != -1) {
            System.out.println((char)len);
        }*/

        //一次性读入多个字符
        char[] chars = new char[1024];
        while((len = fr.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }
        fr.close();
    }
}
