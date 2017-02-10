package com.liang.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.liang.ssm.dao.EmployeeDao;
import com.liang.ssm.model.Employee;
import com.liang.ssm.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Resource
	private EmployeeDao employeeDao;

	@Override
	public Employee getEmpId(Integer id) {
		// TODO Auto-generated method stub
		return employeeDao.getById(id);
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.getAllEmp();
	}
	

}
