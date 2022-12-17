
package boletin11_;

import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class Cals {
    int cero = 0, neg = 0, pos = 0;
    
    
    public void calculos(){
        int i = 0;
        do{
            i++;
            int x = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número: "));
            
            if(x==0)
                cero++;
            else if(x<0)
                neg++;
            else 
                pos++;
        }while(i<10);
            JOptionPane.showMessageDialog(null, "Número de ceros: "+cero+"\nNúmero de negativos: "+neg+"\nNúmero de positivos: " +pos);
    }
    
}


