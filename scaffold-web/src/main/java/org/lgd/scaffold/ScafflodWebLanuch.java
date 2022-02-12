package org.lgd.scaffold;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * <p>
 *
 * @Project: springboot-project-scaffold
 * @Package: org.exmaple.scaffold
 * @Title: ScafflodLanuch
 * @Description: ScafflodLanuch
 * </p>
 *
 * @author liguodong
 * @version 1.0.0
 * @date 2022/1/17
 */

@SpringBootApplication(scanBasePackages = { "org.lgd.scaffold" })
@Configuration
@EnableScheduling
// 启动异步调用
@EnableAsync
@Slf4j
public class ScafflodWebLanuch {

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ScafflodWebLanuch.class, args);
	}

}
