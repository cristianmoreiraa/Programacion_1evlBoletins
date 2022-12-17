//proxecto para calcular el cambio de € a $

package boletin2_3;

import java.util.Scanner;

public class Boletin2_3 {
    public static void main(String[] args) {
        
       
        
        float  dolar, euros, dinero ; //variables locais
           Scanner doxConversor =new Scanner(System.in);
               System.out.println("Introduce la cantidad de € que quieres pasar a $: ");
               euros= doxConversor.nextFloat();
               System.out.println("Introduce el valor actual del $,\n(!Recuerda que debes de usar la ,!)");
               dolar= doxConversor.nextFloat();
               dinero= euros*dolar;
                System.out.println("La cantidad de " +euros+ " euros, es igual a dolares " +dinero);
        }
    
}
