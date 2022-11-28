package com.hibernate.test.dao;

import com.hibernate.multy.models.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Component;

@Component
public class TestUserDao {

    @PersistenceContext
    private EntityManager em;

    public User get(long id){
        return em.find(User.class, id);
    }

}
