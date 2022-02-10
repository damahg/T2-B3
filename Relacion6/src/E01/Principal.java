package E01;
import java.util.Scanner;
public class Principal {
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) throws RectanguloException{
		int longitud;
		int ancho;
		
		System.out.println("Introduce longitud y ancho del rectangulo");
		longitud = Integer.parseInt(kb.nextLine());
		ancho = Integer.parseInt(kb.nextLine());
		
		Rectangulo r1 = new Rectangulo(longitud, ancho);
		
		System.out.println("El perimetro es: " + r1.calcularPerimetro());
	}

}
