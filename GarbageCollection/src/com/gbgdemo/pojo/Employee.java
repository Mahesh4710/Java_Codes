package com.gbgdemo.pojo;

public class Employee {
	private int empid;

	public Employee(int empid) {
		super();
		this.empid = empid;
	}

	public Employee() {
		super();
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}
	//gets called when object is going to garbage collected
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize called by employee with id "+empid);
	}
	
}
