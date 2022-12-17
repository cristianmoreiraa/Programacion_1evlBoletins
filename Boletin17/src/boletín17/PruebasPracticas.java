
package boletín17;

import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class PruebasPracticas {
    
    
    public float askMarksp(){
      float markp1 = Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota de la Prueba Practica: "));
      float markP = (float)(markp1*0.4);  
      return markP;
    }    
 
        
            
        
    
}
