package com.mitocode.javaweb.java_intro.ejercicio02_estaticos;

public abstract class ConvertidorMonedaUitl {

	public static double COMISION_COMPRA = 0.06;
	
	public static double convertirADolares(double tipoCambio, double montoAComprar) {
		return montoAComprar * tipoCambio * (1 + COMISION_COMPRA);
	}
	
	public abstract void otroMetodo();
	
}
