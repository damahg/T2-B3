package RelacionArrays;
import java.util.Scanner;

public class Ej07 {
	private static final int NUMERO_MAXIMO_INCLUIDO = 200;
	private static final int LONGITUD_VECTOR = 12;
	private static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] lista = new int[LONGITUD_VECTOR];
		crearArray(lista);
		mostrarArray(lista);
		System.out.print("Numero: ");
		int num = Integer.parseInt(kb.nextLine());
		System.out.println();
		System.out.print("Posicion: ");
		int pos = Integer.parseInt(kb.nextLine());
		meterNumero(lista, num, pos);
		mostrarArray(lista);

	}
	
	public static void crearArray(int[] lista) {
		for (int i = 0; i < lista.length; i++) {
			lista[i] = (int)(Math.random()*(NUMERO_MAXIMO_INCLUIDO +1));
		}
		
		//return lista;
	}
	
	public static void meterNumero (int[] lista, int num, int pos) {
		for (int i = lista.length-1; i > pos; i--) {
			int anterior = lista[i-1];
			lista[i] = anterior;
		}
		
		lista[pos] = num;
		
		//return lista;
	}
	
	public static void mostrarArray(int[] lista) {
		for (int i = 0; i < lista.length; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		
		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i] + "\t");
		}
		System.out.println();
	}

}
