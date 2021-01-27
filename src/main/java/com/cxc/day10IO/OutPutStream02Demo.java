package com.cxc.day10IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author cxc
 * @Date 2020/12/18 23:06
 * @Version 1.0
 * @Email cxc_work@163.com
 * 一次写入多个字节
 */
public class OutPutStream02Demo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\ideaWorkspace\\fistWorld\\src\\main\\java\\com\\cxc\\day10IO\\b.txt");
//        byte[] bytes = {-65,-66,-67,68,69};
        byte[] bytes = "你好".getBytes();
        fos.write(bytes);
        fos.close();
    }
}
