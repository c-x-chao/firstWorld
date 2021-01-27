package com.cxc.firstchapter.test;

/**
 * @Author cxc
 * @Date 2020/11/5 20:24
 * @Version 1.0
 * @Email cxc_work@163.com
 */
public class DoTest5 {
    public static void main(String[] args) {
        class DataOnly {
            int i;
            double d;
            boolean b;

            void show() {
                System.out.println(i);
                System.out.println(d);
                System.out.println(b);
            }
        }
        DataOnly dataOnly = new DataOnly();
        dataOnly.i = 4;
        dataOnly.d = 4.44;
        dataOnly.b = true;
        dataOnly.show();
    }
}
