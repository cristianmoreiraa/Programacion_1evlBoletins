package boletin14;
import com.cristian.partes.Cpu;
import com.cristian.partes.Monitor;
import com.cristian.partes.Teclado;

public class Main {

    public static void main(String[] args) {
        
        
       Monitor objMo = new Monitor (14f);
     
       Ordenador objPc = new Ordenador (2050.5f, objMo, new Teclado ("Razer"), new Cpu (530));
       
        System.out.println(objPc.toString());

        System.out.println("Precio = "+objPc.getPrecio());
       
        System.out.println("Marca = "+objPc.getTe());
       
        System.out.println("Velocidad = "+objPc.getPro());
        
       
       
       
      
       
        
        
       
    }
    
}
