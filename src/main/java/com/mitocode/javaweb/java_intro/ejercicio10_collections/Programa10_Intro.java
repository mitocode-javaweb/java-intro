package com.mitocode.javaweb.java_intro.ejercicio10_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Programa10_Intro {
	
	public static void main(String[] args) {
		ArrayList nombres = new ArrayList();
		nombres.add("Emilio");
		nombres.add("Yenuri");
		nombres.add("Cristian");
		nombres.add(123456);
		nombres.add(new Estudiante("Pablo"));
		
		for (Object nombre : nombres) {
			System.out.println(nombre);
		}
		
		System.out.println("********");
		
		List<String> nombres2 = new ArrayList<>();
		nombres2.add("Emilio"); // 0
		nombres2.add("Yenuri"); // 1
		nombres2.add("Cristian"); // 2
		nombres2.add(Integer.toString(123456)); // 3
		
		Iterator<String> iterator = nombres2.iterator(); 
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("********");
		
		for (int i = 0; i < nombres2.size(); i++) {
			System.out.println("Nombre: " + nombres2.get(i));
		}
		
		System.out.println("********");
		System.out.println("Indice 4: " + nombres2.get(4));
	}

}

class Estudiante {
	String nombre;

	public Estudiante(String nombre) {
		this.nombre = nombre;
	}
}
