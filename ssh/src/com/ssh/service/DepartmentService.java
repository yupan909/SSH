package com.ssh.service;

import java.util.List;

import com.ssh.dao.DepartmentDao;
import com.ssh.entities.Department;
import com.ssh.entities.Employee;

public class DepartmentService {
	private DepartmentDao departmentDao;

	public DepartmentDao getDepartmentDao() {
		return departmentDao;
	}

	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}
	
	public List<Department> getAll(){
		return this.departmentDao.getAll();
	}
}
