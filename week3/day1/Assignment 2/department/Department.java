package org.department;

import org.college.College;

public class Department extends College{
	public void deptName() {
	// TODO Auto-generated method stub
System.out.println("Department Name is from Department class");
}
	public static void main(String[] args) {
		Department d=new Department();
		d.collegeCode();
		d.collegeName();
		d.deptName();
		d.collegeRank();
	}
}
