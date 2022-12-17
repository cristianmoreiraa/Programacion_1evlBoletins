//suma, restar, multiplicas y dividir 2 números
package boletin2_4;

import java.util.Scanner;


public class Boletin2_4 {


    public static void main(String[] args) {
        
        float numA, numB, suma, resta, multiplicación, división;
        Scanner doxCalculadora = new Scanner(System.in);
        System.out.println("Intrododuce los numeros que quieras sumar, restar multiplicar y dividir; deben de tener valores mayores de 0");
        System.out.println("Inserta el número A");
        numA= doxCalculadora.nextFloat();
        System.out.println("Inserta el número B");
        numB= doxCalculadora.nextFloat();
        System.out.println("Primera operación, sumamos el número A y el número B ");
        suma= numA+numB;
        System.out.println("La suma nos da como resultado " +suma+ " pasemos con la siguiente operación");
        System.out.println("Restamos numA-numB");
        resta= numA-numB;
        System.out.println("El resultado de de la resta es de " +resta);
        System.out.println("Multiplicaremos " +numA+ " x" +numB);
        multiplicación= numA*numB;
        System.out.println("El resultado de esta es de " +multiplicación);
        System.out.println("y por último, realizaremos la división de " +numA+ "/" +numB );
        división= numA/numB;
        System.out.println("El resultado de esta última operación és " +división );
        System.out.println("\n MUCHAS GRACIAS POR USAR ESTA HERRAMIENTA ESPERO QUE TE HAYA SIDO ÚTIL");
        
        
                
        
    }
    
}
