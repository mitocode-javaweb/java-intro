package com.mitocode.javaweb.java_intro.ejercicio07_interfaces;

public abstract class Cuenta {
	
	static double COMISION_RETIRO = 5;

	String numeroCuenta;
	String nombreTitular;
	protected double saldo;

	public Cuenta(String numeroCuenta, String nombreTitular) {
		this.numeroCuenta = numeroCuenta;
		this.nombreTitular = nombreTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", nombreTitular=" + nombreTitular + ", saldo=" + saldo + "]";
	}

}
