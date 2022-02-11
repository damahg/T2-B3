package matestron.incompleto;

import java.util.Random;
import java.util.Scanner;

public class JuegoMates {

	public static void main(String args[]) {

		Scanner teclado = new Scanner(System.in);

		// Creamos el menu inicial con instrucciones
		System.out.println("Bienvenido a Matestron !!!");
		System.out.println("En cada turno debes elegir la operación que obtenga mayor puntuación");

		String res = "N";
		do {
			System.out.println("¿Estas preparado? S / N");
			res = teclado.nextLine();
			if (!res.equals("S")) {
				System.out.println("Opssssss");
			}
		} while (!res.equals("S"));

		System.out.println(" AL TURRONNNNN!!!!!");

		// Creamos el numero aleatorio inicial
		Random aleatorio = new Random();
		//Para comprobar que peta si es el maximos
		//long puntuacion = Long.MAX_VALUE;
		long puntuacion = aleatorio.nextInt(9) + 1;
		long puntuacionMaxPosible = puntuacion;

		boolean max = false;
		
		// Creamos un bucle que vaya generando operaciones, de dos en dos para elegir
		for (int i = 0; i < 5 && !max; i++) {
			System.out.println("Elige entre...");

			// Creamos las operaciones con la clase Operaciones
			Operacion operacion1 = new Operacion();
			Operacion operacion2 = new Operacion();
			System.out.println("1.->" + operacion1.toString(puntuacion));
			System.out.println("2.->" + operacion2.toString(puntuacion));

			int op = 0;
			do {
				//Si introduce algo que no sea un numero, salta el mesaje y vuelve a preguntar opr una opcion.
				try {
					String opcion = teclado.nextLine();
					op = Integer.parseInt(opcion);
				} catch (Exception e) {
					System.out.println("Opcion no válida");
					
				}
			} while (op != 1 && op != 2);

			try {
				// Calculamos cual era el optimo
				long valorMaximo1 = operacion1.calcula(puntuacion);
				long valorMaximo2 = operacion2.calcula(puntuacion);
				puntuacionMaxPosible = (valorMaximo1 > valorMaximo2) ? valorMaximo1 : valorMaximo2;
			} catch (ArithmeticException exception) {
				// Si salta excepción, ponemos el maximo que se puede alcanzar
				puntuacionMaxPosible = Long.MAX_VALUE;
				max = true; //FIN
			}

			try {
				// Actualizamos el calculo del usuario
				puntuacion = (op == 1) ? operacion1.calcula(puntuacion) : operacion2.calcula(puntuacion);
			} catch (ArithmeticException exception) {
				System.out.println("Puntuación máxima alcanzada");
				puntuacion = Long.MAX_VALUE;
				max = true; //FIN
			}
		}//for

		teclado.close();

		// Mensajes finales.
		System.out.println("Has conseguido un total de " + puntuacion + " de " + puntuacionMaxPosible);

		if (puntuacion == puntuacionMaxPosible) {
			System.out.println("Muy bien calculín!!!!");
		}

	}
}
