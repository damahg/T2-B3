package E05;

public class Partido {
	private int jornada;
	private int golesLocal = 0;
	private int golesVisitante = 0;
	private char resultado = '0';
	private Equipo local;
	private Equipo visitante;
	
	
	public Partido (int jornada, Equipo local, Equipo visitante) throws PartidoException{
		setJornada(jornada);
		this.local = local;
		this.visitante = visitante;
		
		if (local.equals(visitante)) {
			throw new PartidoException("El equipo local y visitante son el mismo");
		}
		
		
	}


	public int getJornada(){
		return jornada;
	}

	private void setJornada(int jornada) throws PartidoException {
		if (jornada < 1 || jornada > 38) {
			throw new PartidoException("Jornada no válida");
		}
		this.jornada = jornada;
	}

	public int getGolesLocal() {
		return golesLocal;
	}

	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}

	public int getGolesVisitante() {
		return golesVisitante;
	}

	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}

	public char getResultado() {
		return resultado;
	}

	public void setResultado(char resultado) {
		this.resultado = resultado;
	}

	public Equipo getLocal() {
		return local;
	}

	public Equipo getVisitante() {
		return visitante;
	}

	public void ponerResultado (String resultado) throws PartidoException{
		
		if (!(Character.isDigit(resultado.charAt(0)) && resultado.charAt(1) == '-' && Character.isDigit(resultado.charAt(2))  && resultado.length() == 3)) {
			throw new PartidoException("Resultado no válido");
		}
		
		setGolesLocal(resultado.charAt(0));
		setGolesVisitante(resultado.charAt(2));
		
		if (getGolesLocal() > getGolesVisitante()) {
			setResultado('1');
		}else {
			if (getGolesLocal() < getGolesVisitante()) {
				setResultado('2');
			}else {
				setResultado('X');
			}
		}//if else
		
	}

	@Override
	public String toString() {
		String res; 
		if (resultado == '0') {
			res = "Partido entre " + local.getNombreEquipo() + " y " + visitante.getNombreEquipo() + "Aun no se ha jugado";
		}else {
			res = "Partido entre equipo local " + local.getNombreEquipo() + " y el equipo visitante " + visitante.getNombreEquipo() + " jugado en el estadio " + local.getNombreEstadio() + " de la ciudad " + local.getCiudad() + " ha finalizado con " + golesLocal + " goles de equipo local y " + golesVisitante + " goles de equipo visitante. Resultado quiniela= " + resultado;
		}
		
		return res;
	}
	
	
}
