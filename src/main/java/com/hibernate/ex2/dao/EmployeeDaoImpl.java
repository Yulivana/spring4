package com.hibernate.ex2.dao;

import com.hibernate.ex2.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl extends BaseDao<Employee, Long> implements EmployeeDao{

    public EmployeeDaoImpl(){
        super();
        clazz = Employee.class;
    }

    @Override
    public List<Employee> getEmployee() {
        return getEm()
            .createQuery("from Employee").getResultList();
    }
}
