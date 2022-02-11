package Ejercicio02;

public class Fraccion {

	private int numerador;
	private int denominador;

	public Fraccion(int numerador, int denominador) throws MisFuncionesMatematicasException {
		this.numerador = numerador;
		if (denominador == 0) {
			throw new MisFuncionesMatematicasException("El denominador no puede ser 0");
		}
		this.denominador = denominador;
	}

	//GETTERS // SETTERS
	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	
	
	public String toString() {
		String str = this.getNumerador() + " / " + this.getDenominador();
		return str;
	}

	public boolean equals(Fraccion f) {
		boolean esCorrecta = false;
		double res1 = this.getNumerador()/this.getDenominador();
		double res2 = f.getNumerador()/this.getDenominador();
		
		if(res1 == res2) {
			esCorrecta = true;
		}
		
		return esCorrecta;
	}
	
	public void simplificar() {
		
		try {
			int mcd = MisFuncionesMatematicas.mcd(numerador,denominador);
			denominador = (denominador/mcd);
			numerador = (numerador/mcd);
		} catch (MisFuncionesMatematicasException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public Fraccion sumar(Fraccion f1, Fraccion f2) {
		
	}
}
