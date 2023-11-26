package com.spring.project01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//		Airtel airtel = new Airtel();
//		airtel.calling();
//		airtel.data();
		
//		Sim sim = new Airtel();
//		sim.calling();
//		sim.data();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		System.out.println("");
		
		Airtel airtel = context.getBean("Airtel",Airtel.class);
		airtel.calling();
		airtel.data();
		
		System.out.println("");
		
		Sim sim = context.getBean("Sim", Sim.class);  // Vodafone Class
        sim.calling();
        sim.data();
		
		
		((ClassPathXmlApplicationContext) context).close();
    }
}
