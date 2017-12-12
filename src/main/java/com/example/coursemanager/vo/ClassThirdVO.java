package com.example.coursemanager.vo;

/**
 * @author zw
 * @date 2017/12/5 0005
 * @time 18:20
 * @email 493703217@qq.com
 */
public class ClassThirdVO {

    String url;

    public ClassThirdVO(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "ClassThirdVO{" +
                "url='" + url + '\'' +
                '}';
    }
}
