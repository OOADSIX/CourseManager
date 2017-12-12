package com.example.coursemanager.controller;

import com.example.coursemanager.vo.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zw
 * @date 2017/12/5 0005
 * @time 17:13
 * @email 493703217@qq.com
 */
@RestController
public class HelloController {
    @GetMapping("/me")
    public ResponseEntity<StudentVO> getInfo(){
        return new ResponseEntity<>(new StudentVO(
                3486,
                "24320152202888",
                "张三",
                "18859270000",
                "123456789@qq.com",
                "男",
                new SchoolVO(
                        32,
                        "厦门大学"
                ),
                "本科",
                "/avatar/3486.png"
        ), HttpStatus.OK);
    }
    @PutMapping("/me")
    public ResponseEntity updateInfo(){
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
