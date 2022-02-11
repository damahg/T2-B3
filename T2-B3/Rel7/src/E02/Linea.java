package E02;

public class Linea {
	private Punto puntoA;
	private Punto puntoB;
	
	public Linea (Punto puntoA, Punto puntoB) throws LineaException{
		if (puntoA.equals(puntoB)) {
			throw new LineaException("Son el mismo punto");
		}
		
		this.puntoA = puntoA;
		this.puntoB = puntoB;
		
	}

	public Punto getPuntoA() {
		return puntoA;
	}

	public void setPuntoA(Punto puntoA) {
		this.puntoA = puntoA;
	}

	public Punto getPuntoB() {
		return puntoB;
	}

	public void setPuntoB(Punto puntoB) {
		this.puntoB = puntoB;
	}
	
	public boolean equals(Linea lineaB) {
		boolean igual = false;
		if (this.puntoA.equals(lineaB.puntoA) && this.puntoB.equals(lineaB.puntoB)) {
			igual = true;
		}
				
		return igual;
	}
	
	public void moverDerecha(double cantidad) throws LineaException{
		if (cantidad <= 0) {
			throw new LineaException("La cantidad no puede ser negativa o 0");
		}	
		this.puntoA.setX(puntoA.getX() + cantidad);
		this.puntoB.setX(puntoB.getX() + cantidad);
	}
	
	public void moverIzquierda(double cantidad) throws LineaException{
		if (cantidad <= 0) {
			throw new LineaException("La cantidad no puede ser negativa o 0");
		}
		this.puntoA.setX(puntoA.getX() - cantidad);
		this.puntoB.setX(puntoB.getX() - cantidad);
	}
	
	public void moverArriba(double cantidad) throws LineaException{
		if (cantidad <= 0) {
			throw new LineaException("La cantidad no puede ser negativa o 0");
		}
		this.puntoA.setY(puntoA.getY() + cantidad);
		this.puntoB.setY(puntoB.getY() + cantidad);
	}
	
	public void moverAbajo(double cantidad) throws LineaException{
		if (cantidad <= 0) {
			throw new LineaException("La cantidad no puede ser negativa o 0");
		}
		this.puntoA.setY(puntoA.getY() - cantidad);
		this.puntoB.setY(puntoB.getY() - cantidad);
	}

	@Override
	public String toString() {
		return "Linea ["+ puntoA.toString() + "," + puntoB.toString()+"]";
	}
	
	
}
