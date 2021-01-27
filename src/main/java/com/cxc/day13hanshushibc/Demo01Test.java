package com.cxc.day13hanshushibc;

import java.util.function.Supplier;

/**
 * @Author cxc
 * @Date 2021/1/2 19:28
 * @Version 1.0
 * @Email cxc_work@163.com
 * 使用supplier 接口作为参数类型,通过lambda 表达式求出int类型数组的最大值
 */
public class Demo01Test {
    //定义一个方法 获取int类型数组的最大值
    public static int getMax(Supplier<Integer> supplier){
        return supplier.get();
    }

    public static void main(String[] args) {
        //定义数组
        int[] arr  = {100,55,69,41,3,789};
        //调用
        int maxValue = getMax(()->{
           //获取数组的最大值
           int max = 0;
          //遍历数组,获取最大元素
            for (int i : arr) {
                if(i>max){
                    max = i;
                }
            }
            return max;
        });
        System.out.println(maxValue);
    }
}
