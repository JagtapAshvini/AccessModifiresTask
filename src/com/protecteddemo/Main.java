package com.protecteddemo;

public class Main {
	
	public static void main(String[] args) {
		Department dept=new Department();
		dept.deptId=101;
		dept.deptName="IT";
		
		System.out.println("Department Info: ");
		System.out.println("DEPT ID:"+dept.getDeptId());
		System.out.println("Dept Name: "+dept.getDeptName());
		
		System.out.println("-----------------------------------------------");
		
		Department dept2=new Department();
		dept2.setDeptId(102);
		dept2.setDeptName("HR");
		System.out.println("Department Info: ");
		System.out.println("DEPT ID:"+dept2.getDeptId());
		System.out.println("Dept Name: "+dept2.getDeptName());
	}

}
