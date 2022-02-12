package com.privatedemo;

//private access specifier
/*
 * it can apply to global variables,methods,constructor,inner class only.
 * outer class can not be private.
 * it can access only within the class not outside the class.
 * scope is very limited.
 * local variables can not be private.
 */
public class Employee {
	
	private int id;             
	private String name;
	
	public Employee() {}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	

}
