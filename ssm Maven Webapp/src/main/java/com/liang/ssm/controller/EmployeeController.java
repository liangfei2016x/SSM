package com.liang.ssm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.liang.ssm.model.Employee;
import com.liang.ssm.service.EmployeeService;
@Controller
@RequestMapping("/emp")
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	@Autowired
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@RequestMapping(value="/showEmp",method=RequestMethod.GET)
	public String showEmp(@RequestParam("empId")Integer empId,Model model){
		Employee employee=employeeService.getEmpId(empId);
		model.addAttribute(employee);
		return "empOne";
	}
	@RequestMapping(value="allEmp",method=RequestMethod.GET)
	public String showAllEmp(Model model){
		List<Employee> emps=employeeService.getEmployees();
		model.addAttribute("employees",emps);
		return "empAll";
	}
	@RequestMapping("/hello")
	public String helloSpring(){
		System.out.println("springmvc");
		return "hello";
	}
}
