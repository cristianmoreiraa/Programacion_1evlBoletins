
package boletin7_5;

/**
 *
 * @author crist
 */
public class Metodos {
    
   int mayor1;
    int mayor2;
        public int compararMayor(int num1, int num2,int num3){
            if(num1 > num2 && num1 > num3){
                return num1; 
            }
            else if(num2 > num1 && num2 > num3){
                return num2;
            }
            else if(num3 > num1 && num3 > num2){
                return num3;
            }
            else{
                return num1;
            }
        }
    
}
