package com.apps.use;

import com.apps.util.ChineseUtil;
import com.apps.util.FreeMarkUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author
 * @Description
 * @Date 2023/5/24
 */
public class GenerateWeekly {


    private static String templateName = "weekly.ftl";


    public static void generate() throws Exception {
        //拿到数据
        //getWeekly();
        //按照模板生成
        HashMap<String, Object> root = new HashMap<>();

        List<HashMap<String, Object>> list = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            HashMap<String, Object> projectMap = new HashMap<>();
            projectMap.put("project", ChineseUtil.numberToChinese(i+1) + "、" + "xxx项目");
            projectMap.put("1", "1、xxxxx");
            projectMap.put("2", "2、xxxxx");
            projectMap.put("3", "3、xxxxx");
            projectMap.put("4", "4、xxxxx");
            list.add(projectMap);
        }


        root.put("thisWeek", list);
        root.put("nextWeek", list);


        String template = FreeMarkUtil.process(templateName, root);
        System.out.println(template);
    }

    public static void main(String[] args) throws Exception {
        generate();
    }


}
