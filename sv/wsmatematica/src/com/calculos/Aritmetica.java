package com.calculos;

public class Aritmetica {
	float result;
	String ex;
	
	
	protected float getResult() {
		return result;
	}

		
	protected void setResult(float result) {
		this.result = result;
	}

	
	protected void calcula(String operacao, float valor1, float valor2 ){
		
		switch (operacao) {
		
		case "+":
			setResult((valor1+valor2));
			break;
		
		case "-":
			setResult((valor1-valor2));
			break;
		
		case "/":
			setResult((valor1/valor2));
			break;
			
		case "*":
			setResult((valor1*valor2));		
			break;
		
		default:
			setResult(0);
			break;
		}	
	}
	
}