package com.example.coursemanager.vo;

/**
 * @author zw
 * @date 2017/12/5 0005
 * @time 20:17
 * @email 493703217@qq.com
 */
public class PreGradeVO {
    Integer topicId;
    Integer grade;

    @Override
    public String toString() {
        return "PreGradeVO{" +
                "topicId=" + topicId +
                ", grade=" + grade +
                '}';
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public PreGradeVO(Integer topicId, Integer grade) {

        this.topicId = topicId;
        this.grade = grade;
    }
}
