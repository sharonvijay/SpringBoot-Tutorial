package com.spring.project03;

public class Student {
	
	int id;
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	MathCheat mathcheat;
	
	public void setMathcheat(MathCheat mathcheat) {
		this.mathcheat = mathcheat;
	}


	public void cheating()
	{ 
		mathcheat.mathCheat();
	}

}
