package com.mowozy.Controller;

import com.mowozy.Dao.UsersDao;
import com.mowozy.Entity.Courses;
import com.mowozy.Entity.Users;
import com.mowozy.Service.UserscousesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@EnableAutoConfiguration
public class UsercoursesController {
    @Autowired
    private UserscousesService userscousesservice;

    @Autowired
    private UsersDao usersdao;

    @RequestMapping(value="/all")
    @ResponseBody
    public List<Users> all(){
        return usersdao.findAll();
    }

    @RequestMapping(value="/usercourses")
    @ResponseBody
    public Object UserCourses(int uId){
        return userscousesservice.selectbyuser(uId);
    }
}
