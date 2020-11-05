package com.mitocode.javaweb.java_intro.ejercicio12_bonus;

import java.util.Scanner;

public class ProgramaBonus {

	public static void main(String[] args) {
		agendaTelefonica();
	}

	public static void agendaTelefonica() {
		Scanner scanner = new Scanner(System.in);
		int opcion = -1; // Guardaremos la opcion del usuario
		boolean salir = false;

		Agenda agenda = new Agenda();

		do {
			System.out.println("###########################");
			System.out.println("1. Añadir contacto");
			System.out.println("2. Listar contactos");
			System.out.println("3. Buscar contacto");
			System.out.println("4. Existe contacto");
			System.out.println("5. Eliminar contacto");
			System.out.println("6. Ver capacidad disponible");
			System.out.println("7. Validar disponibilidad de agenda");
			System.out.println("8. Ampliar capacidad de agenda");
			System.out.println("9. Salir");

			System.out.println("Ingrese una opción: ");
			opcion = scanner.nextInt();

			Contacto contacto = null;
			String nombre = null;
			String telefono = null;
			int capacidad = -1;

			switch (opcion) {
			case 1: // añadir contacto
				if(agenda.hasDisponible()) {
					System.out.println("Ingrese un nombre");
					nombre = scanner.next();

					if(agenda.buscarContacto(nombre) != null) {
						System.out.println("Nombre ingresado ya existe");
					} else {
						System.out.println("Ingrese un telefono");
						telefono = scanner.next();

						contacto = new Contacto(nombre, telefono);
						if(agenda.aniadirContacto(contacto)) {
							System.out.println("Contacto añadido: " + contacto);
						}
					}
				} else {
					System.out.println("Agenda completa, debe ampliar antes de añadir");
				}
				break;
			case 2: // listar contacto
				if(agenda.isEmpty()) {
					System.out.println("Agenda vacía");
				} else {
					agenda.listarContactos();
				}
				break;
			case 3: // buscar contacto
				if(agenda.isEmpty()) {
					System.out.println("Debe añadir contactos antes de buscar uno");
				} else {
					System.out.println("Ingrese nombre a buscar");
					nombre = scanner.next();

					contacto = agenda.buscarContacto(nombre);
					if (contacto != null) {
						System.out.println("Contacto encontrado: " + contacto);
					} else {
						System.out.println("Contacto no encontrado");
					}
				}
				break;
			case 4: // existe contacto
				if(agenda.isEmpty()) {
					System.out.println("Debe añadir contactos antes de validar si existe uno");
				} else {
					System.out.println("Ingrese nombre a validar");
					nombre = scanner.next();
	
					if (agenda.hasContacto(nombre)) {
						System.out.println("Contacto existe");
					} else {
						System.out.println("Contacto con nombre ingresado no exite");
					}
				}
				break;
			case 5: // eliminar contacto
				if(agenda.isEmpty()) {
					System.out.println("Debe añadir contactos antes de eliminar");
				} else {
					System.out.println("Ingrese nombre a eliminar");
					nombre = scanner.next();
	
					if (agenda.eliminarContacto(nombre)) {
						System.out.println("Contacto eliminado");
					} else {
						System.out.println("No se pudo encontrar el contacto a eliminar");
					}
				}
				break;
			case 6: // Ver capacidad disponible
				System.out.println("Capacidad disponible: " + agenda.getCapacidadDisponible());
				break;
			case 7: // Validar disponibilidad de agend
				if (agenda.hasDisponible()) {
					System.out.println("La agenda tiene disponibilidad para agregar mas contactos");
				} else {
					System.out.println("Ageda completa, amplie capacidad");
				}
				break;
			case 8: // Ampliar capacidad de agenda
				System.out.println("Ingrese capacidad a ampliar");
				capacidad = scanner.nextInt();

				System.out.println("Capcidad actual: " + agenda.getContactos().length);
				agenda.ampliarAgenda(capacidad);
				System.out.println("Nueva capacidad: " + agenda.getContactos().length);

				break;
			case 9: // salir
				System.out.println("Gracias, que tengas un buen día n_n");
				break;
			default:
				System.out.println("Ingrese una opción válida");
			}
		} while (!salir);
		
		scanner.close();
	}
}
