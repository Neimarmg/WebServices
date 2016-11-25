package com.calc.service;

public class calculadora {
	float result;
	
	private float getResult() {
		return result;
	}

	public void setResult(float result) {
		this.result = result;
	}

	private void calcular(String operacao, float valor1, float valor2 ){
		switch (operacao) {
		
		case "+":
			setResult(valor1+valor2);
		
		case "-":
			setResult(valor1-valor2);
		
		case "/":
			setResult(valor1/valor2);
		
		case "*":
			setResult(valor1*valor2);
		
			break;
		default:
			setResult(0);
			break;
		}				
	}
	
	
	public String getResultado(String operacao, float valor1, float valor2) {
		calcular(operacao, valor1, valor2);
		return "Resultado retornado:" +getResult();
	}
}