package com.example.coursemanager.vo;

/**
 * @author zw
 * @date 2017/12/5 0005
 * @time 20:56
 * @email 493703217@qq.com
 */
public class TopicFirstVO {
    Integer id;
    String name;

    @Override
    public String toString() {
        return "TopicFirstVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TopicFirstVO(Integer id, String name) {

        this.id = id;
        this.name = name;
    }
}
