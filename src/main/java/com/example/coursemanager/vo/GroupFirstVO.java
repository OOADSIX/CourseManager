package com.example.coursemanager.vo;

import java.util.ArrayList;

/**
 * @author zw
 * @date 2017/12/5 0005
 * @time 19:55
 * @email 493703217@qq.com
 */
public class GroupFirstVO {
    Integer id;
    ArrayList<MemberVO> memberlist;

    @Override
    public String toString() {
        return "GroupFirstVO{" +
                "id=" + id +
                ", memberlist=" + memberlist +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ArrayList<MemberVO> getMemberlist() {
        return memberlist;
    }

    public void setMemberlist(ArrayList<MemberVO> memberlist) {
        this.memberlist = memberlist;
    }

    public GroupFirstVO(Integer id, ArrayList<MemberVO> memberlist) {

        this.id = id;
        this.memberlist = memberlist;
    }
}
