package com.hibernate.ex1.dao;

import com.hibernate.ex1.model.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDaoImpl extends BaseDao<Employee, Long> implements EmployeeDao{

    public EmployeeDaoImpl(){
        super();
        clazz = Employee.class;
    }
}
