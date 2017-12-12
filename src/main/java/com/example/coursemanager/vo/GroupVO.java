package com.example.coursemanager.vo;

import java.util.ArrayList;

/**
 * @author zw
 * @date 2017/12/5 0005
 * @time 19:36
 * @email 493703217@qq.com
 */
public class GroupVO {
    ArrayList<MemberVO> leaderList;
    ArrayList<MemberVO> memberList;

    public GroupVO(ArrayList<MemberVO> leaderList, ArrayList<MemberVO> memberList) {
        this.leaderList = leaderList;
        this.memberList = memberList;
    }

    public ArrayList<MemberVO> getLeaderList() {
        return leaderList;
    }

    public void setLeaderList(ArrayList<MemberVO> leaderList) {
        this.leaderList = leaderList;
    }

    public ArrayList<MemberVO> getMemberList() {
        return memberList;
    }

    public void setMemberList(ArrayList<MemberVO> memberList) {
        this.memberList = memberList;
    }

    @Override
    public String toString() {
        return "GroupVO{" +
                "leaderList=" + leaderList +
                ", memberList=" + memberList +
                '}';
    }
}
