package com.cxc.test;

import java.util.*;

/**
 * @Author cxc
 * @Date 2020/12/8 22:34
 * @Version 1.0
 * @Email cxc_work@163.com
 */
public class Test7 {
    public static void main(String[] args) {
        String str  = "";
        StringBuilder stringBuilder = new StringBuilder();

        Collection collection = new ArrayList();

        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,5,7,4,3,9,8);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        HashSet<String> set = new HashSet<>();

        Map<String,String> map = new HashMap<>();
    }

}
