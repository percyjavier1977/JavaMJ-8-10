package com.mycompany.sistema_matematico;

import java.util.Scanner;

public class cajero_automativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 1000.0;
        System.out.println("===CAJERO AUTOMATICO===");
        System.out.println("1.Consultar saldo");
        System.out.println("2.Depositar dinero");
        System.out.println("3.Retirar dinero");
        System.out.println("4.Salir");
        System.out.println("Seleccione una opcion: ");
        int opcion = sc.nextInt();
        
        switch(opcion){
            case 1:
                System.out.printf("Su saldo actual es: %.2f Soles\n",saldo);
                break;
            case 2:
                System.out.println("Ingrese la cantidad a depositar: ");
                double deposito = sc.nextDouble();
                if (deposito > 0){
                    saldo += deposito;
                    System.out.printf("Deposito exitoso. Su saldo actual es %.2f Soles\n", saldo);
                }else{
                    System.out.println("Cantidad invalida para el deposito");
                }
                break;
            case 3:
                System.out.println("Ingrese la cantidad a retirar: ");
                double retiro = sc.nextDouble();
                if (retiro <= saldo && retiro > 0){
                    saldo -= retiro;
                    System.out.printf("Retiro exitoso. Su nuevo saldo es %.2f Soles\n", saldo);
                }else{
                    System.out.println("Saldo insuficiente o cantidad invalida");
                }
                break;
            case 4:
                System.out.println("Saliendo del sistema. ¡Gracias por usar el cajero automatico!");
                break;
            default:
                System.out.println("Opcion no valida");
        }
        sc.close();
    }
    
}
