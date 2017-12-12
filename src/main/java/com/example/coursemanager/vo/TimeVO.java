package com.example.coursemanager.vo;

import java.util.ArrayList;
/**
 *
 *
 * @author YellowPure
 * @date 2017/12/1
 */
public class TimeVO {
    Integer week;
    Integer day;
    ArrayList<LessonsVO> lessons;
    String site;

    public TimeVO(Integer week, Integer day, ArrayList<LessonsVO> lessons, String site) {
        this.week = week;
        this.day = day;
        this.lessons = lessons;
        this.site = site;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public ArrayList<LessonsVO> getLessons() {
        return lessons;
    }

    public void setLessons(ArrayList<LessonsVO> lessons) {
        this.lessons = lessons;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    @Override
    public String toString() {
        return "TimeVO{" +
                "week=" + week +
                ", day=" + day +
                ", lessons=" + lessons +
                ", site='" + site + '\'' +
                '}';
    }
}
