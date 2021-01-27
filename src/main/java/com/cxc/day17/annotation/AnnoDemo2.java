package com.cxc.day17.annotation;

/**
 * @Author cxc
 * @Date 2021/1/6 22:35
 * @Version 1.0
 * @Email cxc_work@163.com
 * 使用自定义注解 需要初始化
 */
@MyAnno(value=2,name="张三",myaoon2 = @MyAnno2,mj=Mj.p1)
@MyAnno3
public class AnnoDemo2 {
    @MyAnno3
    private String name = "zhangsan";

    @MyAnno3
    public void getMethod(){

    }
}
