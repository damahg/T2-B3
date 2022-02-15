package Ejemplos;
import java.util.Scanner;
public class Principal {

	private static final int TOTAL_ALUMNOS = 1;
	public static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		Alumno[] clase = new Alumno[TOTAL_ALUMNOS];
		
		
		cargarDatos(clase);
		mostrarDatos(clase);
		
		System.out.println("Introduce nombre:");
		String buscar = kb.nextLine();
		
		buscarAlumno(clase, buscar);
	}
	
	/**
	 * Crea e introduce los alumnos en el array
	 * @param clase
	 */
	public static void cargarDatos(Alumno[] clase){
		String dni;
		String nombre;
		String direccion;
		int nota;
		int i = 0;
		
		while (i < clase.length) {
			System.out.println("DNI");
			dni = kb.nextLine();
			System.out.println("Nombre");
			nombre = kb.nextLine();
			System.out.println("Direccion");
			direccion = kb.nextLine();
			System.out.println("Nota");
			nota = Integer.parseInt(kb.nextLine());
			
			try {
				clase[i] = new Alumno(dni,nombre,direccion,nota);
				i++;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			
		}//while
	}//cargarDatos
	
	public static void mostrarDatos(Alumno[] clase) {
		for (int i = 0; i < clase.length; i++) {
			System.out.println(clase[i].toString());
		}
	}
	
	public static void buscarAlumno(Alumno[] clase, String nombre) {
		int i = 0;
		boolean encontrado = false;
		while (i < clase.length && encontrado == false) {
			if (clase[i].getNombre().equals(nombre)) {
				System.out.println(clase[i]);
				encontrado = true;
			}
			
			i++;
		}//while
		
		if (encontrado == false) {
			System.out.println("No encontrado");
		}
	}

}
