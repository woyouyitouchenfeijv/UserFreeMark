package com.apps.use;

import com.apps.model.PeopleVo;
import com.apps.model.WorkItemInfo;
import com.apps.util.ChineseUtil;
import com.apps.util.FreeMarkUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.lang.reflect.Type;
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
        String weekly = getWeekly("/Users/dengxu/Desktop/新文件.json");
        HashMap<String, Object> root = new HashMap<>();
        List<HashMap<String, Object>> list = new ArrayList<>();
        Type type = new TypeToken<List<PeopleVo>>() {}.getType();
        List<PeopleVo> sDeptList = new Gson().fromJson(weekly, type);


        HashMap<String, List<WorkItemInfo>> map = new HashMap<>();

        for (int i = 0; i < sDeptList.size(); i++) {
            PeopleVo peopleVo = sDeptList.get(i);
            List<WorkItemInfo> workItemInfos = peopleVo.getwList();
            for (int j = 0; j < workItemInfos.size(); j++) {
                WorkItemInfo workItemInfo = workItemInfos.get(j);
                List<WorkItemInfo> workList = map.get(workItemInfo.getTaskName());
                if(workList == null){
                    workList = new ArrayList<>();
                }
                workList.add(workItemInfo);
                map.put(workItemInfo.getTaskName(),workList);
            }
        }


        for (String WorkName : map.keySet()) {

            List<WorkItemInfo> workItemInfos = map.get(WorkName);
            HashMap<String, Object> projectMap = new HashMap<>();
            projectMap.put("project", ChineseUtil.numberToChinese(1) + "、" + WorkName);
            for (int i = 0; i < workItemInfos.size(); i++) {
                WorkItemInfo workItemInfo = workItemInfos.get(i);
                projectMap.put((i+1)+"", workItemInfo.getWorkName()+","+workItemInfo.getDescription());
            }
            list.add(projectMap);

        }

        root.put("thisWeek", list);
        //root.put("nextWeek", null);


        String template = FreeMarkUtil.process(templateName, root);
        System.out.println(template);
    }


    public static String getWeekly(String filePath) throws Exception {
        File file = new File(filePath);
        return FileUtils.readFileToString(file, "UTF-8");
    }

    public static void main(String[] args) throws Exception {



        generate();
    }


}
