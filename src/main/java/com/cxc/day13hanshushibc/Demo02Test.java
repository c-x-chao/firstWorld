package com.cxc.day13hanshushibc;

import java.util.function.Consumer;

/**
 * @Author cxc
 * @Date 2021/1/2 19:57
 * @Version 1.0
 * @Email cxc_work@163.com
 * 格式化打印机
 * 按照格式 姓名:xx  性别:xx 的格式打印出来
 */
public class Demo02Test {
    public static void main(String[] args) {
        String[] array = {"迪丽热巴,女", "古力娜扎,女", "刘德华,男"};
        printInfo(array, (s) -> System.out.print("姓名:" + s.split(",")[0]),
                (s) -> System.out.println("性别:" + s.split(",")[1]));
    }

    public static void printInfo(String[] array, Consumer<String> con1, Consumer<String> con2) {
        for (String s : array) {
            con1.andThen(con2).accept(s);
        }
    }
}
