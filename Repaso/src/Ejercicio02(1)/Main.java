package Ejercicio02;
import java.util.Scanner;
public class Main {
	private static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		Fraccion f1 = null;
		Fraccion f2 = null;
		
		int num = 0;
		int den = 1;
		boolean esCorrecto = false;
		
		do {
			System.out.print("Introduce el numerador: ");
			num = Integer.parseInt(kb.nextLine());
			System.out.print("Introduce el denominador: ");
			den = Integer.parseInt(kb.nextLine());
			
			try {
				f1 = new Fraccion (num, den);
				esCorrecto = true;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				esCorrecto = false;
			}
			
		} while (esCorrecto == false);
		
		do {
			System.out.print("Introduce el numerador: ");
			num = Integer.parseInt(kb.nextLine());
			System.out.print("Introduce el denominador: ");
			den = Integer.parseInt(kb.nextLine());
			
			try {
				f2 = new Fraccion (num, den);
				esCorrecto = true;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				esCorrecto = false;
			}
			
		} while (esCorrecto == false);
		
		
		
		System.out.println(dividir(f1, f2));
	}

	public static Fraccion sumar (Fraccion f1, Fraccion f2) {
		Fraccion resultado = null;
		int mcm = 1;
		
		try {
			mcm = MisFuncionesMatematicas.mcm(f1.getDenominador(), f2.getDenominador());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		int resultadoNumerador = (((mcm/f1.getDenominador())) * f1.getNumerador()) + (((mcm/f2.getDenominador())) * f2.getNumerador());
		
		try {
			resultado = new Fraccion (resultadoNumerador, mcm);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return resultado;
	}
	
	
	public static Fraccion restar (Fraccion f1, Fraccion f2) {
		Fraccion resultado = null;
		int mcm = 1;
		
		try {
			mcm = MisFuncionesMatematicas.mcm(f1.getDenominador(), f2.getDenominador());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		int resultadoNumerador = (((mcm/f1.getDenominador())) * f1.getNumerador()) - (((mcm/f2.getDenominador())) * f2.getNumerador());
		
		try {
			resultado = new Fraccion (resultadoNumerador, mcm);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return resultado;
	}
	
	public static Fraccion multiplicar (Fraccion f1, Fraccion f2) {
		Fraccion resultado = null;
		
		
		int resultadoNumerador = f1.getNumerador() * f2.getNumerador() ;
		int resultadoDenominador = f1.getDenominador() * f2.getDenominador();
		
		try {
			resultado = new Fraccion (resultadoNumerador, resultadoDenominador);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return resultado;
	}
	
	public static Fraccion dividir (Fraccion f1, Fraccion f2) {
		Fraccion resultado = null;
		
		
		int resultadoNumerador = f1.getNumerador() * f2.getDenominador();
		int resultadoDenominador = f1.getDenominador() * f2.getNumerador();
		
		try {
			resultado = new Fraccion (resultadoNumerador, resultadoDenominador);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return resultado;
	}
}
