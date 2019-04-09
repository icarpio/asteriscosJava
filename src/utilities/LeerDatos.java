package utilities;

import java.util.Scanner;

public class LeerDatos {
	@SuppressWarnings("resource")
	public static int leerInt() {
		return new Scanner(System.in).nextInt();
	}
	
	
	public static int leerInt(String msg) {
		System.out.println(msg);
		return leerInt();
	}
}
