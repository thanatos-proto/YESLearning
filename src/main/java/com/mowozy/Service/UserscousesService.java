package com.mowozy.Service;

import com.mowozy.Dao.CourseDao;
import com.mowozy.Dao.UserscoursesDao;
import com.mowozy.Entity.Courses;
import com.mowozy.Entity.Userscourses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserscousesService {
    @Autowired
    private CourseDao coursedao;

    @Autowired
    private UserscoursesDao userscoursesdao;

    public List<Courses> selectbyuser(int uid){
        List<Userscourses> usercourses = userscoursesdao.findByUId(uid);
        List<Courses> courseList = new ArrayList<>();
        for(int i=0;i<usercourses.size();i++){
            Courses course = coursedao.findByCId(usercourses.get(i).getcId());
            courseList.add(course);
        }
        return courseList;
    }
}
