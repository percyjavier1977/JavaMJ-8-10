
package com.mycompany.clase5;

import java.util.Scanner;

public class Ejemplo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String tipodia;
        System.out.println("Ingrese el dia de la semana (1-7): ");
        int dia = sc.nextInt();
        switch(dia){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                tipodia = "Dia laboral";
                break;
            case 6:
            case 7:
                tipodia = "Fin de semana";
                break;
            default:
                tipodia = "Dia no existe";
        }
        
        System.out.println("El tipo de dia es: " + tipodia);
        sc.close();
    }
    
}
