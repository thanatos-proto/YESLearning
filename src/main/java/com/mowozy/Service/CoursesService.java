package com.mowozy.Service;

import com.chen.mapper.GoodsMapper;
import com.chen.pojo.Goods;
import com.mowozy.Dao.CoursesDao;
import com.mowozy.Entity.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesService {
	
	@Autowired
	private CoursesDao coursesDao;
	
	public List<Courses> getCoursesById(Courses cid) {
		return coursesDao.findByCId(cid);
	}

	public List<Courses> getAll() {
		return coursesDao.findAll();
	}

	public List<Courses> getGoodByName(String cname) {
		return coursesDao.findByCName(cname);
	}

//	public int delete(Courses courses) {
//		return coursesDao.delete(goods);
//	}
//
//	public int update(Courses courses) {
//		return coursesDao.update(goods);
//	}
//
//	public int insert(Courses courses) {
//		return coursesDao.insert(goods);
//	}


}
