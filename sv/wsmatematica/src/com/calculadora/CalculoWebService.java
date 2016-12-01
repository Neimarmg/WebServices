package com.calculadora;


public class CalculoWebService {
	
	private void calcula(String operacao, float valor1, float valor2 ){
		Operadores.setOperacao(operacao);
		DadosBase.setNumerador(valor1);
		DadosBase.setDenominador(valor2);		
	}
	
	
	public String getResultado(String operacao, float numerador, float Denonominador){
		calcula(operacao, numerador, Denonominador);		
		return String.valueOf(Controles.imprimeCalculo());	
	}
}
