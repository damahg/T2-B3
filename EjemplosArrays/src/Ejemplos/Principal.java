package Ejemplos;
import java.util.Scanner;
public class Principal {

	private static final int TOTAL_ALUMNOS = 5;
	public static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		Alumno[] clase = new Alumno[TOTAL_ALUMNOS];
		

	}
	
	public void cargarDatos(Alumno[] clase) {
		String dni;
		String nombre;
		String direccion;
		int nota;
		
		for (int i = 0; i < clase.length; i++) {
			System.out.println("DNI");
			dni = kb.nextLine();
			System.out.println("Nombre");
			nombre = kb.nextLine();
			System.out.println("Direccion");
			direccion = kb.nextLine();
			System.out.println("Nota");
			nota = Integer.parseInt(kb.nextLine());
			
			clase[i] = new Alumno(dni,nombre,direccion,nota);
		}
	}

}
