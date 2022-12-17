
package boletín17;

import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class PruebasEscritas {
    private float mark1, mark2;
    
    public float askMarks(){
        mark1 = Float.parseFloat(JOptionPane.showInputDialog("Introduce la primera nota de P.Escrita: "));
        mark2 = Float.parseFloat(JOptionPane.showInputDialog("Introduce la segunda nota de P.Escrita: "));
       
        float markS = (float)(((mark1+mark2)/2)*0.4);
        return markS;    
    }
        
        
    
    
    
}
