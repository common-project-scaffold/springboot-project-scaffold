package org.lgd.scaffold.domain.exceptions;

import lombok.Data;

/**
 * <p>
 * Project: springboot-project-scaffold
 * Package: org.lgd.scaffold.domain.exceptions
 * Title: 自定义业务异常类
 * Description: 自定义业务异常类
 * </p>
 *
 * @Author liguodong
 * @Version 1.0.0
 * @Date 2022/2/13
 */

@Data
public class BusinessException extends RuntimeException {

	private Integer code;

	private String msg;

	public BusinessException(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}
}
