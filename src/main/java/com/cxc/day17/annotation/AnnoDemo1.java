package com.cxc.day17.annotation;

/**
 * @Author cxc
 * @Date 2021/1/6 22:28
 * @Version 1.0
 * @Email cxc_work@163.com
 * java �Դ��Ļ���ע�� 3��
 */

public class AnnoDemo1 {

    /**
     * ��дע��
     * @return
     */
    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * �ѹ�ʱע��
     */
    @Deprecated
    public void getMethod(){
        System.out.println("�˷����ѹ�ʱ");
    }

    /**
     * ���Ʊ���������ע��,ע�����һ��Ϊ "all"  һ�����������
     */
    @SuppressWarnings("all")
    public void getAge(){
        System.out.println("Ԥ�Ʊ���������ע��");
    }
}
