package com.mowozy.Controller;

import com.mowozy.Entity.Exams;
import com.mowozy.Entity.Questions;
import com.mowozy.Service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by moonwolfzy on 2017-12-12.
 */

@Controller
@EnableAutoConfiguration
public class ExamsController {

    @Autowired
    private ExamService examService;


    @RequestMapping("usercourse-index")String usercourseindex(Model model){

        return "usercourse-index";
    }
	//用户课程主页

    @RequestMapping("usercourse-lesson")String usercourselesson(Model model)
    {

        return "usercourse-lesson";
    }
	//用户课程列表

    @RequestMapping("userexam-index")String userexamindex(Model model){

        return "userexam-index";
    }
	//用户考试主页


    @RequestMapping("userexam-lists")String userexamLists(Model model)
    {
        List<Questions> questionsList =examService.makeExam(1);
        Exams exams = examService.findByEid(1);
        model.addAttribute("questionsList", questionsList);
        model.addAttribute("exams", exams);

        return "userexam-lists";
    }

//    用户考试列表

    @RequestMapping("userexamresult")String userexamResult(HttpServletRequest request , Exams examsresult, Model model)

    {
        examsresult.setQ1( Integer.parseInt( request.getParameter("q1") ) );
        examsresult.setQ2( Integer.parseInt( request.getParameter("q2") ) );
        examsresult.setQ3( Integer.parseInt( request.getParameter("q3") ) );
        examsresult.setQ4( Integer.parseInt( request.getParameter("q4") ) );
        examsresult.setQ5( Integer.parseInt( request.getParameter("q5") ) );
        examsresult.setQ6( Integer.parseInt( request.getParameter("q6") ) );
        examsresult.setQ7( Integer.parseInt( request.getParameter("q7") ) );
        examsresult.setQ8( Integer.parseInt( request.getParameter("q8") ) );
        examsresult.setQ9( Integer.parseInt( request.getParameter("q9") ) );
        examsresult.setQ10( Integer.parseInt( request.getParameter("q10") ) );

        int total = examService.correctscore(examsresult,1);
        model.addAttribute("total", total);
        return "userexam-result";
    }

	//用户考试结果
	@RequestMapping("userexam-result")String userexamresult(Model model){

		return "userexam-result";
	}
}





