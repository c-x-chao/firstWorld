package com.cxc.day03;

/**
 * @Author cxc
 * @Date 2020/11/29 22:09
 * @Version 1.0
 * @Email cxc_work@163.com
 * 向上转型 向下转型  多态练习
 */
public class Demo2 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();

        USB usbMouse = new Mouse();
        computer.useDevice(usbMouse);

        Keyboard keyboard = new Keyboard();
        computer.useDevice(keyboard);

        computer.powerOff();
    }
}
