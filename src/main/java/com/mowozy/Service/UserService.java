package com.mowozy.Service;

import com.mowozy.Dao.UsersDao;
import com.mowozy.Entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by moonwolfzy on 2017-12-12.
 */

@Service
public class UserService {
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
}

