package com.mowozy.Controller;

import com.mowozy.Entity.Courses;
import com.mowozy.Service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 
 * @author admin
 *
 */
@Controller
@RequestMapping("/good")
public class CoursesController {
	
	@Autowired
	private CoursesService coursesService;
	
	/**
	 * 根据id查询是商品详情
	 * @param request
	 * @return
	 */
	@RequestMapping("/det")
	public String det(Courses courses,HttpServletRequest request){
		List<Courses> list=coursesService.getCoursesById(courses);
		request.getSession().setAttribute("list", list);
		return "detail";
	}
	
	/**
	 * 搜索
	 * @return
	 */
	@RequestMapping("/fuzzy")
	public String fuzzy(Courses courses,HttpServletRequest request){
		String goods=request.getParameter("goods");
		List<Courses> listCourse=coursesService.getCourseByName(goods);
		request.getSession().setAttribute("listgoods",listCourse);
		return "search";
	}
	
}
