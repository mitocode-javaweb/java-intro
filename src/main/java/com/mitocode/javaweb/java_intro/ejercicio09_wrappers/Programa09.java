package com.mitocode.javaweb.java_intro.ejercicio09_wrappers;

public class Programa09 {

	public static void main(String[] args) {
		int entero = 10;
		Integer entero2 = entero; // autoboxing -> Integer entero2 = new Integer(entero)
		
		int entero3 = entero2; // unboxing -> int entero3 = (int) entero2;
		
		double decimal = entero;
		Double decimal2 = (double) entero2;
		
	}
}
