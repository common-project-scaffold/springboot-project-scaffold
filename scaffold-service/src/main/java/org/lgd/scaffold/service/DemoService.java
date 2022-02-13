package org.lgd.scaffold.service;

import cn.hutool.core.util.StrUtil;
import jodd.madvoc.meta.In;
import lombok.extern.slf4j.Slf4j;
import org.lgd.scaffold.domain.UserInfo;
import org.lgd.scaffold.domain.enums.StatusCodeEnum;
import org.lgd.scaffold.domain.exceptions.BusinessException;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * <p>
 * @Project: springboot-project-scaffold
 * @Package: org.exmaple.scaffold.service
 * @Title: DemoService
 * @Description: DemoService
 * </p>
 *
 * @author liguodong
 * @version 1.0.0
 * @date 2022/1/18
 */

@Slf4j
@Service
public class DemoService {

	/**
	 *
	 * @param name
	 * @return
	 */
	public String helloPreHandle(String name) {
		String result = StrUtil.trim(name);
		log.info("预处理完成，处理前：{}, 处理后：{}", name, result);
		return result;
	}

	/**
	 *
	 * @param type
	 * @return
	 */
	public String handleExceptionType(String type) {
		UserInfo userInfo = null;
		if (Objects.equals(type, "BusinessException")) {
			throw new BusinessException(StatusCodeEnum.fail.code(), "BusinessException处理");
		} else if (Objects.equals(type, "NullPointerException")) {
			// throw new NullPointerException("用户名不能为空");
			userInfo.getAge();
		} else if (Objects.equals(type, "Exception")) {
			Integer.parseInt("abc123");
		}
		return "正常流程";
	}

}
