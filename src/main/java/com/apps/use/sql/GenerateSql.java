package com.apps.use.sql;

import com.apps.model.SqlVo;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Description 生成sql
 * @Date 2023/5/12
 */
public class GenerateSql {


    public static void main(String[] args) {


        HashMap<String, Object> params = new HashMap<>();


        for (int i = 0; i < args.length; i++) {
            params.put("tableName","student");

            ArrayList<SqlVo> dataList = new ArrayList<>();
            for (int j = 0; j < args.length; j++) {
                SqlVo sqlVo = new SqlVo();
                sqlVo.setKey("uuid");
                sqlVo.setValue(i+"");
                dataList.add(sqlVo);
                SqlVo sqlVo2 = new SqlVo();
                sqlVo2.setKey("userName");
                sqlVo2.setValue("name"+i);
                dataList.add(sqlVo2);
                SqlVo sqlVo3 = new SqlVo();
                sqlVo3.setKey("age");
                sqlVo3.setValue(i+"");
                dataList.add(sqlVo3);
            }
            params.put("dataList",dataList);

        }



    }



}
