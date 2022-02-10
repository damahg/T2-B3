package E05;

public class Main {

	public static void main(String[] args) {
		Equipo e1 = new Equipo("Alcalá FC", "Alcala", "Alcala de gra");
		Equipo e2 = new Equipo("Mataos", "mataos stadium", "Alcala de gra");
		
		try {
			Partido p1 = new Partido(1, e1, e2);
			System.out.println(p1.toString());
			
			p1.ponerResultado("1-2");
			System.out.println(p1.toString());
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
