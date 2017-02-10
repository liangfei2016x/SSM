package com.liang.ssm.dao;

import java.util.List;

import com.liang.ssm.model.Employee;

public interface EmployeeDao {
	public Employee getById(Integer id);
	public List<Employee> getAllEmp();
}
