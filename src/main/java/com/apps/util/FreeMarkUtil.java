package com.apps.util;


import freemarker.cache.FileTemplateLoader;
import freemarker.cache.MultiTemplateLoader;
import freemarker.cache.TemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.File;
import java.io.StringWriter;
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
        Template t = cfg.getTemplate(templateName);
        cfg.setSharedVariable("generateUuid", new GenerateUuid());
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
}