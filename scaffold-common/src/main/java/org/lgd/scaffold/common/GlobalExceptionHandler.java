package org.lgd.scaffold.common;

import lombok.extern.slf4j.Slf4j;
import org.lgd.scaffold.domain.enums.StatusCodeEnum;
import org.lgd.scaffold.domain.exceptions.BusinessException;
import org.lgd.scaffold.domain.response.BaseResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * Project: springboot-project-scaffold
 * Package: org.lgd.scaffold.common
 * Title: GlobalExceptionHandler
 * Description: GlobalExceptionHandler
 * </p>
 *
 * @Author liguodong
 * @Version 1.0.0
 * @Date 2022/2/13
 */

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

	/**
	 * 处理 Exception 异常
	 *
	 * @param httpServletRequest httpServletRequest
	 * @param e                  异常
	 * @return
	 */
	@ResponseBody
	@ExceptionHandler(value = Exception.class)
	public BaseResponse exceptionHandler(HttpServletRequest httpServletRequest, Exception e) {
		log.error("发生未知异常！原因是:", e);
		return BaseResponse.error("未知异常");
	}

	/**
	 * 处理 BusinessException 异常
	 *
	 * @param httpServletRequest httpServletRequest
	 * @param e                  异常
	 * @return
	 */
	@ResponseBody
	@ExceptionHandler(value = BusinessException.class)
	public BaseResponse businessExceptionHandler(HttpServletRequest httpServletRequest, BusinessException e) {
		log.info("发生业务异常！原因是: code: {} , msg: {} ", e.getCode(), e.getMsg());
		return BaseResponse.customize(e.getCode(), e.getMsg(), null);
	}

	/**
	 * 处理空指针的异常
	 * @param req
	 * @param e
	 * @return
	 */
	@ExceptionHandler(value = NullPointerException.class)
	@ResponseBody
	public BaseResponse exceptionHandler(HttpServletRequest req, NullPointerException e) {
		log.error("发生空指针异常！原因是:", e);
		return BaseResponse.error(e.getMessage());
	}

}
