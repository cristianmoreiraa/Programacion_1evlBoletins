
package boletínextra_3;

import java.util.Scanner;


public class BoletínExtra_3 {

   
    public static void main(String[] args) {
        
        double a, b ,c, x1, x2;
        Scanner segundoGrado = new Scanner(System.in);
        
        //pedimos los valores de A, B, C
        System.out.print("Introduce el valor de A: ");
        a= segundoGrado.nextDouble();
        
        System.out.print("Introduce el valor de B: ");
        b= segundoGrado.nextDouble();
        
        System.out.print("Introduce el valor de C: ");
        c= segundoGrado.nextDouble();
        
        //para hacer una raíz utilizamos el Math.sqrt; realizamos las operaciones
        x1= ((-b + Math.sqrt(Math.pow(b, 2) - 4*a*c))/2*a);
        x2= ((-b - Math.sqrt(Math.pow(b, 2) - 4*a*c))/2*a);
        
        System.out.print("El resultado de la ecuación de segundo grado para los valores: " +a+ " , " +b+ " y " +c+ " es de x¹= " +x1+ " y x²= " +x2);
                
        
               
       
        
      
      
    }
    
}
