package com.spring.project01;

public class Vodaphone implements Sim {
    public Vodaphone()
    {
    	System.out.println("Vodaphone");
    }
	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("Calling using Vodaphone Sim");
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("Mobile Data using Vodaphone Sim");
	}

}
