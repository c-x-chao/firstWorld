package com.cxc.secondchapter.text;

/**
 * @Author cxc
 * @Date 2020/11/8 18:35
 * @Version 1.0
 * @Email cxc_work@163.com
 * java 别名机制
 */
public class Text3 {
    static void fm(Box x){
        x.f = 4.07024f;
    }

    public static void main(String[] args) {
        Box t = new Box();
        t.f = 4.0008f;
        System.out.println(t.f);
        fm(t);
        System.out.println(t.f);

    }
}
class Box{
    float f;
}

