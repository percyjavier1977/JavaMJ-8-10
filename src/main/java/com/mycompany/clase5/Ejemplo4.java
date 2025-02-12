
package com.mycompany.clase5;

import java.util.Scanner;

public class Ejemplo4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String mes;
        System.out.println("Ingrese el dia del mes (1-12): ");
        int dia = sc.nextInt();
        switch(dia){
            case 1 -> mes = "Enero";
            case 2 -> mes = "Febrero";
            case 3 -> mes = "Marzo";
            case 4 -> mes = "Abril";
            case 5 -> mes = "Mayo";
            case 6 -> mes = "Junio";
            case 7 -> mes = "Julio";
            case 8 -> mes = "Agosto";
            case 9 -> mes = "Setiembre";
            case 10 -> mes = "Octubre";
            case 11 -> mes = "Noviembre";
            case 12 -> mes = "Diciembre";
            default -> mes = "No existe";
        }
        System.out.println("Selecciono el mes: " + mes);
    }
    
}
