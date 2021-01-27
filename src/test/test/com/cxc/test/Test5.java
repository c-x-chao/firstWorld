package com.cxc.test;

/**
 * @Author cxc
 * @Date 2020/12/5 14:41
 * @Version 1.0
 * @Email cxc_work@163.com
 */
public class Test5 {
    // 使用final修饰的变量
    public final String str = "常量";

    // 使用static和final修饰的变量
    // 或者说成static修饰的常量
    public static final String str2 = "静态常量";

    // 直接位于类下面的变量,成为成员变量
    // 生命周期位于整个类,就是这个类调用这个成员变量都是有效的
    public String str3 = "成员变量";

    public void method() {
        // 位于方法内部的变量
        //生命周期位于方法内部,只能在方法内部调用,别的方法或者背的类直接调用不是可以的
        String str3 = "局部变量";
    }
}
