package com.cxc.day08;

/**
 * @Author cxc
 * @Date 2020/12/18 21:29
 * @Version 1.0
 * @Email cxc_work@163.com
 * 使用递归求和 1-100
 */
public class DiGuiTest01 {
    public static void main(String[] args) {
        int n = 3;
        int sum = sum(3);
        System.out.println(sum);

    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
}
