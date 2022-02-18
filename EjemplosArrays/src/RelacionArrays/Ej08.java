package RelacionArrays;
import java.util.Scanner;


public class Ej08 {
	private static final int MESES = 12;
	private static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		String[] lista = new String[MESES];
		crearArray(lista);
		mostrarArray(lista);
		
		

	}
	
	public static void crearArray(String[] lista) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println("Temperatura del mes "+(i+1));
			int temp = Integer.parseInt(kb.nextLine());
			StringBuilder grafico = new StringBuilder();
			
			for (int j = 1; j <= temp; j++) {
				grafico.append('-');
			}
			
			
			lista[i] = grafico.toString();
		}
	}
	
	public static void mostrarArray (String[] lista) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println("Mes " + i + ": " + lista[i]);
		}
	}
	
	

}
