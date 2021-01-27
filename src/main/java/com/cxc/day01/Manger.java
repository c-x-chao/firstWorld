package com.cxc.day01;

import java.util.ArrayList;

/**
 * @Author cxc
 * @Date 2020/11/25 22:54
 * @Version 1.0
 * @Email cxc_work@163.com
 * 群主
 */
public class Manger extends User {

    public Manger(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        ArrayList<Integer> list = new ArrayList<>();
        //先判断发送的红包的钱是否够用
        int leftMoney = super.getMoney();
        if (totalMoney > leftMoney) {
            System.out.println("余额不足!");
            return list;
        }
        //扣钱
        super.setMoney(leftMoney - totalMoney);

        int avg = totalMoney / count;
        int mode = totalMoney % count;
        for (int i = 0; i < count - 1; i++) {
            list.add(avg);
        }
        int last = avg + mode;
        list.add(last);

        return list;
    }
}
