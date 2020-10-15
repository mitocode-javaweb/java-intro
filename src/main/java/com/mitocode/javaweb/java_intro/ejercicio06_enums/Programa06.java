package com.mitocode.javaweb.java_intro.ejercicio06_enums;

public class Programa06 {
	
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta("11111-2222-123", "Diego", EstadoCuenta.BLOQUEADO);
		
		System.out.println("Datos: " +  cuenta);
		
//		if(cuenta.getEstadoCuenta() == EstadoCuenta.INACTIVO) {
//			System.out.println("Cuenta inactiva");
//		} else if(cuenta.getEstadoCuenta() == EstadoCuenta.ACTIVO) {
//			System.out.println("Cuenta Activa");
//		} else if(cuenta.getEstadoCuenta() == EstadoCuenta.BLOQUEADO) {
//			System.out.println("Cuenta bloqueada");
//		}
		
		System.out.println(cuenta.getEstadoCuenta().getCodigo() + "-" + cuenta.getEstadoCuenta().getDescripcion());
	}
}
