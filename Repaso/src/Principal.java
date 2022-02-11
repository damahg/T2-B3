import java.util.Scanner;

public class Principal {
	private static final int LIMITE_CONTROL_PARENTAL = 100;
	private static Scanner kb = new Scanner (System.in);
	public static void main(String[] args) throws MonroyPetException {
		
		boolean mascotaValida = true;
		String tipo;
		String nombre;
		
		//Mascota 1
		MonroyPet pet1 = null;

		System.out.println("Elige el nombre de la mascota 1");
		nombre = kb.nextLine();
		
		do {
			System.out.println("Elige el tipo de mascota (PERRO / GATO)");
			tipo = kb.nextLine();
			
			try {
				pet1 = new MonroyPet(nombre, tipo);
				mascotaValida = true;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				mascotaValida = false;
			}
			
		} while (mascotaValida == false);

		
		mascotaValida = true;
		
		//Mascota 2
		MonroyPet pet2 = null;
		
		System.out.println("Elige el nombre de la mascota 2");
		nombre = kb.nextLine();
		
		do {
			System.out.println("Elige el tipo de mascota (PERRO / GATO)");
			tipo = kb.nextLine();
			
			try {
				pet2 = new MonroyPet(nombre, tipo);
				mascotaValida = true;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				mascotaValida = false;
			}
		} while (mascotaValida == false);

		boolean tiempoAgotado = false;
		int elec = 0;
		
		while (tiempoAgotado == false) {
			mostrarMenu();
			elec = Integer.parseInt(kb.nextLine());
			tratarMenu(elec, pet1, pet2);
			
			if (MonroyPet.getTotalJugadoEntreTodasMascotas() >= LIMITE_CONTROL_PARENTAL) {
				tiempoAgotado = true;
				System.out.println("Las mascotas tienen sueño... Se van a dormir ZZZZ");
			}
			
		}//while
		
	}//main
	
	/**
	 * Muestra el menú
	 */
	public static void mostrarMenu () {
		System.out.println("------MonroyPet------");
		System.out.println("1.- Dar comida.");
		System.out.println("2.- Comprar comida.");
		System.out.println("3.- Jugar con la mascota.");
		System.out.println("4.- Información de las mascotas.");
		System.out.println("5.- Salir.");
		System.out.println();
		System.out.print("Introduce tu selección: ");
		
	}//mostrarMenu
	
	/**
	 * Trata la eleccion del metodo mostrarMenu()
	 * @param elec
	 * @param pet1
	 * @param pet2
	 */
	public static void tratarMenu (int elec, MonroyPet pet1, MonroyPet pet2) {
		System.out.println();
		int numMascota;
		
		try {
			switch (elec) {
			case 1: //Dar comida
				do {
					System.out.println("Selecciona la mascota (1 o 2)");
					 numMascota = Integer.parseInt(kb.nextLine());
				} while (numMascota != 1 && numMascota != 2);
				
				if(numMascota == 1) {
					pet1.darComida();
				}else {
					pet2.darComida();
				}
				
				System.out.println("Has gastado 1 comida");
				System.out.println();
				break;
				
				
			case 2: //Comprar comida
				do {
					System.out.println("Selecciona la mascota (1 o 2)");
					 numMascota = Integer.parseInt(kb.nextLine());
				} while (numMascota != 1 && numMascota != 2);
				
				System.out.println("¿Cuanta comida quieres comprar?");
				int cantidad = Integer.parseInt(kb.nextLine());
				
				if(numMascota == 1) {
					pet1.comprarComida(cantidad);
				}else {
					pet2.comprarComida(cantidad);
				}
				
				System.out.println("Has comprado " + cantidad);
				System.out.println();
				break;
			
			case 3: //Jugar
				do {
					System.out.println("Selecciona la mascota (1 o 2)");
					 numMascota = Integer.parseInt(kb.nextLine());
				} while (numMascota != 1 && numMascota != 2);
				
				System.out.println("¿Cuantos minutos quieres jugar? (max 20)");
				int minutos = Integer.parseInt(kb.nextLine());
				
				if(numMascota == 1) {
					pet1.jugar(minutos);
				}else {
					pet2.jugar(minutos);
				}
				
				System.out.println("Has jugado " + minutos + " minutos");
				System.out.println();
				break;
			
			case 4: //Info Mascotas
				infoMascota(pet1, pet2);
				break;
			
			case 5:
				break;
			default:
				throw new MonroyPetException("Eleccion no válida");
			}//switch
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println();
		}
	}//tratarMenu
	
	
	/**
	 * Muestra la informacion de la mascota
	 * @param pet
	 */
	public static void infoMascota(MonroyPet pet1, MonroyPet pet2) {
		String tipoAlimento;
		if(pet1.getTipo().equals("PERRO")) {
			tipoAlimento = " hueso(s)"; //Tienen un espacio para el formato del syso
		}else {
			tipoAlimento = " pescado(s)";
		}
		
		System.out.println("Mascota 1");
		System.out.println("Nombre: " + pet1.getNombre());
		System.out.println("Tipo: " + pet1.getTipo());
		System.out.println("Puntos: " + pet1.getPuntos());
		System.out.println("Alimento: " + pet1.getComida() + tipoAlimento);
		System.out.println();
		
		if(pet2.getTipo().equals("PERRO")) {
			tipoAlimento = " hueso(s)"; //Tienen un espacio para el formato del syso
		}else {
			tipoAlimento = " pescado(s)";
		}
		
		System.out.println("Mascota 2");
		System.out.println("Nombre: " + pet2.getNombre());
		System.out.println("Tipo: " + pet2.getTipo());
		System.out.println("Puntos: " + pet2.getPuntos());
		System.out.println("Alimento: " + pet2.getComida() + tipoAlimento);
		System.out.println();
	}//infoMascota
	
	public static void crearMascotas(){
		
	}
	
}//class Principal
