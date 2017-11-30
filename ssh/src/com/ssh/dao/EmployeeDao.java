package com.ssh.dao;

import java.util.List;

import com.ssh.entities.Employee;

public class EmployeeDao extends BaseDao{

	public List<Employee> getAll(){
		String hql = "FROM Employee e LEFT OUTER JOIN FETCH e.department";
		return getSession().createQuery(hql).list();
	}
	
	public void delete(Integer id){
		String hql = "DELETE FROM Employee e WHERE e.id= ?";
		getSession().createQuery(hql).setInteger(0, id).executeUpdate();
	}
	
	public void save(Employee emp){
		getSession().save(emp);
	}
}
