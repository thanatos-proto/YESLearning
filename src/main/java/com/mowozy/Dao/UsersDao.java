package com.mowozy.Dao;

import com.mowozy.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by moonwolfzy on 2017-12-12.
 */


public interface UsersDao extends JpaRepository<Users,Integer>{
    List<Users> findByEmailAndPassword(String email, Integer password);

}
