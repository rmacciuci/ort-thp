package tp1.ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
	final static Scanner input = new Scanner(System.in);
	
    public static void main(String[] args) {
        final double PRJE_VENTAS = 0.16;
        final int SUELDO_FIJO = 44000;
        int montoTotalVentas;
        double comisionVentas, sueldoTotal;
        
        System.out.println("Hola, por favor ingrese el monto total de ventas realizadas por un vendedor");
        montoTotalVentas = Integer.parseInt(input.nextLine());
        
        comisionVentas = montoTotalVentas * PRJE_VENTAS;
        sueldoTotal = SUELDO_FIJO + comisionVentas;
        
        System.out.println("El sueldo a cobrar es: $" + sueldoTotal);
    }
}
