package tp1.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	final static Scanner input = new Scanner(System.in);
	
    public static void main(String[] args) {
    	String nombre;
        System.out.println("Hola! Por favor ingrese su nombre:");

        nombre = input.nextLine();
        
        System.out.println("Bienvenido " + nombre + " nos pone muy contento que estes aqui.");
    }
}
