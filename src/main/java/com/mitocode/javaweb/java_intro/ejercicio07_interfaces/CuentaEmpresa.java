package com.mitocode.javaweb.java_intro.ejercicio07_interfaces;

public class CuentaEmpresa extends Cuenta implements OperacionBancaria {

	double limitePrestamo;

	private static double COMISIION_PRESTAMO = 10.0;

	public CuentaEmpresa(String numeroCuenta, String nombreTitular) {
		super(numeroCuenta, nombreTitular);
		this.limitePrestamo = 0;
	}

	public CuentaEmpresa(String numeroCuenta, String nombreTitular, double limitePrestamo) {
		super(numeroCuenta, nombreTitular);
		this.limitePrestamo = limitePrestamo;
	}

	public CuentaEmpresa(String numeroCuenta, String nombreTitular, double depositoInicial, double limitePrestamo) {
		super(numeroCuenta, nombreTitular);
		deposito(depositoInicial);
		this.limitePrestamo = limitePrestamo;
	}

	public void prestamo(double monto) {
		if (monto > limitePrestamo) {
			System.out.println("Supera limite de prestamo");
		} else {
			deposito(monto - COMISIION_PRESTAMO);
		}
	}

	@Override
	public String toString() {
		return "CuentaEmpresa [limitePrestamo=" + limitePrestamo + ", numeroCuenta=" + numeroCuenta + ", nombreTitular="
				+ nombreTitular + ", getSaldo()=" + getSaldo() + "]";
	}

	@Override
	public void deposito(double monto) {
		this.saldo += monto;
	}

	@Override
	public void retiro(double monto) {
		if (this.saldo >= monto + COMISION_RETIRO) {
			this.saldo -= (monto + COMISION_RETIRO);
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}

}
