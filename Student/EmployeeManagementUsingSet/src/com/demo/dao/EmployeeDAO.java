package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeDAO {

	void save(Employee e);

	Employee searchbyid(int id);

	boolean deletebyname(String name);

	boolean deletebyid(int id);

	List<Employee> searchbyname(String name1);

	Set<Employee> findAll();

	boolean updateSalary(int id, double sal);

	Set<Employee> sortBySal();
	
	

	

}
