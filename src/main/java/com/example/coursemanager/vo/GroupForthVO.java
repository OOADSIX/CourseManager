package com.example.coursemanager.vo;

import java.util.ArrayList;

/**
 * @author zw
 * @date 2017/12/5 0005
 * @time 21:26
 * @email 493703217@qq.com
 */
public class GroupForthVO {
    Integer id;
    String name;
    MemberFirstVO leader;
    ArrayList<MemberFirstVO> memberList ;
    ArrayList<TopicFirstVO> topicList ;

    @Override
    public String toString() {
        return "GroupForthVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", leader=" + leader +
                ", memberList=" + memberList +
                ", topicList=" + topicList +
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

    public MemberFirstVO getLeader() {
        return leader;
    }

    public void setLeader(MemberFirstVO leader) {
        this.leader = leader;
    }

    public ArrayList<MemberFirstVO> getMemberList() {
        return memberList;
    }

    public void setMemberList(ArrayList<MemberFirstVO> memberList) {
        this.memberList = memberList;
    }

    public ArrayList<TopicFirstVO> getTopicList() {
        return topicList;
    }

    public void setTopicList(ArrayList<TopicFirstVO> topicList) {
        this.topicList = topicList;
    }

    public GroupForthVO(Integer id, String name, MemberFirstVO leader, ArrayList<MemberFirstVO> memberList, ArrayList<TopicFirstVO> topicList) {

        this.id = id;
        this.name = name;
        this.leader = leader;
        this.memberList = memberList;
        this.topicList = topicList;
    }
}
