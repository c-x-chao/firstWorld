package com.cxc.day07;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author cxc
 * @Date 2020/12/17 21:04
 * @Version 1.0
 * @Email cxc_work@163.com
 */
public class Demo01Arrays {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("柳岩", 25), new Person("赵丽颖", 24), new Person("范冰冰", 27)
        };
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        //使用lambda表达式
        Arrays.sort(arr, (o1, o2) -> o1.getAge() - o2.getAge());

        for (Person person : arr) {
            System.out.println(person);
        }
    }
}
