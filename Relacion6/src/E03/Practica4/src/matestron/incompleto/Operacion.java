package matestron.incompleto;

/**
 * @author y0rg 
 * Esta clase representa UNA operación de las múltiples 
 * que debe generar el juego
 */

public class Operacion {

	// El tipo de operación lo definiremos con un entero, de modo que...
	public static final int SUMA = 1;
	public static final int RESTA = 2;
	public static final int MULTIPLICACION = 3;
	public static final int DIVISION = 4;

	
	// TODO Aquí me faltan por definir los atributos de la clase (operacion y numero)

	
	
	
	/**
	 * Este es el constructor, deberemos iniciar los valores de la "operacion"
	 */
	public Operacion() {
		// TODO

	}

	// Metodo que devuelva en texto el signo de la operación
	// Si el signo de la operación es 1, devuelve la cadenas "+";
	// si la operacion es 2, el signo "-";
	// si la operación es 3, el signo "*";
	// si la operación es 4, el signo "/";
	/**
	 * @return el signo en texto de la operacion
	 */
	public String signoOperacion() {
		//TODO
		return "TODO";
	}

	// TODO completar el metodo que calcula la operacion a partir del
	// signo de la operacion, del numero que contiene la operacion
	// y de un valor que se le pasa, que representa la puntuacion del usuario
	// Se deben usar los metodos de la clase Math para los calculos,
	/**
	 * @param calculoUsuario representa la puntuacion del usuario en el momento que
	 * el metodo es invocado
	 * @return devuelve el resultado de la operacion, 
	 */
	public long calcula(long calculoUsuario) {
		//TODO
		return 0;
	}

	// TODO crear el metodo toString que imprima la operación
	// Tendra como parametro de entrada la puntuacion actual del usuario
	public String toString(long calculoUsuario) {

		return "TODO";

	}

}
