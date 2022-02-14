package org.lgd.scaffold.controller;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.lgd.scaffold.common.util.CommonUtil;
import org.lgd.scaffold.domain.AuthorizationInfo;
import org.lgd.scaffold.domain.annotations.RequestToken;
import org.lgd.scaffold.domain.response.BaseResponse;
import org.lgd.scaffold.domain.UserInfo;
import org.lgd.scaffold.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public BaseResponse<String> hello(String name, @RequestToken AuthorizationInfo authorizationInfo) {
		log.info("入参：{}, 认证信息：{} ", name, JSONObject.toJSONString(authorizationInfo));
		demoService.helloPreHandle(name);
		CommonUtil.strPreHandle(name);
		if (Objects.equals("Admin", name)) {
			// 是否超级管理员
			return BaseResponse.success(String.format("hello, big boss", name));
		}
		// 测试代码格式化
		System.out.println("测试代码格式化");
		return BaseResponse.success(String.format("hello,  %s", name));
	}

	/**
	 *
	 * @param httpRequest
	 * @return
	 */
	@GetMapping("/param")
	@ApiOperation(value = "解析header中的参数", notes = "解析header中的参数")
	public BaseResponse<UserInfo> param(
			@ApiParam(name = "name", value = "姓名", required = true) @RequestParam(value = "name", defaultValue = "admin") String name,
			@ApiParam(name = "age", value = "年龄", required = true) @RequestParam(value = "age", defaultValue = "18") Integer age,
			HttpServletRequest httpRequest) {
		log.info(httpRequest.getQueryString());
		return BaseResponse.success(new UserInfo(name, age));
	}

	/**
	 *
	 * @param type
	 * @return
	 */
	@GetMapping("/exception")
	@ApiOperation(value = "全局异常处理接口", notes = "全局异常处理接口")
	public BaseResponse exception(
			@ApiParam(name = "type", value = "异常类型", required = true) @RequestParam(value = "type", defaultValue = "admin") String type) {
		log.info("异常类型：{}", type);
		return BaseResponse.success(demoService.handleExceptionType(type));
	}

}
