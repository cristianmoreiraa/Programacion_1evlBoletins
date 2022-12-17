
package boletín17;

import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class Bols {
    
    private float markB;
                
        public float askBols(){
                float boletines = Float.parseFloat(JOptionPane.showInputDialog("Introduce la cantidad de los boletínes que tienes hechos:"));
                
                if (boletines>23.5){
                    markB= 2;}
                    else if(boletines>=16 && markB<=23.5){
                        markB=1;
                        }else {markB=0;}
            float globalBol = markB;
            return globalBol;
        
        
                
        }   
       }


