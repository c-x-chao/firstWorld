package com.cxc.firstchapter.test;


/**
 * @Author cxc
 * @Date 2020/11/5 20:11
 * @Version 1.0
 * @Email cxc_work@163.com
 */
public class AtnTest {
    public static void main(String[] args){
        class AtypeName{
            int i;
            double d;
            boolean b;
            void show(){
                System.out.println(i);
                System.out.println(d);
                System.out.println(b);
            }
        }
        AtypeName atypeName = new AtypeName();
        atypeName.i = 47;
        atypeName.d = 1.1;
        atypeName.b = false;
        atypeName.show();
    }
}
