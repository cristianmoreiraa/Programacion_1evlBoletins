
package boletin12;

import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class Juego {
   int intentos = 0, numero = 0, i = 0, a = 0;
   
   public void jugar(){
        do{
        intentos = Integer.parseInt(JOptionPane.showInputDialog("Número de intentos para adivinar: "));
        numero = Integer.parseInt(JOptionPane.showInputDialog("Número que se debe adivinar: "));
    
        do{
        int adivinar = Integer.parseInt(JOptionPane.showInputDialog("Intenta adivinar, te quedan " + intentos + " intentos."));
        intentos = intentos - 1;
        if(adivinar > numero){
            JOptionPane.showMessageDialog(null,"El número era demasiado alto,intentalo de nuevo,te quedan " + intentos + " intentos.");
        }
        else if(adivinar < numero){
            JOptionPane.showMessageDialog(null,"El número era demasiado bajo,intentalo de nuevo,te quedan " + intentos + " intentos.");
        }
        else if(intentos == 0){
           JOptionPane.showMessageDialog(null,"Perdiste");
           a = 10;
        }
        else if(adivinar == numero){
           i = 10;
        }
       }while(i!=10);
        JOptionPane.showMessageDialog(null,"Bien hecho, acertaste");
        int again = JOptionPane.showConfirmDialog(null, "Jugar otra vez?");
        if(again == 0)
            a = 0;
        else{
            a = 10;    
         }
      }while(a != 10);
    }
}
