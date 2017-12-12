package com.example.coursemanager.vo;

/**
 * @author zw
 * @date 2017/12/5 0005
 * @time 21:32
 * @email 493703217@qq.com
 */


public class SeminarForthVO {
            Integer id;
            String name;
    String startTime;
    String endTime;
    String site;
    String teacherName;
    String teacherEmail;

    @Override
    public String toString() {
        return "SeminarForthVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", site='" + site + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", teacherEmail='" + teacherEmail + '\'' +
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

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
    }

    public SeminarForthVO(Integer id, String name, String startTime, String endTime, String site, String teacherName, String teacherEmail) {

        this.id = id;
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.site = site;
        this.teacherName = teacherName;
        this.teacherEmail = teacherEmail;
    }
}

