package org.lgd.scaffold.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

/**
 * <p>
 *
 * @Project: springboot-project-scaffold
 * @Package: org.lgd.scaffold.common.config
 * @Title: SwaggerConfig
 * @Description: SwaggerConfig
 * </p>
 * @Author liguodong
 * @Version 1.0.0
 * @Date 2022/2/11
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	/**
	 * swagger 配置
	 * @return
	 */
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().apis(
				RequestHandlerSelectors.basePackage("org.lgd.scaffold")).paths(PathSelectors.any()).build().securitySchemes(
				securitySchemes()).securityContexts(securityContexts());
	}

	/**
	 * 配置认证模式
	 */
	private List<ApiKey> securitySchemes() {
		return newArrayList(new ApiKey("Authorization", "Authorization", "header"));
	}

	/**
	 * 配置认证上下文
	 */
	private List<SecurityContext> securityContexts() {
		return newArrayList(SecurityContext.builder()
		// 全局认证
		.securityReferences(defaultAuth())
		// 过滤要验证的路径
		.forPaths(PathSelectors.any()).build());
	}

	/**
	 * 全局认证
	 * @return
	 */
	private List<SecurityReference> defaultAuth() {
		AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
		AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
		authorizationScopes[0] = authorizationScope;
		// 验证增加
		return newArrayList(new SecurityReference("Authorization", authorizationScopes));
	}

	/**
	 * 项目信息
	 */
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("后端项目脚手架").description("后端项目脚手架接口描述").version("1.0.0").build();
	}
}
