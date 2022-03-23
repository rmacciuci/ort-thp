package tp1.ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {
	final static Scanner input = new Scanner(System.in);
	
    public static void main(String[] args) {
        final int EDAD_MINIMA = 6;
        final double ESTATURA_MIN = 1.50;
        
        int edad;
        String nombre;
        double estatura;
        
        System.out.println("Hola! bienvenido a la montaña rusa Miedo en las alturas");
        
        System.out.println("Para comenzar escribí tu nombre:");
        nombre = input.nextLine();
        
        System.out.println("ingresá tu edad:");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.println("ingresá tu altura en metros:");
        estatura = Double.parseDouble(input.nextLine());

        // Cerramos input
        input.close();
        
        if(edad > EDAD_MINIMA || estatura > ESTATURA_MIN) {
        	System.out.println(nombre + " podes ingresar.");
        } else {
        	System.out.println(nombre + " no podes ingresar.");
        }
    }
}
