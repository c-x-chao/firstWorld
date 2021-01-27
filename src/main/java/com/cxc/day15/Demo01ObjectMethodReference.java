package com.cxc.day15;

/**
 * @Author cxc
 * @Date 2021/1/3 22:29
 * @Version 1.0
 * @Email cxc_work@163.com
 * �������ó�Ա����:
 * ǰ��:�������Ѿ����� ��Ա�����Ѿ�����
 * �Ϳ���ʹ�ö����������ó�Ա����
 */
public class Demo01ObjectMethodReference {
    public static void printString(Printable p){
        p.print("helloworld");
    }

    public static void main(String[] args) {
       /* printString((s)->{
            //����MethodRerObject����
            MethodRerObject obj = new MethodRerObject();
            obj.printUpperCaseString(s);
        });*/


        MethodRerObject obj = new MethodRerObject();
        //ʹ�÷��������Ż�lambda
        printString(obj::printUpperCaseString);
    }
}
