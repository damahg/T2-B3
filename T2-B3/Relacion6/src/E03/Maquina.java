package E03;

public class Maquina {
	private static final double PRECIO_CAFE_SOLO = 1;
	private static final double PRECIO_LECHE = 0.8;
	private static final double PRECIO_CAFE_LECHE = 1.5;
	
	private double monedero;
	private int vasos;
	private int dosisCafe;
	private int dosisLeche;
	
	
	public Maquina() {
		monedero = 5.0;
		dosisCafe = 50;
		dosisLeche = 50;
		vasos = 80;
	}


	public double getMonedero() {
		return monedero;
	}


	public void setMonedero(double monedero) {
		this.monedero = monedero;
	}


	public int getVasos() {
		return vasos;
	}


	public void setVasos(int vasos) {
		this.vasos = vasos;
	}


	public int getDosisCafe() {
		return dosisCafe;
	}


	public void setDosisCafe(int dosisCafe) {
		this.dosisCafe = dosisCafe;
	}


	public int getDosisLeche() {
		return dosisLeche;
	}


	public void setDosisLeche(int dosisLeche) {
		this.dosisLeche = dosisLeche;
	}
	
	public void llenarDepositos() {
		setDosisCafe(50);
		setDosisLeche(50);
		setVasos(80);
		
		System.out.println("Depositos llenos");
	}
	
	public void vaciarMonedero() {
		setMonedero(0);
		
		System.out.println("Monedero vaciado");
	}
	
	public void servirCafe(int tipo) {
		switch (tipo) {
		case 1: {
			dosisCafe --;
			vasos --;
			monedero = monedero + PRECIO_CAFE_SOLO;
			System.out.println("Producto servido");
		}
		case 2: {
			dosisLeche --;
			vasos --;
			System.out.println("Producto servido");
		}
		case 3: {
			dosisCafe --;
			dosisLeche --;
			vasos --;
			System.out.println("Producto servido");
		}
		default:
			System.out.println("Error, tipo inv�lido");
		}
	}
	
	public void estadoMaquina() {
		System.out.println("Dosis de cafe: " + getDosisCafe());
		System.out.println("Dosis de leche: " + getDosisLeche());
		System.out.println("Vasos: " + getVasos());
		System.out.println("Monedero: " + getMonedero());
	}
}
