package com.liang.ssm.service;

import java.util.List;

import com.liang.ssm.model.Employee;

public interface EmployeeService {
	public Employee getEmpId(Integer id);
	public List<Employee> getEmployees();
}
