package com.cxc.day17.annotation;

import java.lang.annotation.*;

/**
 * @Author cxc
 * @Date 2021/1/6 22:44
 * @Version 1.0
 * @Email cxc_work@163.com
 *  * Ԫע��:��Ҫ�ĸ�:
 *  * @Target :����ע���ܹ����õ�λ��
 *      ElementType��ȡֵ:
 *          TYPE:����
 *          METHOD:������
 *          FIELD:������
 *  * @Retention : ����ע�ⱻ�����Ľ׶�
 *          @Retention(RetentionPolicy.RUNTIME) ��ǰ��������ע��ᱣ����class�ֽ����ļ���,����jvm��ȡ��
 *  * @Document : ����ע���Ƿ񱻳�ȡ��api�ĵ���
 *  * @Inherited : ����ע���Ƿ�����̳�
 */
@Target(value={ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MyAnno3 {
}
