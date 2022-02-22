package Ej01;
import java.util.Scanner;
public class PrincipalRefran {
	private static Scanner kb = new Scanner (System.in);
	private static final int MAXIMO_REFRANES = 50;

	public static void main(String[] args) {
		Refran[] refranes = new Refran[MAXIMO_REFRANES];
		int numeroRealRefranes=0;
		int opc;
		do {
			opc = mostrarMenu();
			try {
				numeroRealRefranes = tratarMenu(refranes, numeroRealRefranes, opc);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		} while (opc != 4);
	}
	
	
	
	public static int mostrarMenu() {
		int opcion;
		System.out.println("========MENU========");
		System.out.println("1.- Añadir refrán");
		System.out.println("2.- Buscar refrán");
		System.out.println("3.- Listar refranes");
		System.out.println("4.- Salir");
		opcion = Integer.parseInt(kb.nextLine());
	
		return opcion;
	}//mostrarMenu
	
	private static int tratarMenu(Refran[] refranes, int numeroRealRefranes, int opcion) throws RefranException{
		switch (opcion) {
		case 1:
			System.out.println("Introduce un nombre");
			String nombre = kb.nextLine();
			System.out.println("Introduce una popularidad");
			int pop = Integer.parseInt(kb.nextLine());
			numeroRealRefranes++;
			refranes[numeroRealRefranes] = new Refran(nombre,pop); 
			break;

		case 2:
			System.out.println("Introduce una palabra");
			String palabra = kb.nextLine();
			boolean encontrado = false;
			for (int i = 0; i < refranes.length && encontrado == false; i++) {
				if (refranes[i].getNombre().indexOf(palabra) != -1) {
					System.out.println(refranes[i].toString());
					encontrado = true;
				}
			}
			
			if (!encontrado) {
				throw new RefranException("No se ha podido encontrar el refrán");
			}
			break;
			
		case 3:
			for (int i = 0; i < refranes.length; i++) {
				System.out.println(refranes[i].toString());
			}
			break;
			
		case 4:
			break;
		default:
			throw new RefranException("Opción inválida");
			
		}
		return numeroRealRefranes;
	}//tratarMenu

}
