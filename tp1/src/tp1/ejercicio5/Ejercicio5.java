package tp1.ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	final static Scanner input = new Scanner(System.in);
	
    public static void main(String[] args) {
        int num1, num2, temp;
        
        System.out.println("Hola por favor ingrese un numero entero:");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ahora ingrese otro numero entero:");
        num2 = Integer.parseInt(input.nextLine());
        
        System.out.println("Numero 1: " + num1 + " Numero 2: " + num2);
        
        temp = num1;
        num1 = num2;
        num2 = temp;
        
        System.out.println("Invertidos, Numero 1: " + num1 + " Numero 2: " + num2);
    }
}
