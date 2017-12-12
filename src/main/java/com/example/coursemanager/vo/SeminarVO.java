package com.example.coursemanager.vo;

/**
 * @author zw
 * @date 2017/12/5 0005
 * @time 20:41
 * @email 493703217@qq.com
 */
public class SeminarVO {
    Integer id;

    @Override
    public String toString() {
        return "SeminarVO{" +
                "id=" + id +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SeminarVO(Integer id) {

        this.id = id;
    }
}
