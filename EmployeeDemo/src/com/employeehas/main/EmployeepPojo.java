package com.employeehas.main;

public class EmployeepPojo {
	long id;
	String name;
	double salary;
	public EmployeepPojo() {
		super();
	}
	public EmployeepPojo(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	
	long raiseSalary() {
		return (long) (this.salary + this.salary*0.5);
	}
}
