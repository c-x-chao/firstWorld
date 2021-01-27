package com.cxc.day11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @Author cxc
 * @Date 2020/12/27 23:43
 * @Version 1.0
 * @Email cxc_work@163.com
 * 字符转换输出流
 */
public class OutPutStreamWriter01Demo {


    public static void main(String[] args) throws IOException {
        show();
    }

    private static void show() throws IOException {
        //创建字符转换输出流对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\ideaWorkspace\\fistWorld\\src\\main\\java\\com\\cxc\\day11\\w.txt"), "GBK");
        //写数据
        osw.write("张三结婚了");
        osw.close();
    }
}
