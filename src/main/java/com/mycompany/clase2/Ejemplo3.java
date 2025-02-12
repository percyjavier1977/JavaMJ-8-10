
package com.mycompany.clase2;

import java.util.Scanner;


public class Ejemplo3 {

    public static void main(String[] args) {
        //Crear un programa que me permita ingresar 3 notas y debe calcular el promedio, nota maxima, nota minima
        Scanner scanner = new Scanner(System.in);
        double nota1,nota2,nota3;
        //Pedir las notas al usuario
        System.out.println("Ingrese la nota 1: ");
        nota1 = scanner.nextDouble();
        
        System.out.println("Ingrese la nota 2: ");
        nota2 = scanner.nextDouble();
        
        System.out.println("Ingrese la nota 3: ");
        nota3 = scanner.nextDouble();
        
        //Calcular el promedio
        double promedio = (nota1+nota2+nota3)/3;
        double nota_min = Math.min(nota1,Math.min(nota2, nota3) );
        double nota_max = Math.max(nota1,Math.max(nota2, nota3) );
        
        System.out.println("Resultado:");
        System.out.printf("Promedio: %.2f\n ",promedio); //Muestra con dos decimales
        System.out.println("Promedio redondeado: " + Math.round(promedio));
        System.out.println("Nota mínima: " +nota_min);
        System.out.println("Nota máxima: " + nota_max);
        
        
        
        
        
    }
    
}
