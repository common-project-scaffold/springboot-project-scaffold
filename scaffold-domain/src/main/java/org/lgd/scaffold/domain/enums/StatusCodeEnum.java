package org.lgd.scaffold.domain.enums;

import lombok.Builder;
import lombok.Data;

/**
 * <p>
 * Project: springboot-project-scaffold
 * Package: org.lgd.scaffold.domain.enums
 * Title: StatusCodeEnum
 * Description: StatusCodeEnum
 * </p>
 *
 * @Author liguodong
 * @Version 1.0.0
 * @Date 2022/2/13
 */

public enum StatusCodeEnum implements IBaseEnum<Integer> {

	SUCCESS(10000, "成功"),
	ERROR(20000, "失败"), ;

	private Integer code;

	private String desc;

	StatusCodeEnum(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	/**
	 *
	 * @return
	 */
	@Override
	public Integer code() {
		return code;
	}

	/**
	 *
	 * @return
	 */
	@Override
	public String desc() {
		return desc;
	}
}
