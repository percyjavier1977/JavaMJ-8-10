
package com.mycompany.clase3;

import java.util.Scanner;

public class CasaDeCambio {

    public static void main(String[] args) {
        // Crear un programa para una casa de cambio.
        Scanner rc = new Scanner(System.in);
        double tasaDolar = 3.80;
        double tasaEuro = 4.10;
        System.out.println("Ingrese una cantidad en soles: ");
        double soles = rc.nextDouble();
        
        System.out.println("\n===Opciomne de conversion====");
        System.out.println("1. Convertir a dolares");
        System.out.println("2. Convertir a euros");
        System.out.println("3. Convertir a dolares y euros");
        System.out.println("4. Salir");
        System.out.println("Seleccione una opcion: ");
        int opcion = rc.nextInt();
        
        if (opcion == 1){
            double dolares = soles / tasaDolar;
            System.out.printf("La cantidad en dolares es: %.2f USD\n",dolares);
        }else if (opcion == 2){
            double euros = soles / tasaEuro;
            System.out.printf("La cantidad en euros es: %.2f EUR\n",euros);
        }else if (opcion == 3){
            double dolares = soles / tasaDolar;
             double euros = soles / tasaEuro;
             System.out.printf("La cantidad en dolares es: %.2f USD\n",dolares);
             System.out.printf("La cantidad en euros es: %.2f EUR\n",euros);
             
        }else if (opcion == 4){
            System.out.println("Saliendo del programa- ¡GRACIAS!");
        }else{
            System.out.println("opcion no existe....");
        }
        rc.close();
            
        
        
    }
    
}
