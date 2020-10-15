package com.mitocode.javaweb.java_intro.ejercicio05_polimorfismo;

public class Programa05 {

	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta("10101-2020", "Pablo", 500);
		aplicarRetiro(cuenta1, 50);
		System.out.println("Cuenta1: " + cuenta1);
		
		Cuenta cuenta2 = new CuentaAhorros("20202-2020", "Emilio", 500, 0.05);
		aplicarRetiro(cuenta2, 50);
		System.out.println("Cuenta2: " + cuenta2);
		
		CuentaAhorros cuenta3 = new CuentaAhorros("30303-2020", "Fernando", 500, 0.05);
		aplicarRetiro(cuenta3, 50);
		System.out.println("Cuenta3: " + cuenta3);
		
		CuentaEmpresa cuenta4 = new CuentaEmpresa("40404-2020", "Rafael", 500, 2000);
		aplicarRetiro(cuenta4, 50);
		System.out.println("Cuenta4: " + cuenta4);
	}
	
	public static void aplicarRetiro(Cuenta cuenta, double monto) {
		cuenta.retiro(monto);
	}
}
