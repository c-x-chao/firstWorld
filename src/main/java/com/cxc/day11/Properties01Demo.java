package com.cxc.day11;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @Author cxc
 * @Date 2020/12/21 21:19
 * @Version 1.0
 * @Email cxc_work@163.com
 * properties
 * store(OutputStream os,String comments) 可以报内存中的临时数据存储到硬盘中
 * store(Write w,String comments)
 * load(InputStream is)  可以把硬盘中的数据提取到内存中
 * load(Reader r)
 */
public class Properties01Demo {
    public static void main(String[] args) throws IOException {
      show2();
    }

    private static void show3() throws IOException {
        Properties prop = new Properties();
        FileReader fr = new FileReader("D:\\ideaWorkspace\\fistWorld\\src\\main\\java\\com\\cxc\\day10IO\\g.properties");
        prop.load(fr);
        fr.close();
        Set<String> propertyNames = prop.stringPropertyNames();
        for (String key : propertyNames) {
            String value = prop.getProperty(key);
            System.out.println(key+"="+value);
        }

    }

    private static void show2() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("赵丽颖","156");
        prop.setProperty("张靓颖","157");
        prop.setProperty("李亦非","158");

        //创建文件输出流对象
        FileWriter fw = new FileWriter("D:\\ideaWorkspace\\fistWorld\\src\\main\\java\\com\\cxc\\day10IO\\g.properties");
        prop.store(fw,"save data");
        fw.close();

    }

    private static void show1() {
        Properties prop = new Properties();
        prop.setProperty("赵丽颖","156");
        prop.setProperty("张靓颖","157");
        prop.setProperty("李亦非","158");
        Set<String> propertyNames = prop.stringPropertyNames();
        for (String key : propertyNames) {
            String value = prop.getProperty(key);
            System.out.println(key+"="+value);
        }
    }
}
