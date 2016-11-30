package com.calculos;

public class Controlador {
	
	private static void carregaOperacao(){
		Operador.setOperacao(Operador.getOperacao());
	}
	
	
	/*private static void carregaValores(){
		if (Operador.getOperacao().equals(".")) {
			Dados.setNumerador(Dados.getNumerador());
			carregaOperacao();
		}	
		Dados.setDenominador(Dados.getDenominador());
	}
	
	
	private static void carregaDados(){
		if (!Operador.getOperacao().equals("=")){
			carregaValores();
			Calculador.imprimeCalculo();
			carregaOperacao();
			Calculador.limparValores();
			carregaDados();
		}
	}
	
	
	public static void executaCalculadora(){
		Operador.setOperacao(".");
		carregaDados();
		Calculador.imprimeCalculo();
	}*/
}
