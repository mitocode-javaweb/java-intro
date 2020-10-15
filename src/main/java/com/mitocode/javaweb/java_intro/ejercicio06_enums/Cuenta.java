package com.mitocode.javaweb.java_intro.ejercicio06_enums;

public class Cuenta {

	private static double COMISION_RETIRO = 5;

	private String numeroCuenta;
	private String nombreTitular;
	protected double saldo;

	// 0 = INACTIVO / 1 = ACTIVO / 2 = BLOQUEADO
	private EstadoCuenta estadoCuenta;

	public Cuenta(String numeroCuenta, String nombreTitular) {
		this.numeroCuenta = numeroCuenta;
		this.nombreTitular = nombreTitular;
		this.saldo = 0;
		this.estadoCuenta = EstadoCuenta.INACTIVO;
	}
	
	public Cuenta(String numeroCuenta, String nombreTitular,  EstadoCuenta estadoCuenta) {
		this.numeroCuenta = numeroCuenta;
		this.nombreTitular = nombreTitular;
		this.saldo = 0;
		this.estadoCuenta = estadoCuenta;
	}

	public Cuenta(String numeroCuenta, String nombreTitular, double depositoInicial) {
		this.numeroCuenta = numeroCuenta;
		this.nombreTitular = nombreTitular;
		deposito(depositoInicial);
		this.estadoCuenta = EstadoCuenta.INACTIVO;
	}
	
	public Cuenta(String numeroCuenta, String nombreTitular, double depositoInicial, EstadoCuenta estadoCuenta) {
		this.numeroCuenta = numeroCuenta;
		this.nombreTitular = nombreTitular;
		deposito(depositoInicial);
		
		this.estadoCuenta = estadoCuenta;
	}

	public void deposito(double monto) {
		this.saldo += monto;
	}

	public void retiro(double monto) {
		if (this.saldo >= monto + COMISION_RETIRO) {
			this.saldo -= (monto + COMISION_RETIRO);
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public EstadoCuenta getEstadoCuenta() {
		return estadoCuenta;
	}

	public void setEstadoCuenta(EstadoCuenta estadoCuenta) {
		this.estadoCuenta = estadoCuenta;
	}

	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", nombreTitular=" + nombreTitular + ", saldo=" + saldo
				+ ", estadoCuenta=" + estadoCuenta + "]";
	}

}
