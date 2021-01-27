package com.cxc.day15;

/**
 * @Author cxc
 * @Date 2021/1/3 22:29
 * @Version 1.0
 * @Email cxc_work@163.com
 * 对象引用成员方法:
 * 前提:对象名已经存在 成员方法已经存在
 * 就可以使用对象名来引用成员方法
 */
public class Demo01ObjectMethodReference {
    public static void printString(Printable p){
        p.print("helloworld");
    }

    public static void main(String[] args) {
       /* printString((s)->{
            //创建MethodRerObject对象
            MethodRerObject obj = new MethodRerObject();
            obj.printUpperCaseString(s);
        });*/


        MethodRerObject obj = new MethodRerObject();
        //使用方法引用优化lambda
        printString(obj::printUpperCaseString);
    }
}
