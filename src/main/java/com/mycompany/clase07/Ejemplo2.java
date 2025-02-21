
package com.mycompany.clase07;

import java.util.Random;
import java.util.Scanner;

public class Ejemplo2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numero_aleatorio = random.nextInt(10)+1;
        int intentos = 3;
        boolean adivinado = false;
        System.out.println("JUEGO DEL NÚMERO DE LA SUERTE");
        System.out.println("Tiene 3 intentos...Suerte en el juego");
        for (int i=1; i<=intentos; i++){
            System.out.println("Intento N°: " + i + ":");
            System.out.println("Ingres un número: ");
            int numero_ingresado = sc.nextInt();
            if (numero_ingresado == numero_aleatorio){
                System.out.println("Felicidades adivinaste el número..GANASTE");
                adivinado = true;
                break; //Cierra el bucle
            }else if(numero_ingresado > numero_aleatorio){
                System.out.println("El numero de la suerte es menor");
            }else{
                System.out.println("El numero de la suerte es mayor");
            }
            if (i<3){
                System.out.println("Sigue intentando");
            }
        }
        if (adivinado == false){
            System.out.println("Lo siento has agotado tus tres opciones");
            System.out.println("El numero de la suerte es: " + numero_aleatorio);
        }
        sc.close();
    }
    
}
