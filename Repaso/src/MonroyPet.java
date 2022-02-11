public class MonroyPet {

	private static final int LIMITE_MINUTOS_JUGAR = 20;
	private static final int COMIDA_INICIAL = 2;
	private static final int PUNTOS_INCIALES = 0;
	private String nombre;
	private String tipo;
	private int puntos;
	private int comida;
	
	private static int totalJugadoEntreTodasMascotas=0;

	public MonroyPet(String nombre, String tipo) throws MonroyPetException {
		
		if ( !  (tipo.equals("PERRO")  || tipo.equals("GATO"))) {
			throw new MonroyPetException("Tipo de mascota incorrecto");
		}
		this.nombre = nombre;
		this.tipo = tipo;
		this.puntos= PUNTOS_INCIALES;
		this.comida=COMIDA_INICIAL;
		
	}
	
	
	//GETTERS SETTERS

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public int getPuntos() {
		return puntos;
	}

	public int getComida() {
		return comida;
	}


	public static int getTotalJugadoEntreTodasMascotas() {
		return totalJugadoEntreTodasMascotas;
	}
	
	/**
	 * Metodo para dar comida a la mascota. Tira excepcion si no tienes comida.
	 */
	public void darComida () throws MonroyPetException{
		if(this.comida == 0) {
			throw new MonroyPetException("No tienes comida suficiente, compra más");
		}else {
			this.comida = this.comida -1;
		}
	}//darComida
	
	/**
	 * Calcula el precio de la comida y lo resta a los puntos. Tira excepcion si el precio es mayor a los puntos
	 * @param cantidad
	 * @throws MonroyPetException
	 */
	public void comprarComida(int cantidad) throws MonroyPetException {
		int precio = cantidad * 30;
		
		if(precio > this.puntos) {
			throw new MonroyPetException("No tienes suficientes puntos");
		}else {
			this.puntos = this.puntos - precio;
		}
	}//comprarComida
	
	
	/**
	 * Calcula los puntos segun los minutos de juego. Tira excepcion si superan el limite
	 * @param tiempo
	 * @throws MonroyPetException
	 */
	public void jugar (int tiempo)  throws MonroyPetException{
		if(tiempo > LIMITE_MINUTOS_JUGAR) {
			throw new MonroyPetException("El número de minutos no puede ser mayor que " + LIMITE_MINUTOS_JUGAR);
		}else {
			int recompensa = tiempo * 3;
			this.puntos = this.puntos + recompensa;
			totalJugadoEntreTodasMascotas = totalJugadoEntreTodasMascotas + tiempo;
		}
	}//jugar
	
	
}
