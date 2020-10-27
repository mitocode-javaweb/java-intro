package com.mitocode.javaweb.java_intro.ejercicio10_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Programa10_ArrayList_vs_LinkedList {

	public static void main(String[] args) {
		int cantidad = 9_999;
		List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();

		// Agregar
		long inicio = System.currentTimeMillis();
		for (int i = 0; i < cantidad; i++) {
			arrayList.add("Elemento #" + i);
		}
		long fin = System.currentTimeMillis();
		System.out.println("Agregar ArrayList: " + (fin - inicio) + " ms");

		inicio = System.currentTimeMillis();
		for (int i = 0; i < cantidad; i++) {
			linkedList.add("Elemento #" + i);
		}
		fin = System.currentTimeMillis();
		System.out.println("Agregar LinkedList: " + (fin - inicio) + " ms");

		// Obtener
		inicio = System.currentTimeMillis();
		for (int i = 0; i < cantidad; i++) {
			arrayList.get(i);
		}
		fin = System.currentTimeMillis();
		System.out.println("Obtener ArrayList: " + (fin - inicio) + " ms");

		inicio = System.currentTimeMillis();
		for (int i = 0; i < cantidad; i++) {
			linkedList.get(i);
		}
		fin = System.currentTimeMillis();
		System.out.println("Obtener LinkedList: " + (fin - inicio) + " ms");

		// Modificar
		inicio = System.currentTimeMillis();
		for (int i = 0; i < cantidad; i++) {
			arrayList.set(i, "Modificado: " + i);
		}
		fin = System.currentTimeMillis();
		System.out.println("Modificar ArrayList: " + (fin - inicio) + " ms");

		inicio = System.currentTimeMillis();
		for (int i = 0; i < cantidad; i++) {
			linkedList.set(i, "Modificado: " + i);
		}
		fin = System.currentTimeMillis();
		System.out.println("Modificar LinkedList: " + (fin - inicio) + " ms");

		// Eliminar
		inicio = System.currentTimeMillis();
		for (int i = 0; i < cantidad; i++) {
			arrayList.remove(0);
		}
		fin = System.currentTimeMillis();
		System.out.println("Eliminar ArrayList: " + (fin - inicio) + " ms");

		inicio = System.currentTimeMillis();
		for (int i = 0; i < cantidad; i++) {
			linkedList.remove(0);
		}
		fin = System.currentTimeMillis();
		System.out.println("Eliminar LinkedList: " + (fin - inicio) + " ms");
	}
}
