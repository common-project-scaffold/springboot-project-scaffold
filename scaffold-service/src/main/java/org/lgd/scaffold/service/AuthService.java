package org.lgd.scaffold.service;

import lombok.extern.slf4j.Slf4j;
import org.lgd.scaffold.domain.AuthorizationInfo;
import org.springframework.stereotype.Service;

/**
 * <p>
 * Project: springboot-project-scaffold
 * Package: org.lgd.scaffold.service
 * Title: AuthService
 * Description: AuthService
 * </p>
 *
 * @Author liguodong
 * @Version 1.0.0
 * @Date 2022/2/14
 */

@Slf4j
@Service
public class AuthService {

	/**
	 * 查询用户信息
	 * @param token
	 * @return
	 */
	public AuthorizationInfo getUserInfoByToken(String token) {
		log.info("当前token为：{}", token);
		return AuthorizationInfo.builder().userId("xxx").userName("果冻").build();
	}

}
