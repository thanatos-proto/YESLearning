package com.mowozy.Dao;

import com.mowozy.Entity.Userscourses;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserscoursesDao extends JpaRepository<Userscourses,Integer> {
    List<Userscourses> findByUId(int uId);
}
