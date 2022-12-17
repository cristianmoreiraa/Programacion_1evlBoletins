
package boletín_6;

public class Boletín_6 {

    public static void main(String[] args) {
        
        Coche obxCoche1 = new Coche();
        
        obxCoche1.acelerar(120);
            System.out.println("La velocidad del coche es de: " + obxCoche1.getVelocidade() + "km/h");
        
        obxCoche1.frenar(50);
            System.out.println("Al salir de la autopista, reduce su velocidad hasta los " + obxCoche1.getVelocidade() + "km/h");
        
     
    }
    
}
