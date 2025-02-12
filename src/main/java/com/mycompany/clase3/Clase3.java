
package com.mycompany.clase3;

import java.util.Scanner;

public class Clase3 {

    public static void main(String[] args) {
        //Crear un programa donde ingresemos un número y debe mostrar si es numero es par o impar
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero; ");
        numero = sc.nextInt();
        
        if (numero % 2 == 0){
            //Verdadera
            System.out.println("Es un numero Par");
        }else{
            //Falsa
            System.out.println("Es un numero Impar");
        }
        
        
    }    
}
