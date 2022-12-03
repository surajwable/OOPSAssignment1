package com.demo.beans;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private double salary;
	private Date doj;
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, double salary, Date doj) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.doj = doj;
	}

	public Employee(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String str=sdf.format(this.doj);
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", Date of Joining :" + str + "]";
	}

	@Override
	public int compareTo(Employee o) {
		System.out.println("in CompareTO"+this.id+"-----------"+o.id);
		if(this.salary>o.salary) {
			return -1;
		}
		else if(this.salary==o.salary) {
			return 0;
		}
		else
		return 1;
	}
	
	
	
	

}
