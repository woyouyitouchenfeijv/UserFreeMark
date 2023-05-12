package com.apps.model;

/**
 * @Description
 * @Date 2023/5/11
 */
public class Student {
    private String uuid;
    private String userName;
    private Integer age;


    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
