package com.cxc.day14stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author cxc
 * @Date 2021/1/3 14:54
 * @Version 1.0
 * @Email cxc_work@163.com
 * 使用stream流的形式,对集合进行过滤
 * stream 是jdk1.8之后出现的
 *
 * 属于管道流  只能被消费一次  调用完毕之后,数据就会流转到下一个stream中  使用完毕之后就关闭了
 */
public class Demo02Stream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("赵敏");
        list.add("小昭");
        list.add("周芷若");
        list.add("张三丰");
        list.add("张家界诶");

        list.stream()
                .filter(name->name.startsWith("张"))
                .filter(name->name.length()==3)
                .forEach(name-> System.out.println(name));
    }
}
