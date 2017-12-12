package com.example.coursemanager.vo;

/**
 * @author zw
 * @date 2017/12/5 0005
 * @time 21:01
 * @email 493703217@qq.com
 */
public class SeminarThirdVO {
    Integer id;
    String name;
    String groupingMethod;
    String courseName;
    String startTime;
    String endTime;
    Integer classCalling;
    boolean isLeader;
    boolean areTopicSelected;

    @Override
    public String toString() {
        return "SeminarThirdVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", groupingMethod='" + groupingMethod + '\'' +
                ", courseName='" + courseName + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", classCalling=" + classCalling +
                ", isLeader=" + isLeader +
                ", areTopicSelected=" + areTopicSelected +
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

    public String getGroupingMethod() {
        return groupingMethod;
    }

    public void setGroupingMethod(String groupingMethod) {
        this.groupingMethod = groupingMethod;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
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

    public Integer getClassCalling() {
        return classCalling;
    }

    public void setClassCalling(Integer classCalling) {
        this.classCalling = classCalling;
    }

    public boolean isLeader() {
        return isLeader;
    }

    public void setLeader(boolean leader) {
        isLeader = leader;
    }

    public boolean isAreTopicSelected() {
        return areTopicSelected;
    }

    public void setAreTopicSelected(boolean areTopicSelected) {
        this.areTopicSelected = areTopicSelected;
    }

    public SeminarThirdVO(Integer id, String name, String groupingMethod, String courseName, String startTime, String endTime, Integer classCalling, boolean isLeader, boolean areTopicSelected) {

        this.id = id;
        this.name = name;
        this.groupingMethod = groupingMethod;
        this.courseName = courseName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.classCalling = classCalling;
        this.isLeader = isLeader;
        this.areTopicSelected = areTopicSelected;
    }
}
