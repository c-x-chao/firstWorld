package com.cxc.day10IO;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author cxc
 * @Date 2020/12/20 23:49
 * @Version 1.0
 * @Email cxc_work@163.com
 * 字符输出流
 * 续写和换行
 */
public class Write03Demo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\ideaWorkspace\\fistWorld\\src\\main\\java\\com\\cxc\\day10IO\\f.txt",true);
        for (int i = 0; i <20 ; i++) {
            fw.write("第"+i+"次"+"\r\n");
        }
        fw.close();
    }
}
