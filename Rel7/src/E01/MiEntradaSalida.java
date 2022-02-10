package E01;

import java.util.Scanner;

public class MiEntradaSalida {
	public static Scanner kb = new Scanner(System.in);
	public static int solicitarEntero (String mensaje) {
		int entero;
		
		System.out.println(mensaje);
		
		entero = Integer.parseInt(kb.nextLine());
		
		return entero;
	}
	
	public static int solicitarEnteroPositivo (String mensaje) {
		int entero;
		
		do {
			System.out.println(mensaje);
			entero = Integer.parseInt(kb.nextLine());
		} while (entero < 0);
		
		return entero;
	}
	
	public static int solicitarEnteroEnRango (String mensaje, int minimo, int maximo) {
		int entero;
		
		do {
			System.out.println(mensaje);
			entero = Integer.parseInt(kb.nextLine());
		} while (entero < minimo || entero > maximo);
		
		return entero;
	}
}
