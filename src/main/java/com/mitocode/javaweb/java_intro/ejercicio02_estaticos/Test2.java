package com.mitocode.javaweb.java_intro.ejercicio02_estaticos;

public class Test2 {
	
	static String name = "Juan Pablo";
	
	static Test2 metodo() {
		System.out.println("Nombre es: ");
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(metodo().name);
	}

}
