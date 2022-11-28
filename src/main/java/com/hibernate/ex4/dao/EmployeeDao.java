package com.hibernate.ex4.dao;

import com.hibernate.ex4.model.Employee;

import java.util.List;

public interface EmployeeDao extends Dao<Employee,Long> {
    List<Employee> getEmployee();
}
