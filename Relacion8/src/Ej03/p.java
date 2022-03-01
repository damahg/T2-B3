package Ej03;

public class p {

	public static void main(String[] args) {
		try {
			Hotel h1 = new Hotel(2,2,1);
			
			h1.mostrarHabitaciones();
			
			h1.checkIn("SIMPLE");
			h1.checkIn("DOBLE");
			
			h1.mostrarHabitaciones();
			
			h1.checkOut(3);
			
			h1.mostrarHabitaciones();
			
		} catch (Exception e) {
			System.out.println("peta");
		}
		
		
		

	}

}
