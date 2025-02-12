
package com.mycompany.clase3;

import java.util.Scanner;

public class Ventas {

    public static void main(String[] args) {
        // Crear un programa que calcule una venta. Debe tambien calcula dos descuentos:
        //descuento1 = si compro mas de 10 productos el 2% del importe
        //descuento2 = si  el importe supera los 300 soles el 3% del importe.
        
        double cantidad,precio,importe,tpagar,tdescuentos, des1=0.,des2=0.;
        String cliente,producto;
        Scanner es = new Scanner(System.in);
        System.out.println("Ingres el nombre del cliente: ");
        cliente = es.nextLine().toUpperCase();
        System.out.println("Ingrese el producto: ");
        producto = es.nextLine();
        
        System.out.println("Ingrese el precio del producto: ");
        precio = es.nextDouble();
        
        System.out.println("Ingrese la cantidad del producto: ");
        cantidad = es.nextDouble();
        //Formulas
        importe = cantidad * precio;
        
        //Descuento 1
        if (cantidad > 10){
            des1 = importe * 2/100;
        }
        
        //Descuento 2
        
        if (importe > 300){
            des2 = importe * 3/100;
        }
        
        tdescuentos = des1 + des2;
        tpagar  = importe - tdescuentos;
        
        //Mostrar los resultados
        System.out.println("\n====DETALLE DE LA VENTA======");
        System.out.println("Cliente: " + cliente);
        System.out.println("Producto: " + producto.toUpperCase()) ;
        System.out.printf("Precio unitario: %.2f soles\n",precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.printf("El importe es: %.2f soles\n",importe);
        System.out.printf("Descuento 1: %.2f soles\n",des1);
        System.out.printf("Descuento 2: %.2f soles\n",des2);
        System.out.printf("Total descuentos: %.2f soles\n",tdescuentos);
        System.out.printf("El total a pagar es: %.2f soles\n",tpagar);
        es.close(); //cerrar scanner
        
        
        
    }
    
}
