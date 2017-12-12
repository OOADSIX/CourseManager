package com.example.coursemanager.controller;

import com.example.coursemanager.vo.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @author zw
 * @date 2017/12/5 0005
 * @time 20:41
 * @email 493703217@qq.com
 */
@RestController
public class SeminarController {
    @GetMapping("/seminar/{seminarId}")
    public ResponseEntity<SeminarSecondVO> getSeminarInfo() {

        ArrayList<TopicFirstVO> topiclist = new ArrayList<TopicFirstVO>();
        topiclist.add(new TopicFirstVO(257,"领域模型与模块"));
        return new ResponseEntity<>(new SeminarSecondVO(
                32,
                "概要设计",
                "模型层与数据库设计",
                "fixed",
                "2017-10-10",
                "2017-10-24",
                topiclist), HttpStatus.OK);
    }
    @PutMapping("/seminar/{seminarId}")
    public ResponseEntity updateSeminar(){
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    @DeleteMapping("/seminar/{seminarId}")
    public ResponseEntity deleteSeminar(){
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    @GetMapping("/seminar/{seminarId}/my")
    public ResponseEntity<SeminarThirdVO> getSeminarInfoOfStu() {
        return new ResponseEntity<>(new SeminarThirdVO(
                32,
                "概要设计",
                "random",
                "OOAD",
                "2017-10-10",
                "2017-10-24",
                23,
                true,
                true
        ), HttpStatus.OK);
    }
    @GetMapping("/seminar/{seminarId}/detail")
    public ResponseEntity<SeminarForthVO> getSeminarDetail() {
        return new ResponseEntity<>(new SeminarForthVO(
                32,
                "概要设计",
                "2017-10-10",
                "2017-10-24",
               "海韵201",
                "邱明",
                "mingqiu@xmu.edu.cn"
        ), HttpStatus.OK);
    }
    @GetMapping("/seminar/{seminarId}/topic")
    public ResponseEntity<ArrayList<TopicVO>> getSeminarTopic() {
        ArrayList<TopicVO> list = new ArrayList<>();
        list.add(new TopicVO(
                257,
                "A",
                "领域模型与模块",
                "Domain model与模块划分",
                5,
                6,
                2
        ));
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @PostMapping("/seminar/{seminarId}/topic")
    public ResponseEntity<SeminarVO> getCreateTopic() {
        return new ResponseEntity<>(new SeminarVO(
                257
        ), HttpStatus.OK);
    }
    @GetMapping("/seminar/{seminarId}/group")
    public ResponseEntity<ArrayList<GroupThirdVO>> getGroupBySeminarId() {
        ArrayList<GroupThirdVO> list = new ArrayList<GroupThirdVO>();
        ArrayList<TopicFirstVO> topicList = new ArrayList<TopicFirstVO>();
        topicList.add(new TopicFirstVO(257,"领域模型与模块"));
        list.add(new GroupThirdVO(28,"2A2",topicList));
        list.add(new GroupThirdVO(29,"1A2",topicList));
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @GetMapping("/seminar/{seminarId}/group/my")
    public ResponseEntity<GroupForthVO> myGroupInfo() {
        ArrayList<MemberFirstVO> memberlist = new ArrayList<MemberFirstVO>();
        memberlist.add(new MemberFirstVO(5324,"李四"));
        memberlist.add(new MemberFirstVO(5678,"王五"));
        ArrayList<TopicFirstVO> topiclist = new ArrayList<TopicFirstVO>();
        topiclist.add(new TopicFirstVO(257,"领域模型与模块"));
        return new ResponseEntity<>(new GroupForthVO(32,"3A2",new MemberFirstVO(8888,"张三"),memberlist,topiclist),HttpStatus.OK);
    }
}
