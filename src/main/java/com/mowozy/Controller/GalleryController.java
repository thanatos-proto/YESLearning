package com.mowozy.Controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by moonwolfzy on 2017-12-12.
 */

@Controller
@EnableAutoConfiguration
public class GalleryController {

//    @Autowired
//    private UsersService usersService;

    @RequestMapping("/event-list")
    String eventlist(Model model) {
        return "event-list";
    }
	//活动列表

    @RequestMapping("/event-grid")
    String eventgrid(Model model) {
        return "event-grid";
    }

	//活动列表
	@RequestMapping("/event-details")
    String eventdetails(Model model) {
        return "event-details";
    }

	//活动细节
	@RequestMapping("/course-list")
    String courselist(Model model) {
        return "course-list";
    }
	//课程列表

    @RequestMapping("/course-grid")
    String coursegrid(Model model) {
        return "course-grid";
    }
	//课程列表

    @RequestMapping("/course-details")
    String coursedetails(Model model) {
        return "course-details";
    }

	//课程细节
	@RequestMapping("/course-purchase")
    String coursepurchase(Model model) {
        return "course-purchase";
    }
	//购买课程

    @RequestMapping("/about-us")
    String aboutus(Model model) {
        return "about-us";
    }

	//关于我们
	@RequestMapping("/news")
    String news(Model model){
        return "news";
    }

	//新闻
	@RequestMapping("/news-details")
    String newsdetails(Model model){
        return "news-details";
    }

	//新闻细节
	@RequestMapping("/artical")
    String artical(Model model){
        return "artical";
    }

	//文章
	@RequestMapping("/artical-details")
    String articaldetails(Model model){
        return "artical-details";
    }

	//文章细节
	@RequestMapping("/gallery-fullwidth")
    String galleryfullwidth(Model model) {
        return "gallery-fullwidth";
    }

	//图廊
	@RequestMapping("/teachers")
    String teachers(Model model){
        return "teachers";
    }

	//教师列表
	@RequestMapping("/teachers-details")
    String teachersdetails(Model model){
        return "teachers-details";
    }
	//教师细节

    @RequestMapping("/contact")
    String contact(Model model){
        return "contact";
    }
	//
}





