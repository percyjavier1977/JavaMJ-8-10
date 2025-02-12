
package com.mycompany.clase3;

import java.util.Scanner;

public class ejemplo2 {
    public static void main(String[] args) {
        // Crear un programa donde ingresemos un numero. Debe mostrar si espositivo, negativo o cero
        int numero;
        Scanner dt = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        numero = dt.nextInt();
        if (numero<0){
            System.out.println("El numero es negativo");
        }else if (numero > 0){
            System.out.println("El numero es positivo");
        }else{
            System.out.println("El numero es cero");
        }
        dt.close();
        
    }
    
}
