package com.mitocode.javaweb.java_intro.ejercicio07_interfaces;

public class Programa07 {

	public static void main(String[] args) {
		OperacionBancaria cuenta1 = new CuentaEmpresa("111-222", "Diego", 2000, 0.02);
		System.out.println("Cuenta 1" + cuenta1);
		
		cuenta1.deposito(200);
		System.out.println("Deposito 200:" + cuenta1);
		
		cuenta1.retiro(500);
		System.out.println("Retiro 500:" + cuenta1);
	}
}
