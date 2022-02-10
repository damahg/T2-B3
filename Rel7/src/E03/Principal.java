package E03;

public class Principal {

	public static void main(String[] args) {
		
		try {
			Categoria c1 = new Categoria ("Esencial", 10);
			
			Producto p1 = new Producto("Pan", 5.0, c1);
			
			System.out.println(p1.calcularPrecio());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		

	}

}
