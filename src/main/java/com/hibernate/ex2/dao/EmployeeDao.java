package com.hibernate.ex2.dao;

import com.hibernate.ex2.model.Employee;

import java.util.List;

public interface EmployeeDao extends Dao<Employee,Long> {
    List<Employee> getEmployee();
}
