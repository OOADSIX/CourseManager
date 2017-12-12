package com.example.coursemanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author YellowPure
 * @date 2017/12/2
 */
@Controller
public class ViewController {

    @RequestMapping("/TeacherHomePage")
    public String TeacherHomePage(){
        return "view/teacher/TeacherHomePage";
    }

    @RequestMapping("/TeacherBindPage")
    public String TeacherBindPage(){
        return "view/teacher/TeacherBindPage";
    }

    @RequestMapping("/TeacherClassInfo")
    public String TeacherClassInfo(){
        return "view/teacher/TeacherClassInfo";
    }

    @RequestMapping("/TeacherCourseHomePage")
    public String TeacherCourseHomePage(){
        return "view/teacher/TeacherCourseHomePage";
    }

    @RequestMapping("/TeacherCourseInformation")
    public String TeacherCourseInformation(){
        return "view/teacher/TeacherCourseInformation";
    }

    @RequestMapping("/TeacherCreateClass")
    public String TeacherCreateClass(){
        return "view/teacher/TeacherCreateClass";
    }

    @RequestMapping("/TeacherCreateCoursePage")
    public String TeacherCreateCoursePage(){
        return "view/teacher/TeacherCreateCoursePage";
    }

    @RequestMapping("/TeacherCreateTopic")
    public String TeacherCreateTopic(){
        return "view/teacher/TeacherCreateTopic";
    }

    @RequestMapping("/TeacherInfoModifyPage")
    public String TeacherInfoModifyPage(){
        return "view/teacher/TeacherInfoModifyPage";
    }

    @RequestMapping("/TeacherScoreHome")
    public String TeacherScoreHome(){
        return "view/teacher/TeacherScoreHome";
    }

    @RequestMapping("/TeacherScoreReportPage")
    public String TeacherScoreReportPage(){
        return "view/teacher/TeacherScoreReportPage";
    }

    @RequestMapping("/TeacherTopicCheck")
    public String TeacherTopicCheck(){
        return "view/teacher/TeacherTopicCheck";
    }

    @RequestMapping("/TeacherUpdateSenimar")
    public String TeacherUpdateSenimar(){
        return "view/teacher/TeacherUpdateSenimar";
    }

    @RequestMapping("/TeacherUpdateTopic")
    public String TeacherUpdateTopic(){
        return "view/teacher/TeacherUpdateTopic";
    }

    @RequestMapping("/TeacherUpdateClass")
    public String TeacherUpdateClass(){return "view/teacher/TeacherUpdateClass";}

    @RequestMapping("/TeacherSenimarInfo")
    public String TeacherSenimarInfo(){return "view/teacher/TeacherSenimarInfo";}

    @RequestMapping("/StudentBindPage")
    public String StudentBindPage(){return "view/student/StudentBindPage";}

    @RequestMapping("/StudentChooseCoursePage")
    public String StudentChooseCoursePage(){return "view/student/StudentChooseCoursePage";}

    @RequestMapping("/StudentCourseHome")
    public String StudentCourseHome(){return "view/student/StudentCourseHome";}

    @RequestMapping("/StudentCourseInformation")
    public String StudentCourseInformation(){return "view/student/StudentCourseInformation";}

    @RequestMapping("/StudentDiscussionClassPage")
    public String StudentDiscussionClassPage(){return "view/student/StudentDiscussionClassPage";}

    @RequestMapping("/StudentHomePage")
    public String StudentHomePage(){return "view/student/StudentHomePage";}

    @RequestMapping("/StudentInfoModifyPage")
    public String StudentInfoModifyPage(){return "view/student/StudentInfoModifyPage";}

    @RequestMapping("/StudentModifyGroupPage")
    public String StudentModifyGroupPage(){return "view/student/StudentModifyGroupPage";}

    @RequestMapping("/StudentViewGradePage")
    public String StudentViewGradePage(){return "view/student/StudentViewGradePage";}

    @RequestMapping("/StudentViewGroupPage")
    public String StudentViewGroupPage(){return "view/student/StudentViewGroupPage";}

    @RequestMapping("/StudentViewTopicPage")
    public String StudentViewTopicPage(){return "view/student/StudentViewTopicPage";}

    @RequestMapping("/TeacherTopicCheckBefore")
    public String TeacherTopicCheckBefore(){return "view/teacher/TeacherTopicCheckBefore";}

}
