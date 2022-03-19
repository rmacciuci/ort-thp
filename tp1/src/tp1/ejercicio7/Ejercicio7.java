package tp1.ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
	final static Scanner input = new Scanner(System.in);
	
    public static void main(String[] args) {
        double ancho, largo, valorMetroCuadrado, metrosCuadradosTotal;
        
        System.out.println("Por favor ingrese el ancho del terreno a calcular");
        ancho = Double.parseDouble(input.nextLine());
        
        System.out.println("Ahora, ingrese el largo");
        largo = Double.parseDouble(input.nextLine());
        
        System.out.println("Ahora, el valor por metro cuadrado");
        valorMetroCuadrado = Double.parseDouble(input.nextLine());
        
        metrosCuadradosTotal = ancho * largo;
        double valorTotal = valorMetroCuadrado * metrosCuadradosTotal;
        double metrosAlambres = ((ancho * 2) + (largo * 2));
        
        System.out.println("El valor total del terreno es de $" + valorTotal);
        System.out.println("La cantidad de metros de alambre a utilizar son: " + metrosAlambres);
        System.out.println("Puede comprar rollos de 1, 2 o 3 metros de alto, pero siempre con el mismo largo");
    }
}
