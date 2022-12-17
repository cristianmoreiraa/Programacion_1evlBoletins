//boletinExtra_1
package boletinextra_1;

import java.util.Scanner;

public class BoletinExtra_1 {

    public static void main(String[] args) {
        
        double precioSinIva,IVA, precioConIva ;
        
        //precio sin IVA
        System.out.print("Introduzca el precio del producto sin IVA: ");
        Scanner objSinIva = new Scanner(System.in);
        precioSinIva= objSinIva.nextDouble();
        
        //preguntamos IVA
        System.out.print("Introduza el IVA del producto: ");
        Scanner objIVA = new Scanner(System.in);
        IVA= objIVA.nextDouble();
        
        //IVA y precio con IVA
        precioConIva= (precioSinIva + ((precioSinIva*IVA)/100));
        System.out.print("El IVA es de " +IVA+ "%");
        System.out.println(" El precio total con IVA es de: " +precioConIva+ "€");
    }
    
}
