
package bolextracondicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class Cifras {
    public void Cifras(){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entre '0' y '999999'\n para ver cuantas cifras tiene:"));
        
        if ((num>=0)&&(num<10)){
    JOptionPane.showMessageDialog(null, num + " tiene 1 cifra.");
    }
    
    else if ((num>=10)&&(num<100)){
    JOptionPane.showMessageDialog(null, num + " tiene 2 cifras.");
    }
    
    else if ((num>=100)&&(num<1000)){
    JOptionPane.showMessageDialog(null, num + " tiene 3 cifras.");
    }
    
    else if ((num>=1000)&&(num<10000)){
    JOptionPane.showMessageDialog(null, num + " tiene 4 cifras.");
    }
    
    else if ((num>=10000)&&(num<100000)){
    JOptionPane.showMessageDialog(null, num + " tiene 5 cifras.");
    }
    
    else if (num>=100000){
    JOptionPane.showMessageDialog(null, "ERROR\nEl número debe ser menor a 100000.");
    }
    
    else {
    JOptionPane.showMessageDialog(null, "ERROR\nEl número no debe ser negativo.");
    }
    
   }

}
    

