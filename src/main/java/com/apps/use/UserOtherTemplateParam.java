package com.apps.use;

import com.apps.util.FreeMarkUtil;

import java.util.HashMap;

/**
 * @Author
 * @Description
 * @Date 2023/6/16
 */
public class UserOtherTemplateParam {

    public static void main(String[] args) throws Exception {
        HashMap<String, Object> root = new HashMap<>();

        String template = FreeMarkUtil.process("a.ftl", root);
        System.out.println(template);
    }
}
