package com.calculadora;

public class Controles {
	
	private static void calcula (){
		
		switch (Operadores.getOperacao()) {
		
		case "+":
			Calculos.soma();
			break;
			
		case "-":
			Calculos.subtrai();
			break;
			
		case "/":
			Calculos.divide();
			break;
			
		case "*":			
			Calculos.multiplica();
			break;
			
		case "%":			
			Calculos.percentual();
			break;
		
		case "%+":			
			Calculos.percentual();
			break;
			
		case "%-":			
			Calculos.percentual();
			break;	
		
		default:
			Operadores.setOperacao("?");
			
		}
		Calculos.limparValores();
	}
	
	
	public static float imprimeCalculo(){
		
		if (Operadores.getOperacao().equals("?")){	
			Operadores.setOperacao("");
			return 0;
			
		}else{
			calcula();
			return DadosBase.getValorResultado();
		}
	}

}
