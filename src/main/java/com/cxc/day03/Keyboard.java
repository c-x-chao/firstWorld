package com.cxc.day03;

/**
 * @Author cxc
 * @Date 2020/11/29 22:07
 * @Version 1.0
 * @Email cxc_work@163.com
 * 键盘
 */
public class Keyboard implements USB{
    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }
    public void click(){
        System.out.println("点击键盘");
    }
}
