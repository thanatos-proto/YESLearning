package com.mowozy.Controller;

import com.mowozy.Service.ExamService;
import com.mowozy.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by moonwolfzy on 2017-12-12.
 */

@Controller
@EnableAutoConfiguration
public class ExamsController {

    @Autowired
    private UsersService usersService;
    private ExamService examService;




    @RequestMapping("userexam-list")String userexamList(Model model)

    {
        return "userexam-list";
    }



    @RequestMapping("usercourse-index")String usercourseindex(Model model){

        return "usercourse-index";
    }

    @RequestMapping("usercourse-lesson")String usercourselesson(Model model)
    {

        return "usercourse-lesson";
    }

    @RequestMapping("userexam-index")String userexamindex(Model model){

        return "userexam-index";
    }


    @RequestMapping("userexam-result")String userexamresult(Model model){

        return "userexam-result";
    }
}





