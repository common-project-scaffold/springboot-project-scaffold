package org.lgd.scaffold.domain.enums;

/**
 * <p>
 * Project: springboot-project-scaffold
 * Package: org.lgd.scaffold.domain.enums
 * Title: IBaseEnum
 * Description: IBaseEnum
 * </p>
 *
 * @Author liguodong
 * @Version 1.0.0
 * @Date 2022/2/14
 */

public interface IBaseEnum<T> {

	/**
	 * 枚举码
	 * @return
	 */
	T code();

	/**
	 * 枚举描述
	 * @return
	 */
	String desc();
}
