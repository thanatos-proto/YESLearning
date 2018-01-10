package com.mowozy.Controller;

import com.mowozy.Entity.Users;
import com.mowozy.Service.AdminService;
import com.mowozy.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by moonwolfzy on 2017-12-12.
 */

@Controller
@EnableAutoConfiguration
public class AdminController {

	@Autowired
	private AdminService adminService;

	@Autowired
	private UsersService usersService;

	@RequestMapping("admin-login")
	String adminLogin(Model model) {
		model.addAttribute("users", new Users());
		return "admin-login";
	}

	@RequestMapping("index_v3")
	String adminIndex(Model model) {
		return "index_v3";
	}

	@RequestMapping("table_courses")
	String table_courses(Model model) {
		return "table_courses";
	}

	@RequestMapping("table_tests")
	String table_tests(Model model) {
		return "table_tests";
	}

	@RequestMapping("table_users")
	String table_users(Model model) {
		return "table_users";
	}

	@RequestMapping("table_trans")
	String table_trans(Model model) {
		return "table_trans";
	}

	@RequestMapping("projects")
	String projects(Model model) {
		return "projects";
	}

	@RequestMapping("chart")
	String chart(Model model) {
		return "chart";
	}


	@RequestMapping("project_detail")
	String project_detail(Model model) {
		return "project_detail";
	}

	@RequestMapping("admin-mailbox")
	String adminMailbox(Model model) {
		return "admin-mailbox";
	}

	@RequestMapping("admin-maildetail")
	String adminMailboxdetail(Model model) {
		return "admin-maildetail";
	}

	@RequestMapping("admin-mailcompose")
	String adminMailcompose(Model model) {
		return "admin-mailcompose";
	}


	@RequestMapping("admin")
	String admin(Model model) {
		return "admin";
	}

	@RequestMapping(value = "/adminLogin", method = RequestMethod.POST)
	String userLogin(Users user, HttpServletRequest request, HttpServletResponse response) {
		boolean flag = usersService.verifyUser(user);
		if (flag) {
			response.addCookie(new Cookie("username", usersService.getUnameByEmail(user.getEmail())));
			response.addCookie(new Cookie("password", user.getPassword()));

			request.getSession().setAttribute("userid", user.getuId());
			return "admin-index";
		} else {
			request.setAttribute("error", "用户名或密码错误");
			return "admin-login";
		}
	}


}
