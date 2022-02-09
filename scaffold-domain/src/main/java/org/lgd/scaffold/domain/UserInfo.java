package org.lgd.scaffold.domain;

import lombok.Data;

/**
 *
 * @Project: springboot-project-scaffold
 * @Package: org.lgd.scaffold.domain
 * @Title: UserInfo
 * @Description: UserInfo
 *
 * @author liguodong
 * @version 1.0.0
 * @date 2022/2/9
 */

@Data
public class UserInfo {

	// 姓名
	private String name;

	/**
	 * 年龄
	 */
	private Integer age;

}
