package com.liang.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.liang.ssm.model.Employee;
import com.liang.ssm.service.EmployeeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class MyBatisTest {
	@Resource
	private EmployeeService employeeService;
	@Test
	public void test(){
		Employee employee=employeeService.getEmpId(1);
		System.out.println(employee.getFirstName());
	}
	@Test
	public void test1(){
		List<Employee> employees=employeeService.getEmployees();
		System.out.println(employees.get(0).getFirstName());
	}
}
