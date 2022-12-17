
package boletin13;

import javax.swing.JOptionPane;
import org.danielcastelao.cristian.Personal.Personal;

/**
 *
 * @author crist
 */
public class Boletin13 {

    public static void main(String[] args) {
        Personal al = new Personal("698156948","fererico@gmail.com");
        Academica obj = new Academica("Federico",8,al);
            JOptionPane.showMessageDialog(null, obj.toString());
    }
    
}
