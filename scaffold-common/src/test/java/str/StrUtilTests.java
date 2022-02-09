package str;

import cn.hutool.core.util.StrUtil;
import org.junit.Test;

/**
 * <p>
 * Project: springboot-project-scaffold Package: str Title: StrUtilTests Description: StrUtilTests
 * </p>
 *
 * @author liguodong
 * @version 1.0.0
 * @date 2022/1/28
 */

public class StrUtilTests {

	@Test
	public void test() {
		String imagePath = "/home/lgd/pic/xxx.jpg";

		String imageName = StrUtil.subAfter(imagePath, StrUtil.C_SLASH, true);
		System.out.println(imageName);

		String jsonName = StrUtil.subBefore(imageName, StrUtil.C_DOT, true) + ".json";
		System.out.println(jsonName);
	}

}
