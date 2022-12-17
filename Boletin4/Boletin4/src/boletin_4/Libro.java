
package boletin_4;


public class Libro{
    
    

   
    public static void main(String[] args) {
        
        //creamos un objeto libro
        
    LibroClass objLib1 = new LibroClass ("La Fundación", "Antonio Buero Vallejo",1955, (short)230);
    objLib1.amosar();
    
    LibroClass objLib2 = new LibroClass();
    objLib2.setTitulo("El misterio de los áribtros dormidos");
    objLib2.setAutor("Roberto Santiago");
    objLib2.setAno(2018);
    objLib2.setnumPaginas((short)290);
    objLib2.amosar();

    
        
        
        
        
      
    }
    
}

