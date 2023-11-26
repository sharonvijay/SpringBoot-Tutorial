package com.spring.project01;

public class Airtel implements Sim {
    public Airtel() {
    	System.out.println("Airtel");
    }
	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("Calling using Airtel Sim");
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("Mobile Data using Airtel Sim");
		
	}

}
