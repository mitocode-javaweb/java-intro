package com.mitocode.javaweb.java_intro.ejercicio04_modificadores.subpackage;

public class CuentaEmpresa extends Cuenta {
	
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
		super(numeroCuenta, nombreTitular, depositoInicial);
		this.limitePrestamo = limitePrestamo;
	}
	
	public void prestamo(double monto) {
		if(monto > limitePrestamo) {
			System.out.println("Supera limite de prestamo");
		} else {
//			super.deposito(monto - COMISIION_PRESTAMO);
			super.saldo += (monto - COMISIION_PRESTAMO);
		}
	}

	@Override
	public String toString() {
		return "CuentaEmpresa [limitePrestamo=" + limitePrestamo + ", numeroCuenta=" + numeroCuenta + ", nombreTitular="
				+ nombreTitular + ", getSaldo()=" + getSaldo() + "]";
	}
	
	

}
