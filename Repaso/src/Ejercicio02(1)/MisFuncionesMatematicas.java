package Ejercicio02;
public class MisFuncionesMatematicas {



	public static boolean esMultiplo(int numero1, int numero2) throws MisFuncionesMatematicasException {
		boolean resul;
		int menor, mayor;

		if (numero1 == 0 || numero2 == 0)
			throw new MisFuncionesMatematicasException("Alguno de los numeros vale 0. No se si son multiplos");

		mayor=Math.max(numero1, numero2);
		menor=Math.min(numero1, numero2);
		
		if (mayor % menor == 0 ) {
			resul = true;
		} else {
			resul = false;
		}
		return resul;

	}

	public static int mcd(int numero1, int numero2) throws MisFuncionesMatematicasException {
		int contador, result = 0;
		boolean encontrado;

		if (numero1 == 0 || numero2 == 0) {
			throw new MisFuncionesMatematicasException("Error, no puede calcularse el mcd"); // excepcion
		}
		if (numero1 < 0) {
			numero1 = -numero1;
		}
		if (numero2 < 0) {
			numero2 = -numero2;
		}
		if (numero1 < numero2) { // empezamos por el mas pequeño
			contador = numero1;
		} else {
			contador = numero2;
		}

		encontrado = false;

		while (contador >= 1 && encontrado == false) {

			if (numero1 % contador == 0 && numero2 % contador == 0) {
				result = contador;
				encontrado = true;
			}
			contador--;
		}
		return result;
	}

	
	
	public static int mcm(int numero1, int numero2) throws MisFuncionesMatematicasException {
		int limiteInferior, limiteSuperior;
		int cont = -1;
		boolean encontrado;

		if (numero1 == 0 || numero2 == 0)
			throw new MisFuncionesMatematicasException("Error, no puede calcularse el mcm");

		if (numero1 < 0) {
			numero1 = -numero1;
		}
		if (numero2 < 0) {
			numero2 = -numero2;
		}

		limiteSuperior = numero1 * numero2;

		// El limite inferior es el mayor
		if (numero1 < numero2)
			limiteInferior = numero2;
		else
			limiteInferior = numero1;

		cont = limiteInferior;
		encontrado = false;
		while (cont <= limiteSuperior && !encontrado) {
			if (cont % numero1 == 0 && cont % numero2 == 0)
				encontrado = true;
			else
				cont = cont + limiteInferior; // sumo hasta el mayor

		}

		return cont;

	}

	public static boolean primo(int numero) {

		boolean primo;
		int contador;

		contador = 2;

		if (numero <= 0) {
			primo = false;
		} else {
			primo = true;

			while (contador <= numero / 2 && primo) {
				if (numero % contador == 0) {
					primo = false;

				}
				contador++;
			}
		}

		return primo;
	}

}