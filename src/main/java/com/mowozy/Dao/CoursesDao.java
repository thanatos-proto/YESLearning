package com.mowozy.Dao;

import com.mowozy.Entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoursesDao extends JpaRepository<Courses,Integer> {


	List<Courses> findByCId(Integer cid);
	//通过课程号查找

	List<Courses> findByCName(String cname);
	//通过课程名查找

}
