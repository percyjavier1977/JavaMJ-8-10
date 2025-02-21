
package com.mycompany.clase07;

import java.util.Scanner;


public class Ejemplo4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 1;
        while(opcion==1){
            System.out.println("Ingrese un numero: ");
            int num = sc.nextInt();
            int i = 1;
            System.out.println("====TABLA DEL " + num + ":" + "====");
            while(i<=12){
                int multi = i * num;
                System.out.println(num + " x " + i + " = " + multi);
                i++;
            }
            System.out.println("¿Desea continuar (Si = 1, No=0): ");
            opcion = sc.nextInt();
            
        }
        
    }
    
}
