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

    @RequestMapping("/event-grid")
    String eventgrid(Model model) {
        return "event-grid";
    }

    @RequestMapping("/event-details")
    String eventdetails(Model model) {
        return "event-details";
    }

    @RequestMapping("/course-list")
    String courselist(Model model) {
        return "course-list";
    }

    @RequestMapping("/course-grid")
    String coursegrid(Model model) {
        return "course-grid";
    }

    @RequestMapping("/course-details")
    String coursedetails(Model model) {
        return "course-details";
    }

    @RequestMapping("/news")
    String news(Model model){
        return "news";
    }

    @RequestMapping("/news-details")
    String newsdetails(Model model){
        return "news-details";
    }

    @RequestMapping("/artical")
    String artical(Model model){
        return "artical";
    }

    @RequestMapping("/artical-details")
    String articaldetails(Model model){
        return "artical-details";
    }

    @RequestMapping("/gallery-fullwidth")
    String galleryfullwidth(Model model) {
        return "gallery-fullwidth";
    }

    @RequestMapping("/teachers")
    String teachers(Model model){
        return "teachers";
    }

    @RequestMapping("/teachers-details")
    String teachersdetails(Model model){
        return "teachers-details";
    }

    @RequestMapping("/contact")
    String contact(Model model){
        return "contact";
    }
}





