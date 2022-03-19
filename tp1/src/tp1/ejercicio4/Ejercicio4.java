package tp1.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	final static Scanner input = new Scanner(System.in);
	
    public static void main(String[] args) {
    	double valorHora, salarioSemanal;
    	int horasTrabajadas, horasSemanales;
    	
        System.out.println("Hola, por favor ingresa el valor de una hora de trabajo:");
        valorHora = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingresa la cantidad de horas trabajadas por dia: ");
        horasTrabajadas = Integer.parseInt(input.nextLine());
        
        horasSemanales = (horasTrabajadas * 5) + (horasTrabajadas / 2);
        salarioSemanal = valorHora * horasSemanales;
        
        System.out.println("El total a cobrar por un total de: " + horasSemanales + " hs. es de $" + salarioSemanal);
    }
}
