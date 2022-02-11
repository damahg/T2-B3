package E03;
import java.util.Scanner;

public class Principal {
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		int eleccion;
		Maquina m1 = new Maquina();
		
		menu();
		System.out.println("Introduce tu eleccion");
		eleccion = kb.nextInt();
		
		try {
			switch (eleccion) {
			case 1: {
				m1.servirCafe(eleccion);
				break;
			}
			
			case 2: {
				m1.servirCafe(eleccion);
				break;
			}
			
			case 3: {
				m1.servirCafe(eleccion);
				break;
			}
			
			case 4:{
				m1.estadoMaquina();
				break;
			}
			
			case 5:{
				break;
			}
		}
		} catch (Exception e) {
			System.out.println("Opcion no válida");
		}
		
	}
	
	public static void menu() {
		System.out.println("----------MAQUINA DE CAFE----------");
		System.out.println("1.- Café solo");
		System.out.println("2.- Leche");
		System.out.println("3.- Café con leche");
		System.out.println("4.- Consultar estado de la m�quina");
		System.out.println("5.- Salir");
	}
}
