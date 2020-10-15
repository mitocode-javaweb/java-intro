package com.mitocode.javaweb.java_intro.ejercicio06_enums;

public enum EstadoCuenta {

	INACTIVO("Inactivo", 0), ACTIVO("Cuenta Activa", 1), BLOQUEADO("Cuenta Bloqueada", 2);
	
	private String descripcion;
	private int codigo;

	private EstadoCuenta(String descripcion, int codigo) {
		this.descripcion = descripcion;
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
}
