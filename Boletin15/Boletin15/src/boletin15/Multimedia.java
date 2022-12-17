
package boletin15;


public class Multimedia {
    private String Titulo;
    private String Autor;
    private String Formato;
    private String Duracion;
    
    //copntructor
public  Multimedia(){
    
}
    //constructor parametrizado
public Multimedia(String Titulo, String Autor, String Formato, String Duracion){
    this.Titulo = Titulo;
    this.Autor = Autor;
    this.Duracion = Duracion;
    this.Formato = Formato;
  

    
}
    //getters & setters
    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public String getFormato() {
        return Formato;
    }

    public String getDuracion() {
        return Duracion;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setFormato(String Formato) {
        this.Formato = Formato;
    }

    public void setDuracion(String Duracion) {
        this.Duracion = Duracion;
    }
    
        //toString

    @Override
    public String toString() {
        return "Titulo= " + Titulo + ", Autor= " + Autor + ", Formato= " + Formato + ", Duracion= " + Duracion;
    }
    
}
