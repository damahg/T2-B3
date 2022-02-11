package E04;

public class Jarra {
	
	private int capacidad;
	private int cantidad;
	
	private static int totalAgua;
	
	public Jarra (int capacidad, int cantidad) throws JarraException {
		setCapacidad(capacidad);
		setCantidad(cantidad);
	}

	
	//GETTERS Y SETTERS
	public int getCapacidad() {
		return capacidad;
	}

	private void setCapacidad(int capacidad) throws JarraException{
		if (capacidad <= 0) {
			throw new JarraException("La capacidad debe ser positiva");
		}else {
			this.capacidad = capacidad;
		}
	}

	public int getCantidad() {
		return cantidad;
	}

	private void setCantidad(int cantidad) throws JarraException {
		if (cantidad < 0) {
			throw new JarraException("La cantidad debe ser positiva o cero");
		}else {
			this.cantidad = cantidad;
		}
	}
	
	public static int getTotalAgua() {
		return totalAgua;
	}


	/**
	 * Metodo para llenar la jarra desde un grifo
	 */
	public void llenarJarra () {
		totalAgua = totalAgua + (capacidad - cantidad);
		this.cantidad  = this.capacidad;
	}
	
	/**
	 * Metodo para vaciar la jarra
	 */
	public void vaciarJarra() {
		this.cantidad = 0;
	}
	
	/**
	 * Metodo para volcar otra jarra en esta
	 */
	public void volcarJarra(Jarra jarra) throws JarraException {
		
		//Si la jarra origen está vacía
		if (jarra.cantidad == 0) {
			throw new JarraException("La jarra está vacía");
		}
		
		int total = this.cantidad + jarra.getCantidad(); //Calculo el total de las cantidades
		
		if (total > this.capacidad) { //Si el total es mayor que la capacidad de la Jarra que recibe
			
			//Calculo lo que sobra en la jarra que vuelca
			int sobrante = (jarra.getCantidad() - (this.capacidad - this.cantidad)); 
			//				lo que se echa			lo que quedaba para que se llenara		
			this.llenarJarra();
			
			if (sobrante > 0) { //Si lo que sobra es mayor que 0 (sobra algo)
				
				jarra.setCantidad(sobrante); //Le pongo a la jarra que se vuelca la cantidad que sobra
			}
		}else { //Si el total no es mayor que la capacidad de la jarra que recibe (Si cabe entera)
			this.cantidad = total; //Lleno la jarra con el total
			jarra.vaciarJarra(); //Vacio la jarra que echa
		}
	}//volcarJarra
	
	@Override
	public String toString() {
		
		return ("La jarra tiene una capacidad de: " + capacidad + " y una cantidad de: " + cantidad);
	}
}
