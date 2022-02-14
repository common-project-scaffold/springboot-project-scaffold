package org.lgd.scaffold.domain.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>
 * Project: springboot-project-scaffold
 * Package: org.lgd.scaffold.domain.annotations
 * Title: 放在方法参数里，解析header里面的token,用户id等信息为参数对象
 * Description: RequestHeader
 * </p>
 *
 * @Author liguodong
 * @Version 1.0.0
 * @Date 2022/2/14
 */

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestToken {

}
