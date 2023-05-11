package com.apps.util;


import com.apps.model.Student;
import freemarker.cache.FileTemplateLoader;
import freemarker.cache.MultiTemplateLoader;
import freemarker.cache.TemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FreeMarkUtil {

    //单例
    private static final Configuration cfg =  new Configuration();

    static {
        // 设置默认编码
        cfg.setDefaultEncoding("utf-8");
    }

    public static String process(String templateName, Map<String, Object> root) throws Exception {
        String path = FreeMarkUtil.class.getResource("").getPath();
        //模板的位置，我是放在 /resource 下
        path = path.replace("/com/apps/util/","");
        //建议，就算不同文件夹，但是模板文件名也不能相同
        FileTemplateLoader ftl = new FileTemplateLoader(new File(path +"/component_template/"));
        TemplateLoader[] loaders = new TemplateLoader[] { ftl };
        MultiTemplateLoader mul = new MultiTemplateLoader(loaders);
        cfg.setTemplateLoader(mul);

        //创建模版对象
        Template t = cfg.getTemplate(templateName+".json");

        //设置输出流
        StringWriter writer = new StringWriter();
        String result = "";
        try {
            //在模版上执行插值操作，并输出到制定的输出流中
            t.process(root, writer);//root 是模板中的变量的值
            result = writer.toString();
        }catch (Exception e){
            throw new Exception(e);
        }finally {
            writer.close();
        }
        return result;
    }



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


        String template = process("template", root);
        System.out.println(template);
    }
}
