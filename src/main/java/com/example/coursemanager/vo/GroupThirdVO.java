package com.example.coursemanager.vo;

import java.util.ArrayList;

/**
 * @author zw
 * @date 2017/12/5 0005
 * @time 21:16
 * @email 493703217@qq.com
 */
public class GroupThirdVO {
    Integer id;
    String name;
    ArrayList<TopicFirstVO> topics =  new ArrayList<TopicFirstVO>();

    @Override
    public String toString() {
        return "GroupThirdVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", topics=" + topics +
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

    public ArrayList<TopicFirstVO> getTopics() {
        return topics;
    }

    public void setTopics(ArrayList<TopicFirstVO> topics) {
        this.topics = topics;
    }

    public GroupThirdVO(Integer id, String name, ArrayList<TopicFirstVO> topics) {

        this.id = id;
        this.name = name;
        this.topics = topics;
    }
}
