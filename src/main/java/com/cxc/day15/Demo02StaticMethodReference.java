package com.cxc.day15;

/**
 * @Author cxc
 * @Date 2021/1/3 22:37
 * @Version 1.0
 * @Email cxc_work@163.com
 * ͨ���������þ�̬��Ա����
 * ǰ��:���Ѿ�����,��̬��Ա�����Ѿ�����
 */
public class Demo02StaticMethodReference {
    //����һ������,�����Ĳ�������һ���ӿ� �������ֵ������
    public static int method(int number,Calcable c){
        return c.calsAbs(number);
    }

    public static void main(String[] args) {
        //����method����
        int i = method(-10, (n) -> {
            return Math.abs(n);
        });
        System.out.println(i);


        /*ʹ�÷��������Ż�lambda
         */
        int i1 = method(-11, Math::abs);
        System.out.println(i1);
    }
}
