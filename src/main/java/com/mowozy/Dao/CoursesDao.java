package com.mowozy.Dao;

import com.mowozy.Entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoursesDao extends JpaRepository<Courses,Integer> {

//	public List<Goods> getGoodById(Goods goods);

	List<Courses> findByCId(Integer cid);

//	public List<Goods> getAll();

//	public List<Goods> getGoodByName(String goods);
	List<Courses> findByCName(String cname);

//	public void delete(Goods goods);
//
//	public int update(Goods goods);
//
//	public int insert(Goods goods);

}
