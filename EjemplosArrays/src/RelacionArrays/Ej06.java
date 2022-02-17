package RelacionArrays;

public class Ej06 {

	public static void main(String[] args) {
		int[] lista = new int[20];
		lista = crearArray(lista);
		mostrarArray(lista);
		lista = ordenarArray(lista);
		mostrarArray(lista);
		

	}
	
	public static int[] crearArray(int[] lista) {
		for (int i = 0; i < lista.length; i++) {
			lista[i] = (int)(Math.random()*100);
		}
		
		return lista;
	}
	
	public static int[] ordenarArray(int[] lista) {
		int[] listaAux = new int[20];
		int contador = 0;
		
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] % 2 == 0) {
				listaAux[contador] = lista[i];
				contador++;
			}
		}
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] % 2 != 0) {
				listaAux[contador] = lista[i];
				contador++;
			}
		}
		
		return listaAux;
	}
	
	public static void mostrarArray(int[] lista) {
		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i] + ", ");
		}
		System.out.println();
	}

}
