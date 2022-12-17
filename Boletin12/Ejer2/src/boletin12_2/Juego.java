
package boletin12_2;

import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class Juego {
    int intentos = 0, numAdiv = 0, i = 0, a = 0, p = 0, jugadores;
    
        public void game(){
            do {
                  if (p == 0) {
                        jugadores = JOptionPane.showConfirmDialog(null, "La partida será para 2 jugadores?");
                  }
                  if (jugadores == 0) {
                        intentos = Integer.parseInt(JOptionPane.showInputDialog("Número de intentos para adivinar: "));
                      int numAdiv;
                        do {
                              numAdiv = Integer.parseInt(JOptionPane.showInputDialog("Número que se debe adivinar: (Debe ser inferior a 50 y superior a 1)"));
                        } while (numAdiv > 50 || numAdiv < 1);
                  } else {
                        intentos = Integer.parseInt(JOptionPane.showInputDialog("Número de intentos para adivinar: "));
                        numAdiv = (int) (Math.random() * 50 + 1);
                  }
                  do {
                        int tryAdivinar = Integer.parseInt(JOptionPane.showInputDialog("Intenta adivinar, te quedan " + intentos + " intentos."));
                        intentos = intentos - 1;
                        if (Math.abs(numAdiv - tryAdivinar) > 20) {
                              JOptionPane.showMessageDialog(null, "Muy lejos.");
                        } else if (Math.abs(numAdiv - tryAdivinar) > 10) {
                              JOptionPane.showMessageDialog(null, "Lejos.");
                        } else if (Math.abs(numAdiv - tryAdivinar) > 5) {
                              JOptionPane.showMessageDialog(null, "Cerca.");
                        } else if (Math.abs(numAdiv - tryAdivinar) >= 1) {
                              JOptionPane.showMessageDialog(null, "Muy cerca.");
                        } else if (tryAdivinar == numAdiv) {
                              JOptionPane.showMessageDialog(null, "Bien hecho, acertaste");
                              i = 10;
                        }
                        if (intentos <= 0) {
                              JOptionPane.showMessageDialog(null, "Perdiste");
                              break;
                        }
                  } while (i != 10);
                  int again = JOptionPane.showConfirmDialog(null, "Jugar otra vez?");
                  if (again == 0) {
                        a = 0;
                        p = 1;
                  } else {
                        a = 10;
                  }
            } while (a != 10);
      }
            
        }
    

