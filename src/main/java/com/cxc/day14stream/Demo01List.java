package com.cxc.day14stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author cxc
 * @Date 2021/1/3 14:46
 * @Version 1.0
 * @Email cxc_work@163.com
 * �Լ����е����ݽ��й���  ʹ�ô�ͳ����
 */
public class Demo01List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("���޼�");
        list.add("����");
        list.add("С��");
        list.add("������");
        list.add("������");
        list.add("�żҽ���");

        List<String> listA = new ArrayList<>();
        //ֻҪ�ſ�ͷ��,��ŵ�һ��������
        for (String s : list) {
            if(s.contains("��")){
                listA.add(s);
            }
        }

        //ֻҪ�ſ�ͷ���ҳ���Ϊ3��
        List<String> listB = new ArrayList<>();
        for (String s : listA) {
            if(s.length()==3){
                listB.add(s);
            }
        }

        for (String s : listB) {
            System.out.println(s);
        }

    }
}
