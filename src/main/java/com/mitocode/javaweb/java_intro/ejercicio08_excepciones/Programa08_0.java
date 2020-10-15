package com.mitocode.javaweb.java_intro.ejercicio08_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa08_0 {

	public static void main(String[] args) {
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);
			
			System.out.println("Ingrese numerador");
			int numerador = sc.nextInt();
			
			System.out.println("Ingrese denominador");
			int denominador = sc.nextInt();
			
			int resultado = dividir(numerador, denominador);
			System.out.println("Resultado: " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("error: " + e.getMessage());
		} catch (DivisionEntreCero e) {
			System.out.println("error: " + e.getMessage());
		} catch(InputMismatchException e) {
			System.out.println("Ingresa un número válido");
		} finally {
			sc.close();
		}
		
	}
	
	public static int dividir(int numerador, int denominador) throws DivisionEntreCero  {
		if(denominador == 0) {
			throw new DivisionEntreCero("No se puede dividir entre cero");
		}
		
		return numerador / denominador;
	}
}

class DivisionEntreCero extends Exception {

	public DivisionEntreCero(String message) {
		super(message);
	}
}
