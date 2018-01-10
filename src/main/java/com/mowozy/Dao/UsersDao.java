package com.mowozy.Dao;

import com.mowozy.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by moonwolfzy on 2017-12-12.
 */


public interface UsersDao extends JpaRepository<Users,Integer>{
    List<Users> findByEmailAndPassword(String email, String password);
	//通过邮箱和密码查找

    List<Users> findByEmail(String email);
	//通过邮箱查找
}
