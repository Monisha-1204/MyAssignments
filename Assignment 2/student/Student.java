package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		// TODO Auto-generated method stub
		System.out.println("Student Name from student class");
	}
	public void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("Student department from student class");
	}
	public void studentId() {
		// TODO Auto-generated method stub
		System.out.println("from student class");
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.studentId();
		s.studentName();
		s.studentDept();
		s.deptName();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();



	}
}



