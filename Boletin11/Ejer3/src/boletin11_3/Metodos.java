
package boletin11_3;

import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class Metodos {
    
    
    public void Area(){
        int altura, base;
        
        do{
            base = Integer.parseInt(JOptionPane.showMessageDialog(null, "¿Base del rectángulo?"));
            altura = Integer.parseInt(JOptionPane.showMessageDialog(null, "¿Altura del rectángulo?"));
        }while (base < 0 || altura < 0);
            int b = base;
            int a = altura;
            int area = b * a;
            
            System.out.println("El area es: "+area);
    }
    
}
