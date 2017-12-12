package com.example.coursemanager.vo;
/**
 *
 *
 * @author YellowPure
 * @date 2017/12/1
 */
public class ClassVO {
    Integer id;
    String name;

    public ClassVO(Integer id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "ClassVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
