package com.cxc.day13hanshushibc;

import java.util.function.Supplier;

/**
 * @Author cxc
 * @Date 2021/1/2 19:28
 * @Version 1.0
 * @Email cxc_work@163.com
 * ʹ��supplier �ӿ���Ϊ��������,ͨ��lambda ���ʽ���int������������ֵ
 */
public class Demo01Test {
    //����һ������ ��ȡint������������ֵ
    public static int getMax(Supplier<Integer> supplier){
        return supplier.get();
    }

    public static void main(String[] args) {
        //��������
        int[] arr  = {100,55,69,41,3,789};
        //����
        int maxValue = getMax(()->{
           //��ȡ��������ֵ
           int max = 0;
          //��������,��ȡ���Ԫ��
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
