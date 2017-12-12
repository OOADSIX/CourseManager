package com.example.coursemanager.vo;

/**
 * @author zw
 * @date 2017/12/2 0002
 * @time 21:11
 * @email 493703217@qq.com
 */
public class SchoolVO {
    int id;
    String name;

    public SchoolVO(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
