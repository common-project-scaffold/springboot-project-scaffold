package org.lgd.scaffold.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {

	@ApiModelProperty(value = "姓名")
	private String name;

	@ApiModelProperty(value = "年龄")
	private Integer age;

}
