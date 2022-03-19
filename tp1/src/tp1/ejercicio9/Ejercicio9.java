package tp1.ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
	final static Scanner input = new Scanner(System.in);
	
    public static void main(String[] args) {
        final int SUMA_TOTAL_ANG = 180;
        
        int ang1, ang2, angulos, angRestante;
        
        System.out.println("Hola, por favor ingrese el valor en grados del primer angulo interno");
        ang1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Por favor ingrese el valor en grados del segundo angulo interno");
        ang2 = Integer.parseInt(input.nextLine());
        
        angulos = ang1 + ang2;
        angRestante = SUMA_TOTAL_ANG - angulos;
        
        System.out.println("El valor en grados del angulo interno restante es: " + angRestante);
    }
}
