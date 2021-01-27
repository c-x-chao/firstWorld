package com.cxc.day03;

/**
 * @Author cxc
 * @Date 2020/11/29 20:48
 * @Version 1.0
 * @Email cxc_work@163.com
 * 多态联系
 *
 * 成员变量:编译看左边,运行看左边
 * 成员方法:编译看左边,运行看右边
 */
public class Demo1 {
    public static void main(String[] args) {
        //测试成员变量  有限使用等号左边的
        Fu obj = new Zi();
        System.out.println(obj.num);
        //子类如果没有覆盖重写此方法,优先使用父类的方法
        obj.shouNum();
        //子类如果重写了此方法,使用子类的(或者是使用等号边的new出来的对象)


        //编译看左  运行看右
        obj.method();
        obj.methodFu();
//        obj.methodZi();
    }
}
