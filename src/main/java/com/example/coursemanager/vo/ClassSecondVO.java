package com.example.coursemanager.vo;

import java.util.ArrayList;

/**
 * @author zw
 * @date 2017/12/5 0005
 * @time 18:01
 * @email 493703217@qq.com
 */
public class ClassSecondVO {
    Integer id;
    String name;
    Integer numStudent;
    ArrayList<TimeVO> time;
    String calling;
    String roster;
    ProportionsVO proportions;

    public ClassSecondVO(Integer id, String name, Integer numStudent, ArrayList<TimeVO> time, String calling, String roster, ProportionsVO proportions) {
        this.id = id;
        this.name = name;
        this.numStudent = numStudent;
        this.time = time;
        this.calling = calling;
        this.roster = roster;
        this.proportions = proportions;
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

    public Integer getNumStudent() {
        return numStudent;
    }

    public void setNumStudent(Integer numStudent) {
        this.numStudent = numStudent;
    }

    public ArrayList<TimeVO> getTime() {
        return time;
    }

    public void setTime(ArrayList<TimeVO> time) {
        this.time = time;
    }

    public String getCalling() {
        return calling;
    }

    public void setCalling(String calling) {
        this.calling = calling;
    }

    public String getRoster() {
        return roster;
    }

    public void setRoster(String roster) {
        this.roster = roster;
    }

    public ProportionsVO getProportions() {
        return proportions;
    }

    public void setProportions(ProportionsVO proportions) {
        this.proportions = proportions;
    }

    @Override
    public String toString() {
        return "ClassSecondVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numStudent=" + numStudent +
                ", time=" + time +
                ", calling='" + calling + '\'' +
                ", roster='" + roster + '\'' +
                ", proportions=" + proportions +
                '}';
    }
}
