package E02;

public class Principal {
	public static void main(String[] args) {
		Punto punto1 = new Punto(2,1);
		Punto punto2 = new Punto(5,3);
		Linea linea1 = null;
		
		try {
			linea1 = new Linea(punto1, punto2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		System.out.println(linea1.toString());
		
		//Mover derecha
		try {
			linea1.moverDerecha(2);
			System.out.println(linea1.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Mover izquierda
		try {
			linea1.moverIzquierda(2);
			System.out.println(linea1.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Mover arriba
		try {
			linea1.moverArriba(2);
			System.out.println(linea1.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Mover abajo
				try {
					linea1.moverAbajo(2);
					System.out.println(linea1.toString());
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
	}
}
