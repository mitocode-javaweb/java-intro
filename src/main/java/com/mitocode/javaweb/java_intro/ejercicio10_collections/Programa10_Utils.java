package com.mitocode.javaweb.java_intro.ejercicio10_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Programa10_Utils {

	public static void main(String[] args) {
		ordenandoListaString();

		ordenandoListaDeObjetos();
	}

	private static void ordenandoListaString() {
		String[] alumnos = { "Emilio", "Veiko", "Pablo", "Augusto" };
		System.out.println("Array: " + alumnos);

		List<String> listaAlumnos = Arrays.asList(alumnos);
		System.out.println("Lista:" + listaAlumnos);

		Collections.sort(listaAlumnos);
		System.out.println("Lista ordenada: " + listaAlumnos);

		Collections.reverse(listaAlumnos);
		System.out.println("Lista invertida: " + listaAlumnos);
	}

	private static void ordenandoListaDeObjetos() {
		List<Persona> personas = new ArrayList<>();
		personas.add(new Persona("Emilio", 30));
		personas.add(new Persona("Veiko", 25));
		personas.add(new Persona("Pablo", 29));
		personas.add(new Persona("Augusto", 23));
		personas.add(new Persona("Yenuri", 27));
		
		Collections.swap(personas, 1, 4);

		imprimirLista(personas);
		Collections.sort(personas, new NombresPersonaComparator());
		imprimirLista(personas);
		
		Collections.sort(personas, new Comparator<Persona>() {
			@Override
			public int compare(Persona o1, Persona o2) {
				return Integer.valueOf(o1.edad).compareTo(o2.edad) * -1;
			}
		});
		imprimirLista(personas);
	}

	private static void imprimirLista(List<Persona> personas) {
		System.out.println("*****************");
		for (Persona persona : personas) {
			System.out.println(persona);
		}
	}
}

class Persona {
	String nombres;
	int edad;

	public Persona(String nombres, int edad) {
		this.nombres = nombres;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombres=" + nombres + ", edad=" + edad + "]";
	}

}

class NombresPersonaComparator implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		return o1.nombres.compareTo(o2.nombres);
	}
	
}
