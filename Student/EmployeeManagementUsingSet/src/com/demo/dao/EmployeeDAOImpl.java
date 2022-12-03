package com.demo.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	static Set<Employee> hset;
	static {
		hset=new HashSet<>();
		hset.add(new Employee(1, "Hello", 9999999, new Date()));
		hset.add(new Employee(2, "World", 9988969, new Date()));
		hset.add(new Employee(7, "CR7", 7777777, new Date()));
	}

	@Override
	public void save(Employee e) {
		hset.add(e);
	}

	@Override
	public Employee searchbyid(int id) {
		for(Employee e:hset) {
		if (e.getId()==id) {
		return e;
		}
		
		}
		return null;
}

	@Override
	public boolean deletebyname(String name) {
		Iterator<Employee>it=hset.iterator();
		while(it.hasNext()) {
			if(it.next().getName().equals(name)) {
				it.remove();
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deletebyid(int id) {
		return hset.remove(new Employee (id));
	}

	@Override
	public List<Employee> searchbyname(String name1) {
		List<Employee>eli=new ArrayList<>();
		for(Employee e:hset) {
			if(e.getName().equals(name1)) {
				eli.add(e);
			}
			if(eli.size()>0) {
				return eli;
			}
		}
		return null;
	}

	@Override
	public Set <Employee> findAll() {
		if(hset.isEmpty()) {
			return null;
		}
		return hset;
		
	}

	@Override
	public boolean updateSalary(int id, double sal) {
		Employee e = searchbyid(id);
		if(e!=null) {
			e.setSalary(sal);
			return true;
		}
		return false;
	}

	@Override
	public Set<Employee> sortBySal() {
		Set<Employee> ts = new TreeSet();
		if(!hset.isEmpty()) {
			for(Employee e:hset) {
				ts.add(e);
			}
			return ts;
		}
		return null;
	}
	
	
	
	
	
}
