package tp1.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
	final static Scanner input = new Scanner(System.in);
	
    public static void main(String[] args) {
        final int CANT_NOTAS = 3;
        double nota1, nota2, nota3, promedio;
        
        System.out.println("Hola, vamos a calcular el promedio de las 3 que deberas ingresar a continuación");
        
        System.out.println("Ingresar nota 1:");
        nota1 = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingresar nota 2:");
        nota2 = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingresar nota 3:");
        nota3 = Double.parseDouble(input.nextLine());
        
        promedio = (nota1 + nota2 + nota3) / CANT_NOTAS;
        
        System.out.println("El promedio anual de las 3 notas ingresadas es: " + promedio);
    }
}
