package com.cxc.test;

import javafx.scene.input.DataFormat;

import javax.xml.transform.Source;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * @Author cxc
 * @Date 2020/12/3 21:11
 * @Version 1.0
 * @Email cxc_work@163.com
 */
public class Test4 {
    public static void main(String[] args) {
        Random random = new Random();
        String d = "";
        Date date = new Date();
        long ds = date.getTime();
        System.out.println(ds);
        System.out.println(System.currentTimeMillis());
        System.out.println(date);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dd = simpleDateFormat.format(date);
        System.out.println(dd);

        try {
            Date da = simpleDateFormat.parse("2020-12-03 21:34:10");
            System.out.println(da);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        c.set(Calendar.YEAR,2088);
        System.out.println("===================");
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println("=======================");
        c.add(Calendar.YEAR,-100);
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.getTime());

        StringBuilder sbu = new StringBuilder("abc");
        sbu.append("d");
        System.out.println(sbu);
        sbu.reverse();
        System.out.println(sbu);


    }
}
