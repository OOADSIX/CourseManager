package com.example.coursemanager.controller;

import com.example.coursemanager.vo.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @author zw
 * @date 2017/12/5 0005
 * @time 17:13
 * @email 493703217@qq.com
 */
@RestController
public class ClassController {

    @GetMapping("/class")
    public ResponseEntity<ArrayList<ClassFirstVO>> getAllClass(){
        ArrayList<ClassFirstVO> list = new ArrayList<>();
        list.add(new ClassFirstVO(23,"周三1-2节",60,"周三1-2，周五1-2","公寓405","OOAD","邱明"));
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @GetMapping("/class/{classId}")
    public ResponseEntity<ClassSecondVO> getClassById(){
        ArrayList<LessonsVO> lessonsVOList = new ArrayList<>();
        lessonsVOList.add(new LessonsVO(1));
        lessonsVOList.add(new LessonsVO(2));
        ArrayList<LessonsVO> lessonsVOList1 = new ArrayList<>();
        lessonsVOList1.add(new LessonsVO(3));
        lessonsVOList1.add(new LessonsVO(4));
        ArrayList<TimeVO> timeList = new ArrayList<>();
        timeList.add(new TimeVO(1,1,lessonsVOList,"海韵201"));
        timeList.add(new TimeVO(0,3,lessonsVOList1,"公寓405"));
        return new ResponseEntity<ClassSecondVO>(new ClassSecondVO(23,"周三1-2节",120,timeList,"true","/roster/周三12班.xlsx",
                new ProportionsVO(20,60,20,50,50)),HttpStatus.OK);
    }

    @PutMapping("/class/{classId}")
    public ResponseEntity updateClass(){
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    @DeleteMapping("/class/{classId}")
    public ResponseEntity deleteClass(){
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/class/{classId}/student")
    public ResponseEntity GetStudentList(){
        ArrayList<StudentFirstVO> list = new ArrayList<>();
        list.add(new StudentFirstVO(233,"张三","24320152202222"));
        return new ResponseEntity(list,HttpStatus.OK);
    }
    @PostMapping("/class/{classId}/student")
    public ResponseEntity<ClassThirdVO> chooseClass(){
        return new ResponseEntity(new ClassThirdVO("www.baidu.com"),HttpStatus.CREATED);
    }
    @PutMapping("/class/{classId}/student/{studentId}")
    public ResponseEntity CancelClass(){
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/class/{classId}/classgroup")
    public ResponseEntity<GroupVO> GetClassgroup()
    {
        ArrayList<MemberVO> memberList = new ArrayList<MemberVO>();
        ArrayList<MemberVO> leaderList = new ArrayList<MemberVO>();
        memberList.add(new MemberVO(5324,"李四","23320152202443"));
        memberList.add(new MemberVO(5678,"王五","23320152202433"));
        leaderList.add(new MemberVO(5678,"王五","23320152202433"));
        return new ResponseEntity<GroupVO>(new GroupVO(leaderList,memberList),HttpStatus.OK);
    }
    @PutMapping("/class/{classId}/classgroup/resign")
    public ResponseEntity resignLeader(){
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    @PutMapping("/class/{classId}/classgroup/assign")
    public ResponseEntity assignLeader(){
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    @PutMapping("/class/{classId}/classgroup/add")
    public ResponseEntity addMember(){
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    @PutMapping("/class/{classId}/classgroup/remove")
    public ResponseEntity removeMember(){
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
