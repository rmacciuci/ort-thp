package tp1.ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
	final static Scanner input = new Scanner(System.in);
	
    public static void main(String[] args) {
        double valorTotalAportado, aporteSocio1, aporteSocio2, aporteSocio3, aportePjeSocio1, aportePjeSocio2, aportePjeSocio3;
        String socio1, socio2, socio3;
        
        // Solicitamos datos del socio1
        System.out.println("Por favor ingrese el nombre del socio 1:");
        socio1 = input.nextLine();
        System.out.println("Ingrese el capital aportado por " + socio1 + "(socio 1):");
        aporteSocio1 = Double.parseDouble(input.nextLine());
        
        // Solicitamos datos del socio2
        System.out.println("Por favor ingrese el nombre del socio 2:");
        socio2 = input.nextLine();
        System.out.println("Ingrese el capital aportado por " + socio2 + "(socio 2):");
        aporteSocio2 = Double.parseDouble(input.nextLine());
        
        // Solicitamos datos del socio3
        System.out.println("Por favor ingrese el nombre del socio 3:");
        socio3 = input.nextLine();
        System.out.println("Ingrese el capital aportado por " + socio3 + "(socio 3):");
        aporteSocio3 = Double.parseDouble(input.nextLine());  
        
        valorTotalAportado = aporteSocio1 + aporteSocio2 + aporteSocio3;
        aportePjeSocio1 = ((aporteSocio1 / valorTotalAportado) * 100);
        aportePjeSocio2 = ((aporteSocio2 / valorTotalAportado) * 100);
        aportePjeSocio3 = ((aporteSocio3 / valorTotalAportado) * 100);
       
        System.out.printf("El valor total aportado es: $ %.2f\n", valorTotalAportado);
        System.out.printf("El socio %s aportó $ %.2f (%.4f %%) \n", socio1, aporteSocio1, aportePjeSocio1);
        System.out.printf("El socio %s aportó $ %.2f (%.4f %%) \n", socio2, aporteSocio2, aportePjeSocio2);
        System.out.printf("El socio %s aportó $ %.2f (%.4f %%) \n", socio3, aporteSocio3, aportePjeSocio3);
    }
}