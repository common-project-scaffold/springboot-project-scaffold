package str;

import cn.hutool.core.io.FileUtil;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>
 * @Project: springboot-project-scaffold
 * @Package: str
 * @Title: StringTests
 * @Description: StringTests
 * </p>
 *
 * @author liguodong
 * @version 1.0.0
 * @date 2022/1/27
 */

// 此注解需要引入Log4j2相关包才能生效
@Log4j2
public class StringTests {

	@Test
	public void testConcat() {

		String basePath = "/home/guodong";
		String model = "model";

		String fileSep = FileUtil.FILE_SEPARATOR;
		log.info("分割：{}", fileSep);
		log.info("分割：{}", FileUtil.PATH_SEPARATOR);
		System.out.println(fileSep);
		System.out.println(FileUtil.PATH_SEPARATOR);

		System.out.println(String.format("%s/%s/%s", "/home/lgd", "model", "version"));
		Long projectId = 101L;

		System.out.println(String.format("%s/%s/%s", "/home/lgd", projectId, "model"));

	}

}
