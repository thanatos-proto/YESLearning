package com.mowozy.Controller;

import com.mowozy.Entity.Users;
import com.mowozy.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by moonwolfzy on 2017-12-12.
 */

@Controller
@EnableAutoConfiguration
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping("/login")
    String login(Model model) {
        model.addAttribute("user", new Users());
        return "login";
    }

    @RequestMapping("/register")
    String register(Model model) {
        model.addAttribute("user", new Users());
        return "register";
    }

    @RequestMapping("users-details")String userDetails(Model model){
        return "users-details";
    }

    @RequestMapping(value = "/userLogin", method = RequestMethod.POST)
    String userLogin(Users user, Model model,HttpServletRequest request) {

        boolean flag = usersService.verifyUser(user);
        if (flag) {
            request.getSession().setAttribute("userid", user.getuId());
            return "users-details";
        } else {
            request.setAttribute("error","用户名或密码错误");
            return "login";
        }

    }

    @RequestMapping(value = "/userRegister", method = RequestMethod.POST)
    String registerUser(Users user, Model model) {


        boolean flag = usersService.registerUser(user);
        if (flag) {
            model.addAttribute("name",user.getuName());
            return "registerSuccess";

        }
        else{
            model.addAttribute("email",user.getEmail());
            return "registerFail";
        }

    }
}





