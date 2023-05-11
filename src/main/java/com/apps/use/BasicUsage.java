package com.apps.use;

import com.apps.model.Student;
import com.apps.util.FreeMarkUtil;

import java.util.ArrayList;
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
        Student student = new Student();
        student.setAge(18);
        student.setName("小陈");
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

        //

        String template = FreeMarkUtil.process("template", root);
        System.out.println(template);
    }
}
