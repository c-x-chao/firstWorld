package com.cxc.day04;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author cxc
 * @Date 2020/12/4 22:00
 * @Version 1.0
 * @Email cxc_work@163.com
 * 斗地主
 */
public class Doudizhu {
    public static void main(String[] args) {
        //准备牌
        ArrayList<String> poker = new ArrayList<>();
        //定义两个数组,一个存储花色,一个存储序号
        String[] colors = {"♥","♠","♣","♦"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        poker.add("大王");
        poker.add("小王");
        for (String number : numbers) {
            for (String color : colors) {
                poker.add(color+number);
            }
        }
        System.out.println(poker);
        //洗牌
        Collections.shuffle(poker);
        System.out.println(poker);

        //发牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            String s = poker.get(i);
            if(i>=51){
                dipai.add(s);
            }
            if(i%3==0){
                player1.add(s);
            }
            if(i%3==1){
                player2.add(s);
            }
            if(i%3==2){
                player3.add(s);
            }
        }
        System.out.println("刘德华:"+player1);
        System.out.println("张学友:"+player2);
        System.out.println("郭富城:"+player3);
        System.out.println("黎明:"+dipai);
    }
}
