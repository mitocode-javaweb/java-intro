package com.mitocode.javaweb.java_intro.ejercicio11_genericos;

public class Programa11_Intro {

	public static void main(String[] args) {
		Elemento<String, Double> elemento = new Elemento<>("Fernando", 123456.0);
		
		elemento.mostrarTipos();
		System.out.println("Valor: " + elemento.getVariable());
		System.out.println("OtroCampo: " + elemento.getOtroCampo());
	}
}
