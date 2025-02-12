
package com.mycompany.sistema_matematico;

public class operadores_logicos {

    public static void main(String[] args) {
        /*
        ==OPERADOR LOGICO Y(&&)
        v v - v
        v f - f
        f v - f
        f f - f
        */
        
        System.out.println(10>5 && 20+10 == 30 && 50 < 60);
        System.out.println(10>5 && 20+10 == 30 && 50 > 60);
        
         /*
        ==OPERADOR LOGICO O(||)
        v v - v
        v f - v
        f v - v
        f f - f
        */
         
         System.out.println(20>10 || 50*2==100 || 25 < 30);
         System.out.println(20>10 || 50*2==90 || 25 > 30);
         System.out.println(20<10 || 50*2==90 || 25 > 30);
    }
    
}
