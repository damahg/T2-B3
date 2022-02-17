package RelacionArrays;
import java.util.Scanner;
/*
 * Realiza un programa que sea capaz de insertar un número en una posición concreta de un array. En
primer lugar, el programa generará un array de 12 números enteros aleatorios entre 0 y 200 ambos
incluidos. A continuación se debe mostrar el contenido de ese array junto al índice (0 – 11).
Seguidamente el programa preguntará por el número que se quiere insertar y por la posición donde
será insertado. Los números del array se desplazan a la derecha para dejar sitio al nuevo. El último
número (el que se encuentra en la posición 11) siempre se perderá.
 */
public class Ej07 {
	private static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		int[] lista = new int[12];
		lista = crearArray(lista);
		mostrarArray(lista);
		System.out.print("Numero: ");
		int num = Integer.parseInt(kb.nextLine());
		System.out.println();
		System.out.print("Posicion: ");
		int pos = Integer.parseInt(kb.nextLine());
		lista = meterNumero(lista, num, pos);
		mostrarArray(lista);

	}
	
	public static int[] crearArray(int[] lista) {
		for (int i = 0; i < lista.length; i++) {
			lista[i] = (int)(Math.random()*201);
		}
		
		return lista;
	}
	
	public static int[] meterNumero (int[] lista, int num, int pos) {
		for (int i = lista.length-1; i > pos; i--) {
			int anterior = lista[i-1];
			lista[i] = anterior;
		}
		
		lista[pos] = num;
		
		return lista;
	}
	
	public static void mostrarArray(int[] lista) {
		for (int i = 0; i < lista.length; i++) {
			System.out.print(i + "\t");
		}
		
		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i] + ", ");
		}
		System.out.println();
	}

}
