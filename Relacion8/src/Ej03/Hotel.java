package Ej03;

public class Hotel {
	private Habitacion[] habitaciones;
	private int numeroHabitacionesSimples;
	private int numeroHabitacionesDobles;
	private int numeroHabitacionesTriples;
	
	
	public Hotel(int numeroHabitacionesSimples, int numeroHabitacionesDobles, int numeroHabitacionesTriples) throws HotelException{
		setNumeroHabitacionesSimples(numeroHabitacionesSimples);
		setNumeroHabitacionesDobles(numeroHabitacionesDobles);
		setNumeroHabitacionesTriples(numeroHabitacionesTriples);
		
		this.habitaciones = new Habitacion[numeroHabitacionesSimples + numeroHabitacionesDobles + numeroHabitacionesTriples];
		crearHabitaciones();
	}
	
	
	public int getNumeroHabitacionesSimples() {
		return numeroHabitacionesSimples;
	}

	public void setNumeroHabitacionesSimples(int numeroHabitacionesSimples) throws HotelException{
		if (numeroHabitacionesSimples <= 0) {
			throw new HotelException("El numero de habitaciones no puede ser menor o igual a 0");
		}
		this.numeroHabitacionesSimples = numeroHabitacionesSimples;
	}


	public int getNumeroHabitacionesDobles() {
		return numeroHabitacionesDobles;
	}

	public void setNumeroHabitacionesDobles(int numeroHabitacionesDobles) throws HotelException{
		if (numeroHabitacionesDobles <= 0) {
			throw new HotelException("El numero de habitaciones no puede ser menor o igual a 0");
		}
		this.numeroHabitacionesDobles = numeroHabitacionesDobles;
	}


	public int getNumeroHabitacionesTriples() {
		return numeroHabitacionesTriples;
	}

	public void setNumeroHabitacionesTriples(int numeroHabitacionesTriples) throws HotelException{
		if (numeroHabitacionesTriples <= 0) {
			throw new HotelException("El numero de habitaciones no puede ser menor o igual a 0");
		}
		this.numeroHabitacionesTriples = numeroHabitacionesTriples;
	}






	private void crearHabitaciones() {
		int contadorHabitaciones = 0;
		for (int i = 0; i < numeroHabitacionesSimples; i++) {
			habitaciones[contadorHabitaciones] = new Habitacion(contadorHabitaciones + 1, "SIMPLE");
			contadorHabitaciones++;
		}
		for (int i = 0; i < numeroHabitacionesDobles; i++) {
			habitaciones[contadorHabitaciones] = new Habitacion(contadorHabitaciones + 1, "DOBLE");
			contadorHabitaciones++;
		}
		for (int i = 0; i < numeroHabitacionesTriples; i++) {
			habitaciones[contadorHabitaciones] = new Habitacion(contadorHabitaciones + 1, "TRIPLE");
			contadorHabitaciones++;
		}
	}//crearHabitaciones
	
	public void mostrarHabitaciones() {
		for (int i = 0; i < habitaciones.length; i++) {
			System.out.println(habitaciones[i]);
		}
	}//mostrarHabitaciones
	
	
	public void checkIn(String tipo) throws HotelException{
		boolean libre = false;
		int numHabitacion = 0;
		for (int i = 0; i < habitaciones.length && libre == false; i++) {
			if (habitaciones[i].getTipo().equals(tipo)) {
				if (!habitaciones[i].isOcupada()) {
					libre = true;
					numHabitacion = i+1;
					habitaciones[i].setOcupada(true);
				}
			}
		}//for
		
		if (libre) {
			System.out.println("La habitacion asignada es: " + numHabitacion);
			System.out.println("Check-In correcto");
		}else {
			throw new HotelException("No hay habitaciones libres de ese tipo");
		}
	}
	
	public void checkOut(int numero) {
		for (int i = 0; i < habitaciones.length; i++) {
			if (habitaciones[i].getNumero() == numero) {
				habitaciones[i].setOcupada(false);
			}
		}//for
		
		System.out.println("Check-Out correcto");
	}
}
