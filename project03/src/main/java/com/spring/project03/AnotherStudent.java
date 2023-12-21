package com.spring.project03;

public class AnotherStudent {
	
	int id;
	MathCheat mathcheat;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public MathCheat getMathcheat() {
		return mathcheat;
	}
	public void setMathcheat(MathCheat mathcheat) {
		this.mathcheat = mathcheat;
	}
	
	public void cheating()
	{ 
		mathcheat.mathCheat();
	}

}
