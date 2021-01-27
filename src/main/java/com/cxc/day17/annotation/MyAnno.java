package com.cxc.day17.annotation;

/**
 * @Author cxc
 * @Date 2021/1/6 22:22
 * @Version 1.0
 * @Email cxc_work@163.com
 * 自定义注解:
 * 上部分:元注解
 * 下部分为:属性的定义
 *
 *
 * 元注解:主要四个:
 * @Target :描述注解能够作用的位置
 * @Retention : 描述注解被保留的阶段
 * @Document : 描述注解是否被抽取到api文档中
 * @Inherited : 描述注解是否被子类继承
 */
public @interface MyAnno {
    /**
     *属性的定义:
     * 基本类型
     * String类型
     * 注解类型
     * 枚举
     * 以上的所有数组
     */
    int value();
    String name();
    MyAnno2 myaoon2();
    Mj mj();
}
