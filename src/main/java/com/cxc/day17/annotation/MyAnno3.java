package com.cxc.day17.annotation;

import java.lang.annotation.*;

/**
 * @Author cxc
 * @Date 2021/1/6 22:44
 * @Version 1.0
 * @Email cxc_work@163.com
 *  * 元注解:主要四个:
 *  * @Target :描述注解能够作用的位置
 *      ElementType的取值:
 *          TYPE:类上
 *          METHOD:方法上
 *          FIELD:属性上
 *  * @Retention : 描述注解被保留的阶段
 *          @Retention(RetentionPolicy.RUNTIME) 当前被描述的注解会保留在class字节码文件中,并被jvm读取到
 *  * @Document : 描述注解是否被抽取到api文档中
 *  * @Inherited : 描述注解是否被子类继承
 */
@Target(value={ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MyAnno3 {
}
