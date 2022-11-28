package com.hibernate.test.service;

import com.hibernate.multy.models.User;
import com.hibernate.test.dao.TestUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class TestUserService {

    @Autowired
    private TestUserDao userDao;

    @Transactional
    public User get(long id){
        return userDao.get(id);
    }
}
