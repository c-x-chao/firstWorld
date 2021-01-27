package com.cxc.day08;

/**
 * @Author cxc
 * @Date 2020/12/18 21:33
 * @Version 1.0
 * @Email cxc_work@163.com
 * 使用递归求阶层 n = n*(n-1)*(n-2)*...*2*1
 */
public class DiGuiTest02 {
    public static void main(String[] args) {
        int product = getProduct(5 );
        System.out.println(product);

    }

    public static int getProduct(int n) {
        if (n == 1) {
            return 1;
        }
        return n * getProduct(n - 1);
    }
}
