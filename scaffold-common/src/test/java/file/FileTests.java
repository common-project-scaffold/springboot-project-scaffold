package file;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ZipUtil;
import org.junit.Test;

import java.io.File;
import java.util.List;

/**
 * <p>
 * Project: springboot-project-scaffold Package: file Title: FileTests Description: FileTests
 * </p>
 *
 * @author liguodong
 * @version 1.0.0
 * @date 2022/1/28
 */

public class FileTests {

	@Test
	public void test() {
		String dir = "/User/liguodong";
		List<File> files = FileUtil.loopFiles(dir);

	}

}
