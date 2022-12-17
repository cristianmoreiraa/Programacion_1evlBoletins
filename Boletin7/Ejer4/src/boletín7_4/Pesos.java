//Coñecidos o nome e o peso de dúas persoas, queremos escribir os datos da que pesa máis e, a diferenza de peso entre elas .
//pedir nombre y peso
//coger la que mas pese y hacer -
package boletín7_4;


public class Pesos {
    
    public void Pesos(String nom1, String nom2, double pes1, double pes2){
        
        if (pes1>pes2){ System.out.println(nom1+ " tiene una diferencia de peso de " +(pes1-pes2)+ " kg respecto a " +nom2);}
            else if (pes2>pes1){System.out.println(nom2 + " tiene una diferencia de " +(pes2-pes1)+ " kg respecto a " +nom1);}
               else {System.out.println("El peso de " +nom1+ " y " +nom2+ " es el mismo");}
            
    
    }
    
    
    
    
    
}
