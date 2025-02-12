
package com.mycompany.sistema_matematico;

import java.util.Scanner;

public class Sistema_matematico {
    public static void main(String[] args) {
        /*Crear un programa donde muestre 5 opciones para calcular el área de diferentes
        fihuras geometricas
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("===Menú de Áreas");
        System.out.println("1. Area del cuadrado");
        System.out.println("2. Area del rectangulo");
        System.out.println("3. Area del circulo");
        System.out.println("4. Area del triangulo");
        System.out.println("5. Salir");
        
        System.out.println("Selecciones una opción: ");
        int opcion = sc.nextInt();
        switch(opcion){
            case 1:
                System.out.println("Ingrese el lado del cuandrado: ");
                double lado = sc.nextDouble();
                System.out.println("El area del cuadrado es: " + (lado * lado)); 
                break; //Cierra el bloque
            case 2:
                System.out.println("Ingrese la base del rectangulo: ");
                double baserect = sc.nextDouble();
                System.out.println("Ingrese la altura del rectangulo: ");
                double alturarect = sc.nextDouble();
                System.out.println("El area del rectangulo es: " + (baserect * alturarect));
                break;
            case 3:
                System.out.println("Ingrese el radio del circulo: ");
                double radio = sc.nextDouble();
                double area_circulo = Math.PI * Math.pow(radio, 2);
                System.out.println("El area del circulo es: " + area_circulo);
                break;
            case 4:
                System.out.println("Ingrese la base del triangulo: ");
                double base_tri = sc.nextDouble();
                System.out.println("Ingrese la altura del triangulo: ");
                double altura_tri = sc.nextDouble();
                double area_tri = (base_tri * altura_tri) /2;
                System.out.println("El area del triangulo es: " + area_tri);
                break;
            case 5:
                System.out.println("Saliendo de la aplicación. ¡Gracias!");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
                           
        sc.close();
        
    }
}
