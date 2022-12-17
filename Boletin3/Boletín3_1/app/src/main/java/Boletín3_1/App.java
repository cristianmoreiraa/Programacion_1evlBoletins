//programa para calcular el descuento que nos hicieron
package Boletín3_1;

import java.util.Scanner;

public class App {
     
        public static void main(String[] args) {
        Scanner doxPrecio = new Scanner(System.in);
        float precio;
        System.out.println("Por favor introduzca el precio pagado: ");
        precio= doxPrecio.nextFloat();
        
        
        Scanner doxTarifa= new Scanner(System.in);
        float tarifa;
        System.out.println("A continuación introduce el precio original del producto: ");
        tarifa= doxTarifa.nextFloat();
        
        Scanner doxDescuento = new Scanner(System.in);
        float descuento= (100-(precio*100)/tarifa);
        System.out.println("el descuento realizado es del:  " +descuento+  "%");
                
        
 
    }
}

