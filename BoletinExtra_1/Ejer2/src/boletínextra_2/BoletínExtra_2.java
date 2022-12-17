//BoletínExtra_2
package boletínextra_2;

import java.util.Scanner;


public class BoletínExtra_2 {

  
    public static void main(String[] args) {
        
        double a, b, c, x, Y;
        Scanner objPolinomio = new Scanner(System.in);
        
        //pedimos los valores de A, B, C
        System.out.print("Introduza el valor de A: ");
        a= objPolinomio.nextDouble();
        
        System.out.print("Introduzca el valor de B: ");
        b= objPolinomio.nextDouble();
        
        System.out.print("Introduza el valor de C: ");
        c= objPolinomio.nextDouble();
        
        System.out.print("Introduzca el valor de X: ");
        x= objPolinomio.nextDouble();
        
        //realizamos la operación
        
        Y= a*Math.pow(x, 2) + b*x +c;
        System.out.println("El valor de Y es de: " +Y);
    }
    
}
