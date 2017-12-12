package com.example.coursemanager.vo;



/**
 * @author zw
 * @date 2017/12/1 0001
 * @time 21:58
 * @email 493703217@qq.com
 */
public class StudentVO {
    Integer id;
    String number;
    String name;
    String phone;
    String email;
    String gender;
    SchoolVO school;
    String title;
    String avatar;

    public StudentVO(Integer id, String number, String name, String phone, String email, String gender, SchoolVO school, String title, String avatar) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.school = school;
        this.title = title;
        this.avatar = avatar;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public SchoolVO getSchool() {
        return school;
    }

    public void setSchool(SchoolVO school) {
        this.school = school;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
