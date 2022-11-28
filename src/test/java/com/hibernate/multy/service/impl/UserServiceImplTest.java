package com.hibernate.multy.service.impl;

import com.hibernate.multy.config.HibernateConf;
import com.hibernate.multy.models.User;
import com.hibernate.multy.service.UserService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = HibernateConf.class)
public class UserServiceImplTest {

    @Autowired
    private UserService userService;


    @Test
    public void getTest() {
        User user = userService.get(1);
        assertNotNull(user);
        assertEquals(user.getEmail(), "user@tut.by");
    }

}