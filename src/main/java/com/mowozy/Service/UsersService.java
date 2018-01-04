package com.mowozy.Service;

import com.mowozy.Dao.UsersDao;
import com.mowozy.Entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by moonwolfzy on 2017-12-12.
 */

@Service
public class UsersService {
    @Autowired
    private UsersDao userDao;

    public boolean verifyUser(Users user) {
        if (!userDao.findByEmailAndPassword(user.getEmail(), user.getPassword()).isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean registerUser(Users user){
        if(userDao.findByEmail(user.getEmail()).isEmpty()){
            userDao.save(user);
            return true;
        }
        else{
            return false;
        }
    }

    public String getUnameByEmail(String email) {
        List<Users> usersList =userDao.findByEmail(email);
        if(usersList.isEmpty())
            return null;
        return usersList.get(0).getuName();
    }
}

