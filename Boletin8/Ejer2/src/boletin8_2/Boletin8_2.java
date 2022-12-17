
package boletin8_2;

import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class Boletin8_2 {

    
    public static void main(String[] args) {
           int opcion = Integer.parseInt(JOptionPane.showInputDialog("Elige una opción: \n1-- Cuadrado\n2--Triángulo\n3--Círculo"));
       Metodos obx = new Metodos();
       obx.Area(opcion);
    }
}
    
    

