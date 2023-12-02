package com.spring.project02;

public class Student {
	
	private int id;
	private String studentName;



	public Student(int id, String studentName) {
		this.id = id;
		this.studentName = studentName;
	}



	public void displayStudentInfo()
	{
		System.out.println("Student Name is "+studentName+" and Id is "+id);
	}


}
