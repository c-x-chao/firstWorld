package com.cxc.day03;

/**
 * @Author cxc
 * @Date 2020/11/29 22:02
 * @Version 1.0
 * @Email cxc_work@163.com
 */
public class Computer {
    public void powerOn() {
        System.out.println("笔记本开机");
    }

    public void powerOff() {
        System.out.println("笔记本关机");
    }

    public void useDevice(USB usb){
        usb.open();
        if(usb instanceof Mouse){
            ((Mouse) usb).click();
        }else if(usb instanceof Keyboard){
            ((Keyboard) usb).click();
        }
        usb.close();
    }
}

