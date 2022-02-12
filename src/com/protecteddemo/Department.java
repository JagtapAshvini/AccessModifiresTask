package com.protecteddemo;

//protected access specifier
/*
* it can apply to global variables,methods,constructor,inner class only.
* outer class can not be private.
* it can access only within the package & another package as well when inheritance happens while calling.
* local variables can not be protected.
*/
public class Department {
	
	protected int deptId;
	protected String deptName;
	
	protected Department() {
		
	}

	protected Department(int deptId, String deptName) {
		this.deptId = deptId;
		this.deptName = deptName;
	}

	protected int getDeptId() {
		return deptId;
	}

	protected void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	protected String getDeptName() {
		return deptName;
	}

	protected void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	

}
