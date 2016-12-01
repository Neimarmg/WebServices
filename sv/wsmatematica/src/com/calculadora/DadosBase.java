package com.calculadora;

public class DadosBase {
 	static float numerador;
	static float denominador;
	static float valorResultado;
 	
	public DadosBase(float numerador, float denominador) {
		DadosBase.numerador = numerador;
		DadosBase.denominador =denominador;
	}
	
	
	public static float getNumerador() {
		return DadosBase.numerador;
	}

	
	public static void setNumerador(float numerador) {
		DadosBase.numerador = numerador;
	}

	
	public static float getDenominador() {
		return denominador;
	}

	
	public static void setDenominador(float denominador) {
		DadosBase.denominador = denominador;
	}

	
	public static float getValorResultado() {
		return valorResultado;
	}

	
	public static void setValorResultado(float valorDeCalculo) {
		DadosBase.valorResultado = valorDeCalculo;		
	}


}
