
package com.mycompany.clase2;

import java.text.DecimalFormat;

public class Ejemplo1 {

    public static void main(String[] args) {
        double numero = 12.646457;
        double numero_redondeado = Math.round(numero);
        System.out.println("Redondeo a entero: " + numero_redondeado);
        
        double numero_redondeado2 = Math.round(numero*1000.0)/1000.0;
        System.out.println("Número redondeado a tres decimales: " + numero_redondeado2);
        
        DecimalFormat formato = new DecimalFormat("#.000");
        
        String numero_redondeado3 = formato.format(numero);
        System.out.println("Numero redondeado a tres decimales: " + numero_redondeado3);
        
        
    }
    
}
