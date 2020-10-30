package com.mitocode.javaweb.java_intro.ejercicio12_bonus;

import java.util.Arrays;

public class Agenda {

	private Contacto[] contactos;
	private static final int CAPACIDAD_INICIAL = 5;

	public Agenda() {
		this.contactos = new Contacto[CAPACIDAD_INICIAL]; // por defecto
	}

	public Agenda(int capacidad) {
		this.contactos = new Contacto[capacidad];
	}

	public Contacto[] getContactos() {
		return contactos;
	}

	public void setContactos(Contacto[] contactos) {
		this.contactos = contactos;
	}

	public boolean aniadirContacto(Contacto contacto) {
		boolean aniadido = false;

		if (hasDisponible() && !hasContacto(contacto.getNombre())) {
			for (int i = 0; i < contactos.length; i++) {
				if (contactos[i] == null) {
					contactos[i] = contacto;
					aniadido = true;
					break;
				}
			}
		}
		return aniadido;
	}

	public void listarContactos() {
		if (!isEmpty()) {
			for (int i = 0; i < contactos.length; i++) {
				System.out.println((i + 1) + ". " + contactos[i]);
			}
		}
	}

	public Contacto buscarContacto(String nombre) {
		Contacto contactoEncontrado = null;
		
		if (!isEmpty()) {
			Contacto contactoABuscar = new Contacto(nombre, "");
			
			for (int i = 0; i < contactos.length; i++) {
				if (contactos[i] != null && contactos[i].equals(contactoABuscar)) {
					contactoEncontrado = contactos[i];
					break;
				}
			}
		}
		return contactoEncontrado;
	}

	/**
	 * Valida si el contacto existe o no
	 * 
	 * @param nombre
	 * @return
	 */
	public boolean hasContacto(String nombre) {
		return buscarContacto(nombre) != null ? true : false;
	}
	
	public boolean eliminarContacto(String nombre) {
		boolean contactoEliminado = false;

		if (hasContacto(nombre)) {
			Contacto contactoAEliminar = new Contacto(nombre, "");
			
			for (int i = 0; i < contactos.length; i++) {
				if (contactos[i] != null && contactos[i].equals(contactoAEliminar)) {
					contactos[i] = null;
					contactoEliminado = true;
					break;
				}
			}
		}
		return contactoEliminado;
	}

	public int getCapacidadDisponible() {
		return contactos.length - getCapacidadUtilizada();
	}

	private int getCapacidadUtilizada() {
		int utilizados = 0;
		for (int i = 0; i < contactos.length; i++) {
			if (contactos[i] != null) {
				utilizados++;
			}
		}
		return utilizados;
	}

	/**
	 * Valida si hay disponbilidad para agregar un contacto
	 * @return
	 */
	public boolean hasDisponible() {
		boolean disponibilidad = false;

		for (int i = 0; i < contactos.length; i++) {
			if (contactos[i] == null) {
				disponibilidad = true;
				break;
			}
		}
		return disponibilidad;
	}

	public void ampliarAgenda(int capacidad) {
		if (capacidad <= contactos.length) {
			System.out.println("Capacidad ingresada debe ser mayor a la capacidad actual: " + contactos.length);
		} else {
			contactos = Arrays.copyOf(contactos, contactos.length + capacidad);
		}
	}

	public boolean isEmpty() {
		return getCapacidadDisponible() == contactos.length;
	}
}
