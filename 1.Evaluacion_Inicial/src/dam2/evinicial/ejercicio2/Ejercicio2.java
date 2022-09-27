package dam2.evinicial.ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		ArrayList<Integer> valores = new ArrayList<Integer>();
		int salida = 1;
		double suma = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce los numeros que deseas analizar, pulsa -1 para salir");

		while (salida == 1) {

			int valor = sc.nextInt();

			if (valor != -1) {
				valores.add(valor);

			} else if (valor == -1) {
				salida = 0;

			}
		}

		for (int i = 0; i < valores.size(); i++) {

			double numero = valores.get(i);

			suma = suma + numero;

		}

		double media = suma / valores.size();

		System.out.println("la suma de los numeros introducidos es " + suma);
		System.out.println("la media de los numeros introducidos es " + media);
		System.out.println("Los numero mayores a la media son los siguientes:");

		for (int i = 0; i < valores.size(); i++) {

			if (valores.get(i) > media) {

				System.out.println(valores.get(i));
			}
		}

		System.out.println("Estos son todos los numeros introducidos /n");

		for (int j = 0; j < valores.size(); j++) {

			System.out.println(valores.get(j));

		}

	}

}