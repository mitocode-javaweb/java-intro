package com.mitocode.javaweb.java_intro.ejercicio11_genericos;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Programa12_Metodos {

	public static void main(String[] args) {
		List<Estudiante> estudiantes = Arrays.asList(
				new Estudiante("Fernando"),
				new Estudiante("Veiko"),
				new Estudiante("Pablo"),
				new Estudiante("Emilio")
				);
		imprimirLista3(estudiantes);
		
		List<Docente> docentes = Arrays.asList(new Docente("Jaime"), new Docente("Diego"));
		imprimirLista2(docentes);
				
	}

	/**
	 * La firma del metodo hace referencia a las clases y sus herencias, mas no el generico de la clase
	 * 
	 */
	private static <T> void imprimirLista(List<T> lista) {
		for (T elemento : lista) {
			System.out.println(elemento);
		}
	}
	
	private static void imprimirLista2(List<? extends Persona> lista) {
		for (Persona elemento : lista) {
			System.out.println(elemento);
			elemento.pintarNombre();
		}
	}
	
	private static void imprimirLista3(List<? super Estudiante> lista) {
		for (Object elemento : lista) {
			System.out.println(elemento);
		}
	}
	
}

class Persona {
	String nombre;

	Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public void pintarNombre() {
		System.out.println("El nombre es: " + nombre);
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}
}

class Estudiante extends Persona {
	int nota;

	Estudiante(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return "Estudiante [nota=" + nota + ", nombre=" + nombre + "]";
	}

}

class Docente extends Persona {
	String curso;

	Docente(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return "Docente [curso=" + curso + ", nombre=" + nombre + "]";
	}
}