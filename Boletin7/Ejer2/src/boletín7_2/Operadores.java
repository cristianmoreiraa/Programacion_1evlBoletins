package boletín7_2;

public class Operadores {

    private short num1,num2;

    
//constructores
    
    public Operadores(){   //constructor por defecto

    }
     
    public Operadores(short numero1, short numero2){
//constructor parametrizado
        
        num1= numero1;
        num2= numero2;
    
    }

//getter y setters
   
    public void setNumero1(short numero1){
       num1= numero1 ;
    
    }
    public short getNumero1(){
        return num1;
    }
    
    public void setNumero2(short numero2){
        num2= numero2;
    }
    
    public short getNumero2(){
        return num2;
    }
    
//métodos 
    public void Operaciones(){
        
    //la suma la enseña siempre 
        short suma = (short) (num1+num2);
            System.out.println("La suma es = " + suma);
                
        
        if (num1>=num2){ 
            short resta = (short)(num1-num2);
            System.out.println("La resta es = " +resta);}
    }
    
    



    
    
    

    

}
