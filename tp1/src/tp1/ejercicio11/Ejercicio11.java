package tp1.ejercicio11;

import java.util.Scanner;

/* Realizá un programa que permita ingresar un número entero e indique si se trata de un número par o impar. [EC] */

public class Ejercicio11 {
	final static Scanner input = new Scanner(System.in);
	
    public static void main(String[] args) {
    	int num1;
    	
    	System.out.println("Por favor ingrese un numero entero");
    	num1 = Integer.parseInt(input.nextLine());
    	
    	// Cerramos input
    	input.close();
    	
    	// Forma 1
    	Boolean esPar = num1 % 2 == 0;
    	System.out.println("Es " + (esPar ? "par" : "inpar"));
    	
    	// Forma 2
    	if(num1 % 2 == 0) { // Modulo de num1
    		System.out.println("Es par");
    	} else {
    		System.out.println("Es inpar");
    	}
    }
}
