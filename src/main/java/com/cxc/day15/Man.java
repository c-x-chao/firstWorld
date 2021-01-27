package com.cxc.day15;

/**
 * @Author cxc
 * @Date 2021/1/3 22:48
 * @Version 1.0
 * @Email cxc_work@163.com
 * 子类
 *
 * 使用supper引用类的成员方法
 * 前提: supper是已经存在的,父类的成员方法也是已经存在的
 * 所以我们可以直接引用supper的成员方法
 */
public class Man extends Human {
    @Override
    public void setHello() {
        System.out.println("hello,我是man");
    }

    /**
     * 定义一个方法,参数传递Greetable接口
     */
    public void method(Greetable g){
        g.greet();
    }

    public void show(){
       /* method(()->{
            Human human = new Human();
            human.setHello();
        });*/
        //因为有字符类关系,存在一个supper()
       /* method(()->{
            super.setHello();
        });*/

        method(super::setHello);
    }

    public static void main(String[] args) {
        new Man().show();
    }
}
