package com.example.coursemanager.controller;

import com.example.coursemanager.vo.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
public class GroupController {
    @GetMapping("group/{groupId}")
    public ResponseEntity<GroupFirstVO> getGroup()
    {
        ArrayList<MemberVO> memberlist = new ArrayList<MemberVO>();
        memberlist.add(new MemberVO(23,"张三","24320152202888"));
        return new ResponseEntity<GroupFirstVO>(new GroupFirstVO(2,memberlist), HttpStatus.OK);
    }
    @PutMapping("/group/{groupId}/resign")
    public ResponseEntity assign()
    {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PutMapping("/group/{groupId}/assign")
    public ResponseEntity resign()
    {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PutMapping("/group/{groupId}/add")
    public ResponseEntity add()
    {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PutMapping("/group/{groupId}/remove")
    public ResponseEntity remove()
    {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PutMapping("/group/{groupId}/topic")
    public ResponseEntity chooseTopic()
    {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PutMapping("/group/{groupId}/topic/{topicId}")
    public ResponseEntity deleteTopic()
    {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PutMapping("/group/{groupId}/grade/report")
    public ResponseEntity putReport()
    {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PutMapping("/group/{groupId}/grade/presentation/{studentId}")
    public ResponseEntity putPreGrade()
    {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @GetMapping("group/{groupId}/grade")
    public ResponseEntity<GradeVO> getGrade()
    {
        ArrayList<PreGradeVO> gradelist = new ArrayList<PreGradeVO>();
        gradelist.add(new PreGradeVO(23,5));
        return new ResponseEntity<GradeVO>(new GradeVO(gradelist,5,5), HttpStatus.OK);
    }
}
