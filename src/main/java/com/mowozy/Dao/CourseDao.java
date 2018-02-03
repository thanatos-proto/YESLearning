package com.mowozy.Dao;

import com.mowozy.Entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

public interface CourseDao extends JpaRepository<Courses,Integer> {

    Courses findByCId(int cId);

}
