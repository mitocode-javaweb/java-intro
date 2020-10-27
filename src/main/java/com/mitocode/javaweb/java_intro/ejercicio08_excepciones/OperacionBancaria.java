package com.mitocode.javaweb.java_intro.ejercicio08_excepciones;

public interface OperacionBancaria {

	void retiro(double monto) throws FondosInsuficientesException, CuentaBloqueadaException;

	void deposito(double monto);

}
