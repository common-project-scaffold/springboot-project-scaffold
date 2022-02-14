package org.lgd.scaffold.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * Project: springboot-project-scaffold
 * Package: org.lgd.scaffold.domain
 * Title: AuthUserInfo
 * Description: AuthUserInfo
 * </p>
 *
 * @Author liguodong
 * @Version 1.0.0
 * @Date 2022/2/14
 */

@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class AuthorizationInfo {

	private String userId;

	private String userName;

}
