package com.cxc.day15;

/**
 * @Author cxc
 * @Date 2021/1/3 22:48
 * @Version 1.0
 * @Email cxc_work@163.com
 * ����
 *
 * ʹ��supper������ĳ�Ա����
 * ǰ��: supper���Ѿ����ڵ�,����ĳ�Ա����Ҳ���Ѿ����ڵ�
 * �������ǿ���ֱ������supper�ĳ�Ա����
 */
public class Man extends Human {
    @Override
    public void setHello() {
        System.out.println("hello,����man");
    }

    /**
     * ����һ������,��������Greetable�ӿ�
     */
    public void method(Greetable g){
        g.greet();
    }

    public void show(){
       /* method(()->{
            Human human = new Human();
            human.setHello();
        });*/
        //��Ϊ���ַ����ϵ,����һ��supper()
       /* method(()->{
            super.setHello();
        });*/

        method(super::setHello);
    }

    public static void main(String[] args) {
        new Man().show();
    }
}
