package com.mowozy.Controller;

import com.mowozy.Entity.Users;
import com.mowozy.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		model.addAttribute("users", new Users());
		return "login";
	}

	@RequestMapping("/register")
	String register(Model model) {
		model.addAttribute("users", new Users());
		return "register";
	}

	@RequestMapping(value = "/userLogin", method = RequestMethod.POST)
	String userLogin(Users user, HttpServletRequest request, HttpServletResponse response) {
		boolean flag = usersService.verifyUser(user);
		if (flag) {
			response.addCookie(new Cookie("username", usersService.getUnameByEmail(user.getEmail())));
			response.addCookie(new Cookie("password", user.getPassword()));

			request.getSession().setAttribute("userid", user.getuId());
			return "userspace-details";
		} else {
			request.setAttribute("error", "用户名或密码错误");
			return "login";
		}
	}

	@RequestMapping(value = "/userLogout", method = RequestMethod.GET)
	String userLogout(HttpServletResponse response) {
		Cookie name_cookie = new Cookie("username", "");
		Cookie pass_cookie = new Cookie("password", "");

		name_cookie.setMaxAge(0);
		pass_cookie.setMaxAge(0);

		response.addCookie(name_cookie);
		response.addCookie(pass_cookie);

		return "index";
	}

	@RequestMapping(value = "/userRegister", method = RequestMethod.POST)
	String registerUser(Users user, Model model) {
		boolean flag = usersService.registerUser(user);
		if (flag) {
			model.addAttribute("name", user.getuName());
			return "registerSuccess";
		} else {
			model.addAttribute("email", user.getEmail());
			return "registerFail";
		}
	}

	@RequestMapping("userspace")
	String userspace(Model model) {
		return "userspace";
	}

	@RequestMapping("userspace-details")
	String userspaceDetails(Model model) {

		return "userspace-details";
	}

	@RequestMapping("userspace-modify")
	String userspacemodify(Model model) {

		return "userspace-modify";
	}

	@RequestMapping("userspace-courses")
	String userspaceCourses(Model model) {
		return "userspace-courses";
	}

	@RequestMapping("userspace-exam")
	String userspaceExam(Model model) {
		return "userspace-exam";
	}
}





