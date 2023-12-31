package com.spring.project04;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class Client {
	
	public static void main(String[] args)
	{
//		Student student = new Student();
//		MathCheat cheat = new MathCheat();
//		student.setMathcheat(cheat);
//		student.cheating();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Student stu = context.getBean("stu",Student.class);
		
		stu.cheating();
		
		((ClassPathXmlApplicationContext) context).close();
		
		
	}

}