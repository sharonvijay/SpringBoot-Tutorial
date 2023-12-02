package com.spring.project02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Student student1 = context.getBean("Student1", Student.class);		
		student1.displayStudentInfo();
		
		Student student2 = context.getBean("Student2", Student.class);
		student2.displayStudentInfo();
		
		
		Student student3 = context.getBean("Student3", Student.class);
		student3.displayStudentInfo();
		
		
		((ClassPathXmlApplicationContext) context).close();
	}

}
