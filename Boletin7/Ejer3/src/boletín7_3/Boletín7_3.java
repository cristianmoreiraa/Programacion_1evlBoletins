/* 
    Teclear un número e sacar por consola o signo "+" ou "-" e "0" se o número é 0

 */
package boletín7_3;

import javax.swing.JOptionPane;


public class Boletín7_3 {

    public static void main(String[] args) {
    
    int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        
        signo objSigno = new signo();
    
            objSigno.signo(num);
            
        
        
        
        
    }
    
}
