package com.cxc.day10IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @Author cxc
 * @Date 2020/12/18 23:21
 * @Version 1.0
 * @Email cxc_work@163.com
 * 追加写入数据
 */
public class OutputStream03Demo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\ideaWorkspace\\fistWorld\\src\\main\\java\\com\\cxc\\day10IO\\c.txt",true);
        fos.write("你好".getBytes());
        fos.write("\r\n".getBytes());
        fos.close();
    }
}
