
package boletin11_4;

import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class Metodos {
    public void tablas(){
        
        int i = 0;
        do{
            int num = Integer.parseInt(JOptionPane.showInputDialog("¿De que número quieres calcular su tabla?\nMenos el número 0"));
            if(num!=0){
                JOptionPane.showMessageDialog(null,"1 x " + num + " = " + (num*1) +
                                  "\n2 x " + num + " = " + (num*2) +
                                  "\n3 x " + num + " = " + (num*3) +
                                  "\n4 x " + num + " = " + (num*4) +
                                  "\n5 x " + num + " = " + (num*5) +
                                  "\n6 x " + num + " = " + (num*6) +
                                  "\n7 x " + num + " = " + (num*7) +
                                  "\n8 x " + num + " = " + (num*8) +
                                  "\n9 x " + num + " = " + (num*9) +
                                  "\n10 x " + num +" = " + (num*10));
            }else{
                i=10;
                System.out.println("END");
            }
        }while(i!=10);
        
    }
    
}
