package org.lgd.scaffold.common.util;

import cn.hutool.core.util.StrUtil;

/**
 * <p>
 * @Project: springboot-project-scaffold
 * @Package: org.lgd.scaffold.common.util
 * @Title: CommonUtil
 * @Description: CommonUtil
 * </p>
 *
 * @Author liguodong
 * @Version 1.0.0
 * @Date 2022/2/11
 */

public class CommonUtil {

	private CommonUtil() {
	}

	/**
	 *
	 * @param name
	 * @return
	 */
	public static String strPreHandle(String name) {
		return StrUtil.trim(name);
	}

}
