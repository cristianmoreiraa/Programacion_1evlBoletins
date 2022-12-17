
package boletín17;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;



/**
 *
 * @author crist
 */
public class Boletín17 {
    
        private static final DecimalFormat DF = new DecimalFormat("0.00");
    public static void main(String[] args) {
          
          DF.setRoundingMode(RoundingMode.UP);
          
          PruebasEscritas obj1 = new PruebasEscritas();
           float NotaPE = obj1.askMarks();
          PruebasPracticas obj2 = new PruebasPracticas();
           float NotaPC = obj2.askMarksp();
          Bols obj3 = new Bols();
           float NotaB = obj3.askBols();
           
           float notaTotal = NotaPE+NotaPC+NotaB;
           
           JOptionPane.showMessageDialog(null, "PRUEBAS ESCRITAS......."+DF.format(NotaPE)+"\nPRUEBAS PRACTICAS......."+DF.format(NotaPC)+"\nNOTA BOLETINES......"+DF.format(NotaB)+"\nNOTA TOTAL......"+DF.format(notaTotal));
    
    }
    
}
