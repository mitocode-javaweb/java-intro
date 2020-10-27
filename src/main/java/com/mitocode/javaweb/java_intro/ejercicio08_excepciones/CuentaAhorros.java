package com.mitocode.javaweb.java_intro.ejercicio08_excepciones;

public class CuentaAhorros extends Cuenta implements OperacionBancaria {

	private double tasaInteres;

	public CuentaAhorros(String numeroCuenta, String nombreTitular, double depositoInicial, double tasaInteres) {
		super(numeroCuenta, nombreTitular);
		deposito(depositoInicial);
		
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
	public String toString() {
		return "CuentaAhorros [tasaInteres=" + tasaInteres + ", numeroCuenta=" + numeroCuenta + ", nombreTitular="
				+ nombreTitular + ", saldo=" + saldo + "]";
	}

	@Override
	public void deposito(double monto) {
		this.saldo += monto;
	}

	@Override
	public void retiro(double monto) throws FondosInsuficientesException, CuentaBloqueadaException {
		if(estado == EstadoCuenta.BLOQUEADO) {
			throw new CuentaBloqueadaException("La cuenta está bloqueada");
		} else if (monto <= saldo) {
			super.saldo -= monto;
		} else {
			throw new FondosInsuficientesException("No tiene saldo suficiente");
		}
	}
}
