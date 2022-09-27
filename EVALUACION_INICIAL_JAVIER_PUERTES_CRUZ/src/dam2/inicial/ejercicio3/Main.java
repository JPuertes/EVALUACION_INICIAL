package dam2.inicial.ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<Contacto> contactos = new ArrayList<Contacto>();

		Scanner sc = new Scanner(System.in);

		String menu;

		// MENU

		do {
			System.out.println("1- Leer contactos");
			System.out.println("2- Añadir contacto");
			System.out.println("3- Eliminar contacto");
			System.out.println("s- Salir");

			menu = sc.nextLine();

			if (menu.equals("1")) {

				leerContacto(contactos);
			}
			
			else if(menu.equals("2")) {
				
				anadirContacto(contactos);
			}
			

		} while (!menu.equals("s"));

	}

	public static void leerContacto(ArrayList<Contacto> contactos) {

		System.out.println(contactos.toString());

	}

	public static void anadirContacto(ArrayList<Contacto> contactos) {
		
		Scanner sc1 = new Scanner (System.in);
		
		System.out.println("Introduce el nombre");
		
		String nombre=sc1.next();
		
		System.out.println("Introduce el apellido");
		
		String apellido=sc1.next();

		System.out.println("Introduce el numero");
		
		int numero=sc1.nextInt();

		contactos.add(new Contacto(nombre, apellido, numero));
		
		


	}

}
