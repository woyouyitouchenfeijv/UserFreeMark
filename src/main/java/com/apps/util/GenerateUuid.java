package com.apps.util;

/**
 * @Author
 * @Description
 * @Date 2023/6/16
 */

import freemarker.template.TemplateMethodModelEx;

import java.util.List;
import java.util.UUID;

public class GenerateUuid implements TemplateMethodModelEx {
    @Override
    public Object exec(List arguments){
        return UUID.randomUUID().toString();
    }
}
