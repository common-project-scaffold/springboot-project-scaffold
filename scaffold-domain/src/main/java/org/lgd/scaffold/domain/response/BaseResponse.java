package org.lgd.scaffold.domain.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.lgd.scaffold.domain.enums.StatusCodeEnum;

/**
 *
 * <p>
 * @Project: springboot-project-scaffold
 * @Package: org.lgd.scaffold.domain
 * @Title: BaseReponse
 * @Description: BaseReponse
 * </p>
 *
 * @Author liguodong
 * @Version 1.0.0
 * @Date 2022/2/13
 */

@Data
@ApiModel(value = "响应体", description = "基础响应体对象")
public class BaseResponse<T> {

	@ApiModelProperty(value = "返回码", name = "code", required = true)
	private Integer code;

	@ApiModelProperty(value = "返回消息")
	private String message;

	@ApiModelProperty(value = "返回数据")
	private T data;

	private BaseResponse(Integer code, String message, T data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}

	/**
	 * 成功
	 * @param data
	 * @param <T>
	 * @return
	 */
	public static <T> BaseResponse success(T data) {
		return new BaseResponse(StatusCodeEnum.success.code(), StatusCodeEnum.success.desc(), data);
	}

	/**
	 * 失败
	 * @param message
	 * @param <T>
	 * @return
	 */
	public static <T> BaseResponse fail(String message) {
		return new BaseResponse(StatusCodeEnum.fail.code(), message, null);
	}

	/**
	 * 自定义
	 * @param code
	 * @param message
	 * @param data
	 * @param <T>
	 * @return
	 */
	public static <T> BaseResponse customize(Integer code, String message, T data) {
		return new BaseResponse(code, message, data);
	}

}
