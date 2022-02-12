package com.defaultdemo;

import com.protecteddemo.Department;

//default access specifier
/*
* it can apply to global variables,local variables,methods,constructor,inner class only,outer class.
* there is no need to write default keyword.
* if there is not any access specifier is used then it will be treated as default.
* it can access only within the package not out side the package.
*/
public class Employee extends Department {
	
	 int id;             
     String name;
	
	 Employee() {}
	 Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

    int getId() {
		return id;
	}

    void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.setDeptId(101);
		e.setDeptName("Fianance");
		e.setId(111);
		e.setName("Shijarath");
		
		System.out.println("Employee Details: ");
		System.out.println("ID: "+e.getDeptId());
		System.out.println("Name: "+e.getDeptName());
		System.out.println("Emp ID: "+e.getId());
		System.out.println("Emp Name: "+e.getName());
	}
	
}
