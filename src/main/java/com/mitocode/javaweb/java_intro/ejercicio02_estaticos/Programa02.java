package com.mitocode.javaweb.java_intro.ejercicio02_estaticos;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

public class Programa02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(in);
		
		out.println("Ingrese el tipo de cambio:");
		double tipoCambio = scanner.nextDouble();
		
		out.println("Ingrese el monto a comprar");
		double monto = scanner.nextDouble();
		
		out.println("Monto a pagar: " + ConvertidorMonedaUitl.convertirADolares(tipoCambio, monto));
		
//		ConvertidorMonedaUitl util = new ConvertidorMonedaUitl();
		
		scanner.close();
	}
}
