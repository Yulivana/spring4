package com.hibernate.test.service;

import com.hibernate.multy.models.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class TestUserServiceTest {

    @Autowired
    private TestUserService userService;

    @Test
    public void getTest() {
        User user = userService.get(1);
        assertNotNull(user);
    }
}