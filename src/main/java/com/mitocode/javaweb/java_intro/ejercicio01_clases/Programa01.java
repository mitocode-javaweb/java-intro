package com.mitocode.javaweb.java_intro.ejercicio01_clases;

import java.util.Scanner;

public class Programa01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Cuenta cuenta = null;
		int opcion = -1;
		double monto = 0;
		boolean isDeposito = false;
		boolean salir = false;

		do {
			System.out.println("#############################");
			System.out.println("Elige una opción del menú:");
			System.out.println("1. Crear Cuenta");
			System.out.println("2. Hacer un depósito");
			System.out.println("3. Hacer un retiro");
			System.out.println("4. Consultar saldo");
			System.out.println("5. Cambiar comisión");
			System.out.println("6. Salir");

			opcion = scanner.nextInt();

			// Crear Cuenta
			switch (opcion) {
			case 1:
				System.out.println("Ingresa el número de cuenta");
				String numeroCuenta = scanner.next();

				System.out.println("Ingresa el nombre del titular");
				String nombreTitular = scanner.next();

				System.out.println("¿Desea hacer depósito inicial?");
				isDeposito = scanner.nextBoolean();

				if (isDeposito) {
					System.out.println("Ingresa el monto inicial");
					monto = scanner.nextDouble();

					cuenta = new Cuenta(numeroCuenta, nombreTitular, monto);
				} else {
					cuenta = new Cuenta(numeroCuenta, nombreTitular);
				}
				break;
			case 2: // deposito
				System.out.println("Ingresa el monto a depositar");
				monto = scanner.nextDouble();
				cuenta.deposito(monto);
				break;
			case 3: // retiro
				System.out.println("Ingresa el monto a retirar");
				monto = scanner.nextDouble();
				cuenta.retiro(monto);
				break;
			case 4: // consultar saldo
				System.out.println("Saldo: " + cuenta.getSaldo());
				break;
			case 5: // modificar comision
				System.out.println("Ingresa la nueva comisión");
				monto = scanner.nextDouble();
				Cuenta.COMISION_RETIRO = monto;
			default: // salir
				salir = true;
				System.out.println("Gracias por su visita!");
			}

			System.out.println("Datos de la cuenta:" + cuenta.toString());
		} while (!salir);

		System.out.println("Fin del programa");
	}
}
