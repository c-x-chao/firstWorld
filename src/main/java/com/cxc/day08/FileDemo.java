package com.cxc.day08;

import java.io.DataOutput;
import java.io.File;

/**
 * @Author cxc
 * @Date 2020/12/17 21:32
 * @Version 1.0
 * @Email cxc_work@163.com
 */
public class FileDemo {
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);

        char separatorChar = File.separatorChar;
        System.out.println(separatorChar);

        String separator = File.separator;
        System.out.println(separator);

        char pathSeparatorChar = File.pathSeparatorChar;
        System.out.println(pathSeparatorChar);



    }
}
