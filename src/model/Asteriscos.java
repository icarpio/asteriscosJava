package model;

public class Asteriscos {

	public static void angulo90(int num) {
		for (int a = 1; a <= num; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	public static void angulomenos90(int numero) {
		for (int i = 1; i <= numero; i++) {
			for (int j = 1; j <= numero - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	public static void cuadrado(int numero) {
		String cadena = "";
		for (int i = 0;i <numero;i++) {
			
			for(int j= 0; j < numero;j++) {
				cadena+="*";
					
		}cadena+="\n";
	}System.out.print(cadena);
	 

	}
	public static void piramide(int numero) {
		for(int altura= 1;altura<=numero;altura++) {
			for(int espacios = 1;espacios <=numero-altura;espacios++) {
				System.out.print(" ");
			}
			for(int ast = 1;ast<=(altura*2)-1;ast++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	}
