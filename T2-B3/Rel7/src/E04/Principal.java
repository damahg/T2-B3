package E04;
import java.util.Scanner;
public class Principal {
	private static Scanner kb = new Scanner (System.in);
	public static void main(String[] args) {
		Jarra jarraA = null;
		Jarra jarraB = null;
		boolean esCorrecto = true;
		do {
			
			System.out.print("Capacidad para la jarra 1: ");
			int capacidad = Integer.parseInt(kb.nextLine());
			try {
				jarraA = new Jarra(capacidad, 0);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				esCorrecto = false;
			}
			
		} while (esCorrecto == false);
		
		do {
			
			System.out.print("Capacidad para la jarra 2: ");
			int capacidad = Integer.parseInt(kb.nextLine());
			try {
				jarraB = new Jarra(capacidad, 0);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				esCorrecto = false;
			}
			
		} while (esCorrecto == false);
		
		
		boolean salir = false;
		
		while (salir == false) {
			mostrarMenu();
			
			System.out.print("Introduce una opción: ");
			int eleccion = Integer.parseInt(kb.nextLine());
			
			salir = tratarMenu(jarraA, jarraB, eleccion);
		}
		
		

	}
	
	public static void mostrarMenu() {
		System.out.println("----MENU----");
		System.out.println("1.- Llenar jarra");
		System.out.println("2.- Vaciar jarra");
		System.out.println("3.- Volcar A en B");
		System.out.println("4.- Volcar B en A");
		System.out.println("5.- Ver estado de jarras");
		System.out.println("6.- Salir");
	}//mostrarMenu
	
	public static boolean tratarMenu(Jarra jarraA, Jarra jarraB, int eleccion){	
		boolean salir = false;
		char letra;
		
		try {

			switch (eleccion) {
				case 1: {
					do {
						System.out.print("¿Qué jarra desea llenar? (A/B): ");
						letra = kb.nextLine().charAt(0);
						if (letra != 'A' && letra != 'B') {
							throw new JarraException("Caracter no válido");
						}
					} while (letra != 'A' && letra != 'B');
					
					if (letra == 'A') {
						jarraA.llenarJarra();
					}else {
						jarraB.llenarJarra();
					}
					
					break;
				}
				
				case 2: {
					do {
						System.out.print("¿Qué jarra desea vaciar? (A/B): ");
						letra = kb.nextLine().charAt(0);
						if (letra != 'A' || letra != 'B') {
							throw new JarraException("Caracter no válido");
						}
					} while (letra != 'A' || letra != 'B');
					
					if (letra == 'A') {
						jarraA.vaciarJarra();
					}else {
						jarraB.vaciarJarra();
					}
					
					break;
				}
				
				case 3: {
					jarraB.volcarJarra(jarraA);
					System.out.println("Jarra volcada");
					System.out.println();
					
					break;
				}
				
				case 4: {
					jarraA.volcarJarra(jarraB);
					System.out.println("Jarra volcada");
					System.out.println();
					
					break;
				}
				
				case 5: {
					System.out.println(jarraA.toString());
					System.out.println(jarraB.toString());
					System.out.println();
					
					break;
				}
				
				case 6: {
					System.out.println("Se ha(n) gastado " + Jarra.getTotalAgua() + " litros");
					salir = true;
					break;
				}
				
			default:
				
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return salir;
	}//tratarMenu

}
