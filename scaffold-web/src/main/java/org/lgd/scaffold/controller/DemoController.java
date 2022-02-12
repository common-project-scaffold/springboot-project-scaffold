package org.lgd.scaffold.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.lgd.scaffold.common.util.CommonUtil;
import org.lgd.scaffold.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

/**
 * <p>
 * @Project: springboot-project-scaffold
 * @Package: org.exmaple.scaffold.controller
 * @Title: DemoController
 * @Description: DemoController
 * </p>
 *
 * @author liguodong
 * @version 1.0.0
 * @date 2022/1/17
 */

@Slf4j
@RestController
@Api(tags = "示例")
public class DemoController {

	@Autowired
	private DemoService demoService;

	/**
	 * 这是一个测试接口，<br/>
	 * 测试注释换行
	 *
	 * @param name 姓名
	 * @return 返回结果
	 */
	@GetMapping("/hello")
	@ApiOperation(value = "根据name查询打招呼", notes = "根据name查询给某人打招呼")
	public String hello(String name) {
		log.info("入参：{}", name);
		demoService.helloPreHandle(name);
		CommonUtil.strPreHandle(name);
		if (Objects.equals("Admin", name)) {
			// 是否超级管理员
			return String.format("hello, big boss", name);
		}
		// 测试代码格式化
		System.out.println("测试代码格式化");
		return String.format("hello,  %s", name);
	}

	/**
	 *
	 * @param httpRequest
	 * @return
	 */
	@GetMapping("/param")
	@ApiOperation(value = "解析header中的参数", notes = "解析header中的参数")
	public String param(HttpServletRequest httpRequest) {
		log.info(httpRequest.getQueryString());

		return httpRequest.getQueryString();
	}

}
