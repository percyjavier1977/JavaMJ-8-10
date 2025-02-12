
package com.mycompany.clase5;

import java.util.Scanner;

public class Ejemplo3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        String tipodia;
        String dl = "Dia labotal", fs = "Fin de semana";
        System.out.println("Ingrese el dia de la semana (1-7): ");
        int dia = sc.nextInt();
        switch(dia){
            case 1,2,3,4,5 -> System.out.println("El tipo de dia es: " + dl);
            case 6,7 -> System.out.println("El tipo de dia es: " + fs);
            default -> System.out.println("Dia invalido");
                
        }
        sc.close();
    }
    
}
