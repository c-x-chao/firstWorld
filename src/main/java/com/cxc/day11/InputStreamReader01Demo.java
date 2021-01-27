package com.cxc.day11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author cxc
 * @Date 2020/12/27 23:54
 * @Version 1.0
 * @Email cxc_work@163.com
 * �ֽ�����ת����
 */
public class InputStreamReader01Demo {
    public static void main(String[] args) throws IOException {
        show();
    }

    private static void show() throws IOException {
        //�����ֽ�����ת��������
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\ideaWorkspace\\fistWorld\\src\\main\\java\\com\\cxc\\day11\\w.txt"),"GBK");
        int len = 0;
//        char[] chars = new char[1024];
        while((len=isr.read())!=-1){
            System.out.println((char)len);
        }
        isr.close();
    }
}
