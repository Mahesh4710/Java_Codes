package com.collections;

public class Employee {
	String Empname, EmpCode;
	long EmpSalary;
	public Employee(String empname, String empCode, long empSalary) {
		super();
		Empname = empname;
		EmpCode = empCode;
		EmpSalary = empSalary;
	}
	public String getEmpname() {
		return Empname;
	}
	public String getEmpCode() {
		return EmpCode;
	}
	public long getEmpSalary() {
		return EmpSalary;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(!(obj instanceof Employee))
				return false;
		Employee emp=(Employee) obj;
		
		return super.equals(obj);
	}
}
