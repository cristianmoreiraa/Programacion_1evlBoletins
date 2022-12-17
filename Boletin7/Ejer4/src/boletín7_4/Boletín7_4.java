
package boletín7_4;

import javax.swing.JOptionPane;


public class Boletín7_4 {

    public static void main(String[] args) {
        String nombre1 = JOptionPane.showInputDialog("¿Cuál es el nombre de la primera persona? ");
        double peso1 = Double.parseDouble(JOptionPane.showInputDialog("¿Cual es el peso de " +nombre1+ " ?"));
        
        String nombre2 = JOptionPane.showInputDialog("¿Cuál es el nombre de la segunda persona? ");
        double peso2 = Double.parseDouble(JOptionPane.showInputDialog("¿Cual es el peso de " +nombre2+ " ?"));
        
        
        Pesos objPeso = new Pesos();
            objPeso.Pesos(nombre1, nombre2, peso1, peso2);
        
        
        
    }
    
}
