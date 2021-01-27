package com.cxc.day13hanshushibc;

import java.util.function.Function;

/**
 * @Author cxc
 * @Date 2021/1/3 14:28
 * @Version 1.0
 * @Email cxc_work@163.com
 * 练习:进行函数模型的拼接
 * 1. 将字符串截取数字年龄部分,得到字符串
 * 2. 将上一步得到的年龄转为int类型的数字
 * 3. 将上一步的int类型数字累加到100
 */
public class Demo04FunctionTest {

    public static int getAge(String s, Function<String,String> fun1,Function<String,Integer> fun2,Function<Integer,Integer> fun3){
        return fun1.andThen(fun2).andThen(fun3).apply(s);

    }

    public static void main(String[] args) {
        String s = "赵丽颖,25";
        int age = getAge(s, (str) -> str.split(",")[1], (str) -> Integer.parseInt(str), (i) -> i + 100);
        System.out.println(age);
    }
}
