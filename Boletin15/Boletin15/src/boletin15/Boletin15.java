
package boletin15;


public class Boletin15 {

    
    public static void main(String[] args) {
       Pelicula obx1 = new Pelicula("Cristian", "Maria", "Perdidos en programacion","Galileo","mp4","1hora");
       Discos obx2 = new Discos("Comedia", "Programacion", "Nina", "mp4","1.26" );
       
        System.out.println((obx1.toString()) +"\n"+  (obx2.toString()));
       
    }
    
}
