package E01;

public class Rectangulo {
	private int longitud = 1;
	private int ancho = 1;
	
	public Rectangulo(int longitud, int ancho) throws RectanguloException{
		setLongitud(longitud);
		setAncho(ancho);
	}
	
	
	public int getLongitud() {
		return longitud;
	}
	
	public void setLongitud(int longitud) throws RectanguloException {
		if(longitud > 0 && longitud < 20) {
			this.longitud = longitud;
		}else {
			throw new RectanguloException("Error, longitud incorrecta");
		}
	}
	
	public int getAncho () {
		return ancho;
	}
	
	public void setAncho(int ancho) throws RectanguloException{
		if(ancho > 0 && ancho < 20) {
			this.ancho = ancho;
		}else {
			throw new RectanguloException("Error, ancho incorrecto");
		}
	}
	
	public int calcularPerimetro() {
		int perimetro;
		
		perimetro = 2*longitud + 2*ancho;
		
		return perimetro;
	}
}
