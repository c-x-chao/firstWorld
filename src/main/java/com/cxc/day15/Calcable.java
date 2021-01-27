package com.cxc.day15;

/**
 * @Author cxc
 * @Date 2021/1/3 22:39
 * @Version 1.0
 * @Email cxc_work@163.com
 */
@FunctionalInterface
public interface Calcable {
    //定义一个方法,传递一个整数,对整数进行绝对值计算
    int calsAbs(int number);
}
