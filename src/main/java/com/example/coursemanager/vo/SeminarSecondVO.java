package com.example.coursemanager.vo;

import java.util.ArrayList;

/**
 * @author zw
 * @date 2017/12/5 0005
 * @time 20:54
 * @email 493703217@qq.com
 */
public class SeminarSecondVO {
    Integer id;
    String name;
    String description;
    String groupingMethod;
    String startTime;
    String endTime;
    ArrayList<TopicFirstVO> topicList ;

    public SeminarSecondVO(Integer id, String name, String description, String groupingMethod, String startTime, String endTime, ArrayList<TopicFirstVO> topicList) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.groupingMethod = groupingMethod;
        this.startTime = startTime;
        this.endTime = endTime;

        this.topicList = topicList;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGroupingMethod() {
        return groupingMethod;
    }

    public void setGroupingMethod(String groupingMethod) {
        this.groupingMethod = groupingMethod;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }



    public ArrayList<TopicFirstVO> getTopicList() {
        return topicList;
    }

    public void setTopicList(ArrayList<TopicFirstVO> topicList) {
        this.topicList = topicList;
    }

    @Override
    public String toString() {
        return "SeminarSecondVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", groupingMethod='" + groupingMethod + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", topicList=" + topicList +
                '}';
    }
}
