package tp1.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	final static Scanner input = new Scanner(System.in);
	
    public static void main(String[] args) {
        final int DIVISOR = 2, MULTIPLICADOR = 5;
        int number, multiplicacion;
        double division;
        
        System.out.println("Por favor, ingresa un numero entero");
        number = Integer.parseInt(input.nextLine());
        
        multiplicacion = number * MULTIPLICADOR;
		division = number / DIVISOR;
		
		System.out.println("La operación de multiplicacion de " + number + " x " + MULTIPLICADOR + " es igual a: " + multiplicacion);
		System.out.println("La operación de division de " + number + " / " + DIVISOR + " es igual a: " + division);
    }
}
