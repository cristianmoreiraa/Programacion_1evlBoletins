
package boletin15;


public class Discos extends Multimedia{
        private String xenero;

    public Discos(){
        
    }

    public Discos(String xénero, String Titulo, String Autor, String Formato, String Duracion) {
        super(Titulo, Autor, Formato, Duracion);
        this.xenero = xénero;
    }

    public void setXénero(String xénero) {
        this.xenero = xénero;
    }

    public String getXénero() {
        return xenero;
    }

    @Override
    public String toString() {
        return super.toString()+ " xenero: "+xenero;
    }
    
    
    

    
    
    
        
       
    
}
