package com.cxc.day17.annotation;

/**
 * @Author cxc
 * @Date 2021/1/6 22:22
 * @Version 1.0
 * @Email cxc_work@163.com
 * �Զ���ע��:
 * �ϲ���:Ԫע��
 * �²���Ϊ:���ԵĶ���
 *
 *
 * Ԫע��:��Ҫ�ĸ�:
 * @Target :����ע���ܹ����õ�λ��
 * @Retention : ����ע�ⱻ�����Ľ׶�
 * @Document : ����ע���Ƿ񱻳�ȡ��api�ĵ���
 * @Inherited : ����ע���Ƿ�����̳�
 */
public @interface MyAnno {
    /**
     *���ԵĶ���:
     * ��������
     * String����
     * ע������
     * ö��
     * ���ϵ���������
     */
    int value();
    String name();
    MyAnno2 myaoon2();
    Mj mj();
}
