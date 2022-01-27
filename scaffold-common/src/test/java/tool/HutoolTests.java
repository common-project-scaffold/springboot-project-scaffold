package tool;

import cn.hutool.core.io.FileUtil;

import cn.hutool.json.JSONObject;
import org.junit.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * Project: springboot-project-scaffold
 * Package: tool
 * Title: HutoolTests
 * Description: HutoolTests
 * </p>
 *
 * @author liguodong
 * @version 1.0.0
 * @date 2022/1/26
 */


public class HutoolTests {

    String basePath = "/Users/liguodong/temp/file";

    @Test
    public void testmMkdir(){
        String datasetPath = basePath + FileUtil.FILE_SEPARATOR + 55;

        FileUtil.mkdir(datasetPath);
        String datasetVersionPath = basePath + FileUtil.FILE_SEPARATOR + 55 + FileUtil.FILE_SEPARATOR + 101;
        String datasetVersionPath2 = basePath + FileUtil.FILE_SEPARATOR + 55 + FileUtil.FILE_SEPARATOR + 102;
        String datasetVersionPath3 = basePath + FileUtil.FILE_SEPARATOR + 55 + FileUtil.FILE_SEPARATOR + 55;

        FileUtil.mkdir(datasetVersionPath);
        FileUtil.mkdir(datasetVersionPath2);
        FileUtil.mkdir(datasetVersionPath3);
    }

    @Test
    public void testTouch(){
        String datasetVersionPath = basePath + FileUtil.FILE_SEPARATOR + 55 + FileUtil.FILE_SEPARATOR + 101;
        File file = FileUtil.touch(datasetVersionPath, "dict.json");


        Map<String,String> dict = new HashMap<>();
        dict.put("name", "果冻");
        dict.put("爱好", "王者荣耀");

        String dictStr = new JSONObject(dict).toString();
        System.out.println(dictStr);

        User user = new User("果冻", 19);
        String beanStr = new JSONObject(user).toString();
        System.out.println(beanStr);
        FileUtil.writeUtf8String(dictStr, file);
    }

    @Test
    public void testCopyDir(){
        String datasetVersionPath = basePath + FileUtil.FILE_SEPARATOR + 55 + FileUtil.FILE_SEPARATOR + 101;
        String datasetVersionPathTarget = basePath + FileUtil.FILE_SEPARATOR + 55 + FileUtil.FILE_SEPARATOR + 200;

        File target = FileUtil.copyFilesFromDir(new File(datasetVersionPath), new File(datasetVersionPathTarget), true);
        System.out.println(target.getPath());

//        FileUtil.del()
    }






}
