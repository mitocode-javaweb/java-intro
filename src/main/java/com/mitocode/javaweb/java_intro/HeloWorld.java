package com.mitocode.javaweb.java_intro;

public class HeloWorld {

	public static void main(String[] args) {
		System.out.println("Hello Coders!!!");
		
		System.out.println("Variable de clase: " + Bicicleta.variableEstatica);
		System.out.println("Metodo de clase: " + Bicicleta.mostrarMarca());
		
		System.out.println("*********");
		Bicicleta bike = new Bicicleta();
		bike.aumentarVelocidad(10);
		System.out.println("Velocidad bike es: " + bike.velocidad);
		bike.disminuirVelocidad(7);
		System.out.println("Velocidad bike es: " + bike.velocidad);
		
		System.out.println("*********");
		Bicicleta bike2 = bike;
		bike2.aumentarVelocidad(5);
		System.out.println("Velocidad bike: " + bike.velocidad);
		System.out.println("Velocidad bike2: " + bike2.velocidad);
		
		System.out.println("*********");
		// String es inmutable
		String color1 = "azul"; // new String("azul")
		String color2 = color1;
		color2 = "rojo";
		System.out.println("Color1: "  + color1);
		System.out.println("Color2: "  + color2);
		
		System.out.println("a" + "b" + "c" + "d" + "e");
		
		int numero = 346_518_273;
		System.out.println("Numero: " + numero);
		
	}
	
}
