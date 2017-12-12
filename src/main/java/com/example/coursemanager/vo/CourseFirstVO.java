package com.example.coursemanager.vo;

/**
 * @author zw
 * @date 2017/12/5 0005
 * @time 17:33
 * @email 493703217@qq.com
 */
public class CourseFirstVO {
    Integer id;

    public CourseFirstVO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CourseFirstVO{" +
                "id=" + id +
                '}';
    }
}
