package Ej02;
import java.util.Random;
import java.util.Scanner;
public class PrincipalCarta {
	private static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		Carta[] baraja = new Carta[48];
		
		try {
			crearBaraja(baraja);
			//mostrarBaraja(baraja);
			 System.out.println("¿Cuantas cartas se reparten?");
			 int cantidad = Integer.parseInt(kb.nextLine());
			 
			 Carta[] cartasJugador1 = new Carta[cantidad];
			 Carta[] cartasJugador2 = new Carta[cantidad];
			 
			 mezclar(baraja);
			 repartirCartas(baraja, cantidad, cartasJugador1, cartasJugador2);
			 
			 mostrarBaraja(cartasJugador1);
			 System.out.println();
			 mostrarBaraja(cartasJugador2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void crearBaraja(Carta[] baraja) throws CartaException{
		int siguienteCarta = 0;
		for (int i = 0; i < Carta.PALOS.length; i++) {
			for (int j = 1; j <= Carta.CARTAS_POR_PALO; j++) {
				baraja[siguienteCarta] = new Carta(j, Carta.PALOS[i]);
				siguienteCarta++;
			}
		}
	}
	
	public static void mostrarBaraja(Carta[] baraja) {
		for (int i = 0; i < baraja.length; i++) {
			System.out.print(baraja[i] + " ");
		}
	}
	
	public static void repartirCartas(Carta[] baraja, int cantidad, Carta[] cartasJugador1,Carta[] cartasJugador2) {
		int contadorJugador=0;
		int contadorTotal = 0;
		
		for (int i = 0; i < cantidad; i++) {
			cartasJugador1[contadorJugador] = baraja[contadorTotal];
			baraja[contadorTotal] = null;
			contadorJugador++;
			contadorTotal++;
		}
		
		contadorJugador = 0;
		
		for (int i = 0; i < cantidad; i++) {
			cartasJugador2[contadorJugador] = baraja[contadorTotal];
			baraja[contadorTotal] = null;
			contadorJugador++;
			contadorTotal++;
		}
	}
	
	public static void mezclar(Carta[] baraja) {
		Random rnd = new Random();
		
		for (int i = 0; i < baraja.length; i++) {
			int indiceAleatorioCambiar = rnd.nextInt(baraja.length);
			Carta temp = baraja[indiceAleatorioCambiar];
			baraja[indiceAleatorioCambiar] = baraja[i];
			baraja[i] = temp;
		}
	}
}
