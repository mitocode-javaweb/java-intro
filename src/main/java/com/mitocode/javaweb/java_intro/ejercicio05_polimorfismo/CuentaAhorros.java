package com.mitocode.javaweb.java_intro.ejercicio05_polimorfismo;

public class CuentaAhorros extends Cuenta {

	private double tasaInteres;

	public CuentaAhorros(String numeroCuenta, String nombreTitular, double depositoInicial, double tasaInteres) {
		super(numeroCuenta, nombreTitular, depositoInicial);
		this.tasaInteres = tasaInteres;
	}

	public CuentaAhorros(String numeroCuenta, String nombreTitular, double tasaInteres) {
		super(numeroCuenta, nombreTitular);
		this.tasaInteres = tasaInteres;
	}

	public CuentaAhorros(String numeroCuenta, String nombreTitular) {
		super(numeroCuenta, nombreTitular);
		this.tasaInteres = 0;
	}

	public double getTasaInteres() {
		return tasaInteres;
	}

	public void setTasaInteres(double tasaInteres) {
		this.tasaInteres = tasaInteres;
	}

	@Override
	public void retiro(double monto) {
		if (monto <= saldo) {
			super.saldo -= monto;
		} else {
			System.out.println("Saldo insuficiente");
		}
	}

	@Override
	public String toString() {
		return "CuentaAhorros [tasaInteres=" + tasaInteres + ", numeroCuenta=" + numeroCuenta + ", nombreTitular="
				+ nombreTitular + ", saldo=" + saldo + "]";
	}

}
