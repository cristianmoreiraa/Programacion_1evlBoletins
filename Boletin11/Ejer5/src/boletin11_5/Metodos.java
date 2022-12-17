
package boletin11_5;

import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class Metodos {
    
    public void salarios(){
        int cs = 0, cm = 0, c = 0, s;
        
        do{
            s = Integer.parseInt(JOptionPane.showInputDialog("¿De cuánto es el salario?"));
        if(s<0)
            JOptionPane.showMessageDialog(null, "ERROR");
        else if(s < 1750 && s > 1000){
            cs++;
        }else if(s < 1000 && s > 0){
            cm++;
        }c++;
        JOptionPane.showMessageDialog(null, "Salario 1750-1000 "+cs+ "\nPorcentaje de salarios de menos de 1000: " +(cm*100/c));
    }while(s!=0);
    
    }
}
