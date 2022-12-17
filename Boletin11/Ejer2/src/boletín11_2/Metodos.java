
package boletín11_2;

import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class Metodos {
    public void sum(){
        int sum = 0, x = 10; double mult = 1; 
        
        do{
            x++;
            sum = sum + x;
            mult = mult * x;
        }while(x<90);
            JOptionPane.showMessageDialog(null, "La suma es: " +sum+ " La multiplicación es: " +mult);
    }
    
}
