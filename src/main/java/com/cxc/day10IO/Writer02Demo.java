package com.cxc.day10IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author cxc
 * @Date 2020/12/20 23:35
 * @Version 1.0
 * @Email cxc_work@163.com
 * 字符输出流
 */
public class Writer02Demo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\ideaWorkspace\\fistWorld\\src\\main\\java\\com\\cxc\\day10IO\\e.txt");
        fw.write("李四");
//    fw.close();
        fw.flush();
        fw.write("王五");
        fw.flush();
    }

}
