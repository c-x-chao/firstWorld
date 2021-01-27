package com.cxc.day03;

/**
 * @Author cxc
 * @Date 2020/11/29 22:06
 * @Version 1.0
 * @Email cxc_work@163.com
 */
public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }

    public void click(){
        System.out.println("点击鼠标");
    }
}
