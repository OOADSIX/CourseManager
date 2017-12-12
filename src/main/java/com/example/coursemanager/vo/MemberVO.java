package com.example.coursemanager.vo;

/**
 * @author zw
 * @date 2017/12/5 0005
 * @time 19:38
 * @email 493703217@qq.com
 */
public class MemberVO {
    Integer id;
    String name;
    String number;

    @Override
    public String toString() {
        return "MemberVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public MemberVO(Integer id, String name, String number) {

        this.id = id;
        this.name = name;
        this.number = number;
    }
}
