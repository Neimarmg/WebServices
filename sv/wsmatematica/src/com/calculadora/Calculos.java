package com.calculadora;

public class Calculos {
	
	public static void limparValores(){
		DadosBase.setNumerador(0);
		DadosBase.setDenominador(0);	
	}
	
	
	protected static void soma(){
		if (DadosBase.getNumerador() > 0) {
			if (DadosBase.getNumerador() < 0 && DadosBase.getDenominador()< 0){
				DadosBase.setValorResultado(DadosBase.getNumerador() - DadosBase.getDenominador());

			}else{
				DadosBase.setValorResultado(DadosBase.getNumerador() + DadosBase.getDenominador());
			}
		
		}else{
			DadosBase.setValorResultado(DadosBase.getValorResultado() + DadosBase.getDenominador());
		}
	}
	
	
	protected static void subtrai(){
		if (DadosBase.getNumerador() > 0 || DadosBase.getNumerador() < 0 ) {
			if (DadosBase.getNumerador() < 0 && DadosBase.getDenominador() < 0){
				DadosBase.setValorResultado(DadosBase.getNumerador() - DadosBase.getDenominador());

			}else{
				DadosBase.setValorResultado(DadosBase.getNumerador() - DadosBase.getDenominador());
			}
		
		}else{
			DadosBase.setValorResultado(DadosBase.getValorResultado() - DadosBase.getDenominador());
		}
	}
	
	
	protected static void divide(){		
		if (DadosBase.getNumerador() > 0) {
			DadosBase.setValorResultado(DadosBase.getNumerador() / DadosBase.getDenominador());
		
		}else{
			if(DadosBase.getDenominador() > 0){
				DadosBase.setValorResultado(DadosBase.getValorResultado() / DadosBase.getDenominador());
			
			}else{	
				DadosBase.setValorResultado(DadosBase.getDenominador());
			}
		}
	}

	
	protected static void multiplica(){
		if (DadosBase.getNumerador() > 0) {
			DadosBase.setValorResultado(DadosBase.getNumerador() * DadosBase.getDenominador());
		
		}else{
			DadosBase.setValorResultado(DadosBase.getValorResultado() * DadosBase.getDenominador());
		}
		
	}

	
	protected static void percentual(){
		multiplica();
		DadosBase.setValorResultado(((DadosBase.getValorResultado()) /100));
		
		if (DadosBase.getNumerador() > 0) {
			
			switch (Operadores.getOperacao()) {
				case "%":					
					DadosBase.getValorResultado();
					break;
				
				case "%+":			
					DadosBase.setValorResultado((DadosBase.getNumerador() + DadosBase.getValorResultado()));
					break;
					
				case "%-":			
					DadosBase.setValorResultado((DadosBase.getNumerador() - DadosBase.getValorResultado()));
					
					break;
			}
		}else{
			DadosBase.setValorResultado(0);
		}		
	}
}