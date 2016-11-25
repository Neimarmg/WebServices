package com.calculos;

public class calculadora {
	float result;
	String ex;
	
	private float getResult() {
		return result;
	}

	private void setResult(float result) {
		this.result = result;
	}

	private void calcula(String operacao, float valor1, float valor2 ){
		
		switch (operacao) {
		
		case "1":
			setResult((valor1+valor2));
			break;
		
		case "2":
			setResult((valor1-valor2));
			break;
		
		case "3":
			setResult((valor1/valor2));
			break;
			
		case "4":
			setResult((valor1*valor2));		
			break;
		
		default:
			setResult(0);
			break;
		}	
	}
	
	
	public String getResultado(String operacao, float valor1, float valor2) throws NumberFormatException {
		try {
			calcula(operacao, valor1, valor2);
			return "Resultado retornado:" +getResult();
			
		} catch (NullPointerException e) {
			return "Opera��o n�o informada!";
			
		}catch (NumberFormatException e) {
			return "Valores no informados!";
		}
	}
}