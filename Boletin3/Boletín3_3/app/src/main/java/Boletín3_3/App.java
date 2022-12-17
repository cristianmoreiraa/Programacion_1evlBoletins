//Dándole la cantidad de billetes que tenemos nos calcule el dinero total

package Boletín3_3;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        float bill100, bill20, bill5, mon1; //declaramos todos los billetes y monedas con los que vamos a trabajar
        System.out.println("Por favor, introduzca la cantidad de billetes de 100€ que tenga: ");
        Scanner billete100 = new Scanner(System.in);
        bill100=billete100.nextFloat();
        
        System.out.println("A continuación introduzca la cantidad de billetes de 20€ que tenga: ");
        Scanner billete20 = new Scanner(System.in);
        bill20=billete20.nextFloat();
        
        System.out.println("Introduzca la cantida de billetes de 5€ que tenga: ");
        Scanner billete5 = new Scanner(System.in);
        bill5= billete5.nextFloat();
        
        System.out.println("Introduzca la cantidad de monedas de 1€ posea:");
        Scanner moneda1 = new Scanner(System.in);
        mon1= moneda1.nextFloat();
        
        
        //una vez que ya le pedimos todos los billetes y monedas, nos queda hacer la cuenta para convertirlo en el dinero total que tiene
        float total= (bill100*100 + bill20*20 + bill5*5 +mon1*1);
        System.out.println("La suma total del dinero es de:" +total+ "€");
        
        
         }
}
