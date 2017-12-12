package com.example.coursemanager.vo;
/**
 *
 *
 * @author YellowPure
 * @date 2017/12/1
 */
public class LessonsVO {
    Integer id;

    public LessonsVO(Integer id) {
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
        return "LessonsVO{" +
                "id=" + id +
                '}';
    }
}
