package dam2.inicial.ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();

		// Leer Valores

		System.out.println("Introduce una serie de valores, pulsa -1 para finalizar");

		Scanner sc = new Scanner(System.in);

		int numero;

		do {

			numero = sc.nextInt();

			if (numero != -1) {
				numeros.add(numero);

			} else {
				System.out.println("Ha finalizado la entrada");
			}

		} while (numero != -1);

		// Mostar numero de valores

		numeroValores(numeros);

		// Mostrar Suma de valores

		int valoresSuma = sumaValores(numeros);

		System.out.println("La suma de todos los valores es " + valoresSuma);

		// Mostrar Media de Valores

		int mediaValores = mediaValores(numeros, valoresSuma);

		System.out.println("La media de todos los valores es " + mediaValores);

		// Mostrar todos los valores

		mostrarValores(numeros);

		// Mostrar Valores mayores a la media

		mostrarMayosMedia(numeros, mediaValores(numeros, sumaValores(numeros)));

	}

	public static void numeroValores(ArrayList<Integer> numeros) {

		int cantidadNumeros = numeros.size();

		System.out.println("Ha introducido un total de " + cantidadNumeros + " valores");

	}

	public static int sumaValores(ArrayList<Integer> numeros) {

		int valoresSuma = 0;

		for (int i = 0; i < numeros.size(); i++) {

			valoresSuma = valoresSuma + numeros.get(i);
		}

		return valoresSuma;
	}

	public static int mediaValores(ArrayList<Integer> numeros, int sumaValores) {

		int mediaValores;

		mediaValores = sumaValores / numeros.size();

		return mediaValores;
	}

	public static void mostrarValores(ArrayList<Integer> numeros) {

		System.out.println("Ha introducido los siguientes valores");

		System.out.println(numeros);
	}

	public static void mostrarMayosMedia(ArrayList<Integer> numeros, int mediaValores) {

		System.out.println("Los valores introducidos mayores a la media son los siguientes");

		ArrayList<Integer> numerosMayorMedia = new ArrayList<Integer>();

		for (int i = 0; i < numeros.size(); i++) {

			if (numeros.get(i) > mediaValores) {

				numerosMayorMedia.add(numeros.get(i));

			}

		}

		System.out.println(numerosMayorMedia);

	}
}
