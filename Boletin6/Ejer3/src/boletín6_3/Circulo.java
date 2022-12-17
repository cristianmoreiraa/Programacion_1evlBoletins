
package boletín6_3;


public class Circulo {
    
    
    private double radio;
    public static double pi = 3.14;
    
    
    
//constructores:
    
    public Circulo (double radio){
        this.radio = radio;
    
    
    }
    
   public Circulo(){
   
   } 

   
   
   
//getter y setter:
   
   public double getRadio(){
       return this.radio;
       
   }
    
   public void setRadio(double radio){
       this.radio = radio;
       
   }
   
   //no se necesita el getPi
   public double getPi(){
       return this.pi;
       
   }
   
   //métodos:
   
   public double calcularArea(){
       //area del circulo = pi * r²
    
    return this.pi * Math.pow(this.radio,2);
    
   }
   
   public double calcularDiametro(){
       //diametro de la circunferencia = 2 * Pi * r
       
   return 2* this.pi * this.radio;
   
   
   //metodos
   
   /* 
   public double calcularArea(){
   
        double area= Pi * Math.pow(radio     2    );
   return area;
            
   
   }
   
   public double calcularLongitud(){
        double longitud = 2 * Pi * radio;
   return longitud;
   
   
   
   }
   
   */
   }
   
}
