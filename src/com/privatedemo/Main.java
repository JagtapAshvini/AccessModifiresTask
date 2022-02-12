package com.privatedemo;

public class Main {
	public static void main(String[] args) {
		
		Employee employee=new Employee();
		employee.setId(101);
		employee.setName("John");
		
		System.out.println("Employee Details: ");
		System.out.println("ID: "+employee.getId());
		System.out.println("Name: "+employee.getName());
		
	}

}
