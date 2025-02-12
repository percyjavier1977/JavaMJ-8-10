
package com.mycompany.clase5;

import java.util.Scanner;

public class Clase5 {

    public static void main(String[] args) {
        /*
         IMC = peso (kg)/ estatura (m2)
        Los parámetros del índice de masa corporal (IMC) son: 
        Un IMC menor a 18.5 indica bajo peso
        Un IMC entre 18.5 y 24.9 indica peso saludable
        Un IMC entre 25.0 y 29.9 indica sobrepeso
        Un IMC de 30.0 o más indica obesidad
        */
        String  obs;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Fecha de consulta: ");
        String fecha = sc.nextLine();
        System.out.println("Nombre del paciente: ");
        String paciente = sc.nextLine();
        System.out.println("Edad del paciente: ");
        int edad = sc.nextInt();
        System.out.println("Peso del paciente (kg): ");
        double peso = sc.nextDouble();
        System.out.println("Estatura del Paciente (Metros): ");
        double estatura = sc.nextDouble();
       
        //Formula
        double imc = peso / Math.pow(estatura, 2);
        if (imc < 18.5){
            obs = "Clasificación: Bajo peso";
        }else if (imc >= 18.5 && imc <= 24.9){
            obs ="Clasificación:Peso saludable";
        }else if (imc >= 25 && imc <= 29.9){
            obs ="Clasificación: sobre peso";
        }else{
            obs ="Clasificación: obesidad";
        }
        
        //Mostrar los datos
        String mpeso = String.format("Peso del paciente-----------: %.2f",peso);
        String mestatura = String.format("Estatura del paciente---: %.2f",estatura);
        String mimc = String.format("IMC del paciente-------------: %.2f",imc);
        
        
        
        System.out.println("=======REPORTE DE LA CONSULTA=======");
        System.out.println("Fecha de la consulta------: " + fecha);
        System.out.println("Paciente------------------: " + paciente.toUpperCase());
        System.out.println("Edad del paciente---------: " + edad);
        System.out.println(mpeso);
        System.out.println(mestatura);
        System.out.println(mimc);
        System.out.println(obs);
        
        sc.close();
        
    
        
    }
}
