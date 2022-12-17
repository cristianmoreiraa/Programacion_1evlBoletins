//metiendole una cantidad entera de dinero que nos desglose la cantidad de billetes de 100, 20, 5 ,1
package Boletin3_4;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
    
        System.out.println("Introduzca la cantidad total de dinero que tenga: ");
        Scanner total = new Scanner(System.in);
        int dineroTotal= total.nextInt();
        
        
        int bill100, bill20, bill5, mon1;
        
        bill100= dineroTotal/100;
        bill20= ((dineroTotal-(bill100*100))/20);
        bill5=((dineroTotal- (bill100*100+bill20*20))/5);
        mon1=((dineroTotal- (bill100*100+bill20*20+bill5*5))/1);
               
  
        System.out.println("El dinero total es de " +dineroTotal+ "€ o lo que es lo mismo " +bill100+ " billetes de 100€, " +bill20+ " billetes de 20€," +bill5+ " billetes de 5€ y " +mon1+ " monedas de 1€");
        
        
        
 
 
    }
}
