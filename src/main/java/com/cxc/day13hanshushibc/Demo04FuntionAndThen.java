package com.cxc.day13hanshushibc;

import java.util.function.Function;

/**
 * @Author cxc
 * @Date 2021/1/3 14:15
 * @Version 1.0
 * @Email cxc_work@163.com
 * andThen  可以转换两次
 *
 * 需求: 把string类型"123" 转化为integer类型,把转换结果加10;
 *       把增加后的integer类型的数据,转化为string类型
 */
public class Demo04FuntionAndThen {
    /**
     * 进行两次类型转换
     * @param s
     * @param fun1
     * @param fun2
     */
    public static void change(String s, Function<String,Integer> fun1,Function<Integer,String> fun2){
     /*   Integer in = fun1.apply(s)+10;
        s = in+"";
        System.out.println(s);*/
        String ss = fun1.andThen(fun2).apply(s);
        System.out.println(ss);
    }

    public static void main(String[] args) {
        String s = "123";
        change(s,str->Integer.parseInt(str)+10,in->in+"");
    }
}
