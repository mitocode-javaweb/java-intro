package com.mitocode.javaweb.java_intro.ejercicio04_modificadores;

import com.mitocode.javaweb.java_intro.ejercicio04_modificadores.subpackage.Cuenta;

public class Programa04 {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta("99999-33333", "Juan Pablo", 1000);
		System.out.println("Cuenta: " + cuenta);
		
		// cuenta.saldo // no compila
	}
}
