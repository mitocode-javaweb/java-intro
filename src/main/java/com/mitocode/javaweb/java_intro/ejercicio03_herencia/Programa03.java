package com.mitocode.javaweb.java_intro.ejercicio03_herencia;

public class Programa03 {

	public static void main(String[] args) {
		CuentaEmpresa cuentaEmpresa1 = new CuentaEmpresa("1234-5678", "Pablo");
		cuentaEmpresa1.prestamo(600);
		System.out.println("CuentaEmpresa1: " + cuentaEmpresa1);
		System.out.println("***********");
		
		CuentaEmpresa cuentaEmpresa2 = new CuentaEmpresa("ABCD-123456", "Emilio", 1000);
		cuentaEmpresa2.prestamo(600);
		cuentaEmpresa2.prestamo(300);
		System.out.println("CuentaEmpresa2: " + cuentaEmpresa2);
		
		System.out.println("***********");
		Cuenta cuentaEmpresa3 = new CuentaEmpresa("ABCD-123456", "Emilio", 500, 2000);
		System.out.println("CuentaEmpresa3: " + cuentaEmpresa3);
		CuentaEmpresa cuentaEmpresa4 = (CuentaEmpresa) cuentaEmpresa3;
		cuentaEmpresa4.prestamo(350);
		System.out.println("CuentaEmpresa3: " + cuentaEmpresa3);
		
	}
}
