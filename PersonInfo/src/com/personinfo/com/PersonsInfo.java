package com.personinfo.com;

public class PersonsInfo {
	String name;
	int age;
	PersonsInfo(String pName,int pAge){
		this.name=pName;
		this.age=pAge;		
	}
	
	String printName(){
		return name;		
	}
	
	int printAge() {
		return age;
	}

}