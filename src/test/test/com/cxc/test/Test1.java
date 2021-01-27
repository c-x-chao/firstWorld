package com.cxc.test;

import java.lang.reflect.Array;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author cxc
 * @Date 2020/11/20 21:20
 * @Version 1.0
 * @Email cxc_work@163.com
 * 数组对称
 */
public class Test1 {
    public static void main(String[] args) {
        int[] arr = {20,30,40,50};
        for (int min = 0,max = arr.length-1; min < max; min++,max--) {
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
        }
        System.out.println("=======================");
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }


        System.out.println("=======================");
        System.out.println(Arrays.toString(arr));




    }
}
