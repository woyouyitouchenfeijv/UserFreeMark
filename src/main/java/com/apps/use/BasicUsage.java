package com.apps.use;

import com.apps.model.StudentDo;
import com.apps.util.FreeMarkUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * @Description
 * @Date 2023/5/12
 */
public class BasicUsage {

    public static void main(String[] args) throws Exception {
        HashMap<String, Object> root = new HashMap<>();
        //${variable}：输出变量的值。
        root.put("variable","输出变量的值。");

        //${object.property}：输出对象的属性值。
        StudentDo student = new StudentDo();
        student.setAge(18);
        student.setUserName("小陈");
        root.put("student",student);

        //${map.key}：输出 Map 中指定 key 的值。
        HashMap<String, String> map = new HashMap<>(1);
        map.put("key","输出 Map 中指定 key 的值。");
        map.put("key1","输出1");
        map.put("key2","输出2");
        root.put("map",map);

        //${list[index]}：输出列表中指定位置的值。
        ArrayList<Integer> list = new ArrayList<>(2);
        list.add(1);
        list.add(2);
        root.put("list",list);

        // ${variable!defaultValue}：如果变量值为 null，则输出 defaultValue 值。
        root.put("nullValue",null);
        root.put("notNullValue","有值");

        //${variable?string} ：将变量转换为字符串输出。
        root.put("isInteger",1);

        //将变量转义为 HTML 格式输出
        root.put("capFirst","value");
        //将变量转换为小写字母后输出
        root.put("lowerCase","EEEEE");
        //将变量转换为大写字母后输出。
        root.put("upperCase","eeee");
        //将变量转换为日期格式输出。
        root.put("now",new Date());
        //将变量转换为数字格式输出。
        root.put("numbers","123");
        //将变量格式化为货币金额输出
        root.put("money",213);
        //if、elseif、else：用于条件语句的指令。
        root.put("x",1);

        //list 对象
        ArrayList<StudentDo> studentList = new ArrayList<>(4);
        for (int i = 0; i < 4; i++) {
            StudentDo s = new StudentDo();
            s.setUserName("name"+i);
            s.setAge(18+i);
            studentList.add(s);
        }
        root.put("studentList",studentList);
        root.put("nullList",new ArrayList<>(0));

        String template = FreeMarkUtil.process("template.text", root);
        System.out.println(template);
    }
}
