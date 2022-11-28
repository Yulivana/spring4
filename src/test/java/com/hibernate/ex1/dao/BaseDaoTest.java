package com.hibernate.ex1.dao;

import com.hibernate.ex1.model.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-hibernate-ex1.xml")
public class BaseDaoTest {

    @Autowired
    private EmployeeDaoImpl employeeDao;

    @Test
    public void add() {
       /* Employee e = new Employee();
        e.setFirstName("Yuli");
        e.setLastName("Slabko");
        e = employeeDao.add(e);*/
        Assert.assertEquals("Yuli", employeeDao.get(1L).getFirstName());
    }

}