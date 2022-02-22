package Ej02;

public class PrincipalCarta {
	public static void main(String[] args) {
		String[] baraja = new String[48];
		
		crearBaraja(baraja);
		mostrarBaraja(baraja);
	}
	
	public static void crearBaraja(String[] baraja) {
		int siguienteCarta = 0;
		for (int i = 0; i < Carta.PALOS.length; i++) {
			for (int j = 1; j <= Carta.CARTAS_POR_PALO; j++) {
				baraja[siguienteCarta] = (j + " " + Carta.PALOS[i]);
				siguienteCarta++;
			}
		}
	}
	
	public static void mostrarBaraja(String[] baraja) {
		for (int i = 0; i < baraja.length; i++) {
			System.out.println(baraja[i]);
		}
	}
}
