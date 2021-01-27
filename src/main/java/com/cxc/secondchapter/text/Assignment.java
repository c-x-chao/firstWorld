package com.cxc.secondchapter.text;

/**
 * @Author cxc
 * @Date 2020/11/8 17:39
 * @Version 1.0
 * @Email cxc_work@163.com
 */
public class Assignment {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
//        System.out.println("t1.level:"+t1.level);
//        System.out.println("t2.level:"+t2.level);
//        //对象的赋值,由t2指向t1,所以t1和t2指向同一个地址,值相等
//        t1 = t2;
//        System.out.println("t1.level:"+t1.level);
//        System.out.println("t2.level:"+t2.level);
//        t1.level = 27;
//        System.out.println("t1.level:"+t1.level);
//        System.out.println("t2.level:"+t2.level);


        //以上都是对象赋值   引用地址相等
        //如果想要值相等,对象不一样(对象相互不影响)
        t1.level = t2.level;
        System.out.println("t1.level:"+t1.level);
        System.out.println("t2.level:"+t2.level);
        t1.level = 27;
        System.out.println("t1.level:"+t1.level);
        System.out.println("t2.level:"+t2.level);
    }

}
class Tank{
    int level;
}