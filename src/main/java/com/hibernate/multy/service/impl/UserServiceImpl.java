package com.hibernate.multy.service.impl;

import com.hibernate.multy.dao.impl.UserDao;
import com.hibernate.multy.models.User;
import com.hibernate.multy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User get(long id) {
        return userDao.get(id);
    }


}
