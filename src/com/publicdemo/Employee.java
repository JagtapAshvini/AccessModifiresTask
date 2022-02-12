package com.publicdemo;

//public access specifier
/*
* it can apply to global variables,local variables,static variables,methods,constructor,inner class,outer class.
* it can access only within the class,within the package,out side the package as well as.
*/
public class Employee {
	
	public int empId;
	public String empName;
	
	public Employee() {
		
	}
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	protected int getEmpId() {
		return empId;
	}
	protected void setEmpId(int empId) {
		this.empId = empId;
	}
	protected String getEmpName() {
		return empName;
	}
	protected void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void setEmployeeData()
	{
		Employee e=new Employee();
		e.setEmpId(101);
		e.setEmpName("John");
		printData(e);
	
	}
	public void printData(Employee e)
	{
		System.out.println("Employee Info: ");
		System.out.println("Employee ID: "+e.getEmpId());
		System.out.println("Employee Name: "+e.getEmpName());
	}

}
