package tp1.ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
	final static Scanner input = new Scanner(System.in);
	
    public static void main(String[] args) {
        int num1, num2, suma, resta, multiplicacion;
        double division;
        
        System.out.println("Ingrese un numero natural");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese el segundo numero natural");
        num2 = Integer.parseInt(input.nextLine());
        
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = (double) num1 / num2;
        
        System.out.println("La suma es igual a: " + suma);
        System.out.println("La resta es igual a: " + resta);
        System.out.println("La multiplicacion es igual a: " + multiplicacion);
        System.out.println("La division es igual a: " + division);
    }
}
