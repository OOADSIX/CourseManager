package com.example.coursemanager.controller;

import com.example.coursemanager.vo.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author zw
 * @date 2017/12/5 0005
 * @time 17:14
 * @email 493703217@qq.com
 */
@RestController
public class TopicController {
    @GetMapping("/topic/topicId")
    public ResponseEntity<TopicVO> selectTopicById(){
        return new ResponseEntity<TopicVO>(new TopicVO(257,"A","领域模型与模块","Domain model与模块划分",4,6,2), HttpStatus.OK);
    }
    @PutMapping("/topic/{topicId}")
    public ResponseEntity updateTopic(){
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    @DeleteMapping("/topic/{topicId}")
    public ResponseEntity deleteTopic(){
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    @GetMapping("/topic/topicId/group")
    public ResponseEntity<ArrayList<GroupSecondVO>> selectGroup(){
        ArrayList<GroupSecondVO> grouplist = new ArrayList<GroupSecondVO>();
        grouplist.add(new GroupSecondVO(2,"3A2"));
        return new ResponseEntity<>(grouplist, HttpStatus.OK);
    }
}
