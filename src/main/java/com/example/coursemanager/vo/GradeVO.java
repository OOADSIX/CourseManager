package com.example.coursemanager.vo;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author zw
 * @date 2017/12/5 0005
 * @time 20:17
 * @email 493703217@qq.com
 */
public class GradeVO {
    ArrayList<PreGradeVO> presentationGrade = new ArrayList<PreGradeVO>();
    Integer reportGrade;
    Integer grade;

    @Override
    public String toString() {
        return "GradeVO{" +
                "presentationGrade=" + presentationGrade +
                ", reportGrade=" + reportGrade +
                ", grade=" + grade +
                '}';
    }

    public ArrayList<PreGradeVO> getPresentationGrade() {
        return presentationGrade;
    }

    public void setPresentationGrade(ArrayList<PreGradeVO> presentationGrade) {
        this.presentationGrade = presentationGrade;
    }

    public Integer getReportGrade() {
        return reportGrade;
    }

    public void setReportGrade(Integer reportGrade) {
        this.reportGrade = reportGrade;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public GradeVO(ArrayList<PreGradeVO> presentationGrade, Integer reportGrade, Integer grade) {

        this.presentationGrade = presentationGrade;
        this.reportGrade = reportGrade;
        this.grade = grade;
    }
}
