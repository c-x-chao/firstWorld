package com.cxc.test;

import java.util.Arrays;

/**
 * @Author cxc
 * @Date 2020/11/24 21:37
 * @Version 1.0
 * @Email cxc_work@163.com
 */
public class Test3 {
    public static void main(String[] args) {
        int[] ints = {5,8,9,5,6,2,4,7};
        int[]intsb = new int[ints.length];
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            int num = ints[i];
            for (int j = 0; j < ints.length; j++) {
                if(num>ints[j]){
                    count++;
                }
            }
            intsb[i]=count;
            count=0;
        }
        System.out.println(Arrays.toString(intsb));
    }
}
