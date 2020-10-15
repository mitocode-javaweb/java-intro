package com.mitocode.javaweb.java_intro.ejercicio04_modificadores.subpackage;

public class Cuenta {
	
	static double COMISION_RETIRO = 5;

	String numeroCuenta;
	String nombreTitular;
	protected double saldo;

	// constructor por defecto
//	public Cuenta() {
//		
//	}

	public Cuenta(String numeroCuenta, String nombreTitular) {
		this.numeroCuenta = numeroCuenta;
		this.nombreTitular = nombreTitular;
		this.saldo = 0;
	}

	public Cuenta(String numeroCuenta, String nombreTitular, double depositoInicial) {
		this.numeroCuenta = numeroCuenta;
		this.nombreTitular = nombreTitular;
		deposito(depositoInicial);
	}
	
	public void deposito(double monto) {
		// mandar a imprimir
		// obtener
		// guardar auditoria
//		this.saldo = this.saldo + monto;
		this.saldo += monto;
	}
	
	public void retiro(double monto) {
//		this.saldo = this.saldo - (monto + 5);
		if(this.saldo >= monto + COMISION_RETIRO) {
			this.saldo -= (monto + COMISION_RETIRO);
		} else {
			System.out.println("Saldo insuficiente!");
		}
		
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", nombreTitular=" + nombreTitular + ", saldo=" + saldo + "]";
	}

}
