package tp1.ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {
	final static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		final int EDAD_MAX = 120, EDAD_MIN = 1, EDAD_JUB_FEM = 60, EDAD_JUB_MASC = 65;
		int edad;
		String gender;

		System.out.println("Por favor ingrese su edad");
		edad = Integer.parseInt(input.nextLine());

		System.out.println("Por favor ingrese su genero M para masculino o F mpara femenino");
		gender = input.nextLine();

		if (edad < EDAD_MAX && edad > EDAD_MIN && (gender == "M" || gender == "F")) {
			if ((edad >= EDAD_JUB_FEM && gender == "F") || (edad >= EDAD_JUB_MASC && gender == "M")) {
				System.out.println("Esta en edad de jubilarse");
			} else {
				System.out.println("No está en edad de jubilarse");
			}
		}

		if (edad > EDAD_MAX || edad < EDAD_MIN) {
			System.out.println("Error en la edad ingresada");
		}

		if (gender != "M" && gender != "F") {
			System.out.println("Error en el genero ingresado");
		}

	}
}
