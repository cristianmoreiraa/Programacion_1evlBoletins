
package boletín_6;

public class Coche {
    
    private int velocidade;
    
//Constructores:
    public Coche(){
        
        //es obvio
        velocidade = 0;
    }
    
    
    
//declaramos los atributos para luego hacer los métodos:
    
    
    
//métodos --->
    
   public int getVelocidade(){
       return velocidade;
   }
   
   
   public void acelerar (int acelera ){
       velocidade += Math.abs(acelera);
       
   }
  
   
   public void frenar (int frena){
       velocidade -= Math.abs(frena);
  
   }
    
}
