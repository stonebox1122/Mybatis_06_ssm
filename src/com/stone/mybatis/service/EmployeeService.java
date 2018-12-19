package com.stone.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stone.mybatis.bean.Employee;
import com.stone.mybatis.dao.EmployeeMapper;

@Service
public class EmployeeService {	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	public List<Employee> getEmps(){
		return employeeMapper.getEmps();
	}
}
