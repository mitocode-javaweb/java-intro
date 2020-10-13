package com.mitocode.javaweb.java_intro;

public class Bicicleta {

	// variable global - variable de instancia
	int velocidad = 0;
	int antiguedad = 5;
	
	// variable de clase
	static int variableEstatica = 20;
	
	// metodos de instancia
	public void aumentarVelocidad(int incremento) {
		// variable local
		int otraVariable = 0;
		velocidad = velocidad + incremento;
	}
	
	public void disminuirVelocidad( int disminuir) {
		velocidad = velocidad - disminuir;
	}
	
	// metodos de clase
	public static String mostrarMarca() {
		return "Monark";
	}
	
}
