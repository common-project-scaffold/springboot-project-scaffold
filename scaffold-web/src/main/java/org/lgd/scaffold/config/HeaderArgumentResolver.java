package org.lgd.scaffold.config;

import org.lgd.scaffold.domain.AuthorizationInfo;
import org.lgd.scaffold.domain.annotations.RequestToken;
import org.lgd.scaffold.service.AuthService;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * <p>
 * Project: springboot-project-scaffold
 * Package: org.lgd.scaffold.common
 * Title: HeaderArgumentResolver
 * Description: HeaderArgumentResolver
 * </p>
 *
 * @Author liguodong
 * @Version 1.0.0
 * @Date 2022/2/14
 */

public class HeaderArgumentResolver implements HandlerMethodArgumentResolver {

	private AuthService authService;

	public HeaderArgumentResolver(AuthService authService) {
		this.authService = authService;
	}

	/**
	 * 是否校验参数，
	 * 1. 参数上有RequestToken注解；
	 * 2. 参数对象为{@link AuthorizationInfo};
	 * 若满足以上条件，则处理
	 * {@link HeaderArgumentResolver#resolveArgument(MethodParameter, ModelAndViewContainer, NativeWebRequest, WebDataBinderFactory)}方法
	 */
	@Override
	public boolean supportsParameter(MethodParameter parameter) {
		return parameter.hasParameterAnnotation(RequestToken.class)
				&& AuthorizationInfo.class.isAssignableFrom(parameter.getParameterType());
	}

	/**
	 * 对参数的处理
	 * 1. 读取header里面的参数
	 * 2. 去service中完成组装，然后返回出去
	 */
	@Override
	public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer,
			NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
		String token = webRequest.getHeader("Authorization");
		if (token == null) {
			throw new NullPointerException("token不能为空");
		}
		AuthorizationInfo userInfo = authService.getUserInfoByToken(token);
		return userInfo;
	}

}
