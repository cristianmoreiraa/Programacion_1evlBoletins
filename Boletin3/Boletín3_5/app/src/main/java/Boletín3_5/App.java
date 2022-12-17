//calcular el sueldo bruto y líquido
package Boletín3_5;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        float km, sueldoFijo, dias, ventas, precio, dineroVentas;
        
        //sueldo Fijo
        System.out.print("Por favor introduzca su sueldo fijo: ");
        Scanner objFijo = new Scanner(System.in);
        sueldoFijo = objFijo.nextFloat();
        
        //cantidad de ventas
        System.out.print("Introduzca el número total vendido: ");
        Scanner objVentas = new Scanner(System.in);
        ventas = objVentas.nextFloat();
        
        //precio por venta
        
        System.out.print("¿A que precio vendes los artículos?: ");
        Scanner objPrecio = new Scanner(System.in);
        precio= objPrecio.nextFloat();
        
        //calculamos dinero generado por la ventas
        dineroVentas= ventas*precio;
        
        //cantidad total de km que hace
        System.out.print("Teclee la cantidad total de km que realiza: ");
        Scanner objKm = new Scanner(System.in);
        km= objKm.nextFloat();
        
        //Días totales para calcular las dietas
        
        System.out.print("Días totales de trabajo, con los que calcularemos las dietas: ");
        Scanner objDias = new Scanner(System.in);
        dias= objDias.nextFloat();
        
        //Calculamos el sueldo Bruto
        
        float sueldoBruto;
        
        sueldoBruto= (float) (sueldoFijo + dineroVentas*0.05 + km*2 + dias*30);
        System.out.print("El sueldo bruto total es: " +sueldoBruto+ "€");
        
        //Calculamos el suelo líquido
        
        float sueldoLiquido;
        sueldoLiquido= (float) (sueldoBruto - (36+(0.18*sueldoBruto)));
        System.out.print(" El sueldo líquido es = " +sueldoLiquido+ "€");
    
    }
}
