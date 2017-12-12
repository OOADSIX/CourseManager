package com.example.coursemanager.controller;



import com.example.coursemanager.vo.CourseVO;
import com.example.coursemanager.vo.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @author zw
 * @date 2017/12/5 0005
 * @time 17:14
 * @email 493703217@qq.com
 */
@RestController
public class CourseController {
    @GetMapping("/course")
    public ResponseEntity<ArrayList<CourseVO>> getCourseList(){
        ArrayList<CourseVO> list = new ArrayList<CourseVO>();
        list.add(new CourseVO(1,"OOAD",3,60,"2017-9-1","2018-1-1"));
        list.add(new CourseVO(2,"J2EE",1,60,"2017-9-1","2018-1-1"));
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @DeleteMapping("/course/{courseId}")
    public ResponseEntity deleteCourse(){
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/course/{courseId}")
    public ResponseEntity updateCourse(){
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/course")
    public ResponseEntity<CourseFirstVO> createCourse(){
        return new ResponseEntity<>(new CourseFirstVO(23), HttpStatus.CREATED);
    }
    @GetMapping("/course/{courseId}")
    public ResponseEntity<CourseSecondVO> getCourseInfo() {
        return new ResponseEntity<>(new CourseSecondVO(222,"面向对象的分析与设计","这个人很懒，什么都没有留下","邱明","5456@qq.com"),HttpStatus.OK);
    }
    @GetMapping("/course/{courseId}/class")
    public ResponseEntity<ArrayList<ClassVO>> getClassByCourseId(){
        ArrayList<ClassVO> list = new ArrayList<>();
        list.add(new ClassVO(45,"周三1-2节"));
        list.add(new ClassVO(48,"周三3-4节"));
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @PostMapping("/course/{courseId}/class")
    public ResponseEntity<CourseFirstVO> createClassForCourse(){
        return new ResponseEntity<>(new CourseFirstVO(23), HttpStatus.CREATED);
    }
    @PostMapping("/course/{courseId}/seminar")
    public ResponseEntity<SeminarVO> createSeminar(){
        return new ResponseEntity<>(new SeminarVO(32),HttpStatus.CREATED);
    }
    @GetMapping("/course/{courseId}/seminar")
    public ResponseEntity<ArrayList<SeminarFirstVO>> getSeminarList() {
        ArrayList<SeminarFirstVO> list = new ArrayList<SeminarFirstVO>();
        list.add(new SeminarFirstVO(29, "界面原型设计", "界面原型设计", "fixed", "2017-09-25", "2017-10-09"));
        list.add(new SeminarFirstVO(32, "概要设计", "模型层与数据库设计", "fixed", "2017-10-10", "2017-10-24"));
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @GetMapping("/course/{courseId}/seminar/current")
    public ResponseEntity<SeminarFirstVO> selectCurrentSeminar() {
        return new ResponseEntity<SeminarFirstVO>(new SeminarFirstVO(29, "界面原型设计", "界面原型设计", "fixed", "2017-09-25", "2017-10-09"),HttpStatus.CREATED);
    }
    @GetMapping("/course/{courseId}/grade")
    public ResponseEntity<ArrayList<GradeFirstVO>> getGrade() {
        ArrayList<GradeFirstVO> list = new ArrayList<GradeFirstVO>();
        list.add(new GradeFirstVO("界面原型设计", "界面原型设计", "fixed",3, 4,4));
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
