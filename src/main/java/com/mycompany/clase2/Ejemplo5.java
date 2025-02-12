package com.mycompany.clase2;


import java.util.Scanner;


public class Ejemplo5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Calcular el area del circulo
        
        System.out.println("Ingrese el radio del circulo: ");
        Double radio = sc.nextDouble();
        
        double area = Math.PI * Math.pow(radio, 2); //pi*radio^2
        
        System.out.println("El area del circulo con radio " + radio +" es: " + String.format("%.2f",area));
        
        
        
    }
    
}
