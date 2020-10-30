package com.mitocode.javaweb.java_intro.ejercicio12_bonus;

public class Contacto {

	private String nombre;
	private String telefono;

	public Contacto(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		} else {
			Contacto contacto = (Contacto) obj;
			return this.getNombre().equalsIgnoreCase(contacto.getNombre());
		}
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", telefono=" + telefono + "]";
	}

}
