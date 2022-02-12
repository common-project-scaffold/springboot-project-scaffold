package org.lgd.scaffold.service;

import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

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

}
