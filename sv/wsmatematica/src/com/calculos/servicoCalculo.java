package com.calculos;


public class servicoCalculo {
	
	private void calcula(String operacao, float valor1, float valor2 ){
		Operador.setOperacao(operacao);
		Dados.setNumerador(valor1);
		Dados.setDenominador(valor2);
		//Controlador.executaCalculadora();
	}
	
	public String getResultado(String operacao, float valor1, float valor2){
		calcula(operacao, valor1, valor2);
		
		return String.valueOf(Calculador.imprimeCalculo());	
	}
}
