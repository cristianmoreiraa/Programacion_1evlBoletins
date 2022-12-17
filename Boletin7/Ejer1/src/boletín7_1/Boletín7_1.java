//teclea un número y en el caso de que sea positivo, que salte un mensaje enseñando el número y diciendo que es positivo

package boletín7_1;

import javax.swing.JOptionPane;

public class Boletín7_1 {

    public static void main(String[] args) {
        
        Números objNum = new Números();
        String res = JOptionPane.showInputDialog(" Teclea el número");
            int numero = Integer.parseInt(res);
            
       objNum.pedirNumero(numero);
        
    }
    
}
