package com.ssh.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ModelDriven;
import com.ssh.entities.Department;
import com.ssh.entities.Employee;
import com.ssh.service.DepartmentService;
import com.ssh.service.EmployeeService;

public class EmployeeAction extends BaseAction implements ModelDriven<Employee>{
	private EmployeeService employeeService;
	private DepartmentService departmentService;
	private Employee employee = new Employee();
	
	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public DepartmentService getDepartmentService() {
		return departmentService;
	}

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	
	public String list(){
		List<Employee> list = this.employeeService.getAll();
		this.httpRequest.setAttribute("employeeList", list);
		return "list";
	}
	
	public String delete(){
		String sid = this.httpRequest.getParameter("id");
		this.employeeService.delete(Integer.parseInt(sid));
		return SUCCESS;
	}
	
	public String input(){
		List<Department> list = this.departmentService.getAll();
		this.httpRequest.setAttribute("departments", list);
		return INPUT;
	}
	
	public String save(){
		this.employee.setCreateTime(new Date());
		this.employeeService.save(this.employee);
		return SUCCESS;
	}

	public Employee getModel() {
		return this.employee;
	}
}
