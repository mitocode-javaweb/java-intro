package com.mitocode.javaweb.java_intro.ejercicio08_excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa08_1 {
	
	public static void main(String[] args) {
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(new File("src/main/resources/alumnos123.txt"));
			
			while (scanner.hasNext()) {
				System.out.println("Nombre: " + scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error: " + e.getMessage());
		} finally {
			if(scanner != null) {
				scanner.close();
			}
		}
		System.out.println("=======================");
		
		try(Scanner scanner2 = new Scanner(new File("src/main/resources/alumnos.txt"))) {
			while (scanner2.hasNext()) {
				System.out.println("Nombre: " + scanner2.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
		}
	}

}
