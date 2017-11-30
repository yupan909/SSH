package com.ssh.service;

import java.util.List;

import com.ssh.dao.EmployeeDao;
import com.ssh.entities.Employee;

public class EmployeeService {
	private EmployeeDao employeeDao;

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	public List<Employee> getAll(){
		return this.employeeDao.getAll();
	}
	
	public void delete(Integer id){
		this.employeeDao.delete(id);
	}
	
	public void save(Employee emp){
		this.employeeDao.save(emp);
	}
}
