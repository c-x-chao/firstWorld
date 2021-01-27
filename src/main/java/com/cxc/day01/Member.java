package com.cxc.day01;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author cxc
 * @Date 2020/11/25 22:52
 * @Version 1.0
 * @Email cxc_work@163.com
 */
public class Member extends User {

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list) {
        //随机抽取一个红包
        int index = new Random().nextInt(list.size());
        int delta = list.remove(index);
        int money = super.getMoney();
        super.setMoney(money+delta);
    }
}
