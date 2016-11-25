package com.calculos;

public class servicoCalculo {
	Aritmetica calculo = new Aritmetica();
	
	public String getResultado(String operacao, float valor1, float valor2) throws NumberFormatException {
		try{		
			calculo.calcula(operacao, valor1, valor2);			
			return String.valueOf(calculo.getResult());
					
		}catch(NullPointerException e){
			return "Valores invalidos";
			
		}catch (NumberFormatException e) {
			return "Valor numerico inv�lido";
		}	
	}
}
