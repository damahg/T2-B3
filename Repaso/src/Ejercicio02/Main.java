package Ejercicio02;

public class Main {

	public static void main(String[] args) {
		Fraccion f = null;
		try {
			f = new Fraccion (1, 2);
		} catch (Exception e) {
			System.out.println("ha petao");
		}
		
		
		System.out.println(f.toString());

	}

}
