//pasar de grados Celsius a Fahrenheit y Kelvin
package Boletín3_2;

import java.util.Scanner;

public class App {
   public static void main(String[] args){
   
   float celsius;
   Scanner doxCelsius =new Scanner(System.in);
   System.out.print("Introduce los Celsius que deseas convertir en grados Fahrenheit y grados Kelvin: ");
           celsius= doxCelsius.nextFloat();
           
   double  fahrenheit= (celsius * 9 / 5)+32 , kelvin= celsius + 273.15;
   System.out.println("Tenemos " +celsius+ " grados Celsius lo que es lo mismo; " +fahrenheit+ " grados Fahrenheit o también " +kelvin+ " grados kelvin");

      }
}
