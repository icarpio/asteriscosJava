package utilities;

import java.util.Scanner;

import model.Asteriscos;

public class ImprimirMenu {

	public static void imprimirMenu() {
		Scanner sn = new Scanner(System.in);
		boolean exit = false;
		int opcion;

		while (!exit) {
			System.out.println("\n****Dibujos con Java**** ");
			System.out.println("1. Imprimir Angulo de 90 ");
			System.out.println("2. Imprimir Angulo -90");
			System.out.println("3. Imprimir Cuadrado");
			System.out.println("5. Salir");
			System.out.println("Selecciona una opcion");
			opcion = sn.nextInt();
			int numero = LeerDatos.leerInt("Introduce un numero del 1 al 10");
			
			switch (opcion) {
			case 1:
				Asteriscos.angulo90(numero);
				break;
			case 2:
				Asteriscos.angulomenos90(numero);
				break;
			case 3:
				Asteriscos.cuadrado(numero);
				break;
			case 4:
				Asteriscos.piramide(numero);
				break;
			case 5:
				System.out.println("----------------------------------------");
				System.out.println("Gracias por utilizar este servicio");
				System.out.println("----------------------------------------");
				exit = true;
				break;
			default:
				System.out.println("Opcion incorrecta");
			}
			
		}
	}
}
