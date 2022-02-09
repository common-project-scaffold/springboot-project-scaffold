package org.lgd.scaffold.controller;

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

public class DemoController {

	/**
	 * 这是一个测试接口，<br/>
	 * 测试注释换行
	 *
	 *
	 * @param name 姓名
	 * @return 返回结果
	 */
	public String hello(String name) {

		if (Objects.equals("Admin", name)) {
			// 是否超级管理员
			return String.format("hello, big boss", name);
		}
		return String.format("hello,  %s", name);
	}

}
