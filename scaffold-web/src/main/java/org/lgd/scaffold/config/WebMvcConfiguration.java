package org.lgd.scaffold.config;

import org.lgd.scaffold.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * <p>
 * Project: springboot-project-scaffold
 * Package: org.lgd.scaffold.config
 * Title: WebMvcConfiguration
 * Description: WebMvcConfiguration
 * </p>
 *
 * @Author liguodong
 * @Version 1.0.0
 * @Date 2022/2/14
 */

@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

	@Autowired
	private AuthService authService;

	/**
	 * 设置参数转换器
	 */
	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
		resolvers.add(new HeaderArgumentResolver(authService));
	}

}
