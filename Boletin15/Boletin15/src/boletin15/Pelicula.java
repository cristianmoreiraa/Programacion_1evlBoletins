
package boletin15;


public class Pelicula extends Multimedia {
    private String actorprincipal;
    private String actrizprincipal;
    
        //constructor
    
    public Pelicula() {
    }
        //constructor parametrizado

    public Pelicula(String actorprincipal, String actrizprincipal, String Titulo, String Autor, String Formato, String Duracion) {
        super(Titulo, Autor, Formato, Duracion);
        this.actorprincipal = actorprincipal;
        this.actrizprincipal = actrizprincipal;
    }

        //setter & getters 

    public void setActorprincipal(String actorprincipal) {
        this.actorprincipal = actorprincipal;
    }

    public void setActrizprincipal(String actrizprincipal) {
        this.actrizprincipal = actrizprincipal;
    }

    public String getActorprincipal() {
        return actorprincipal;
    }

    public String getActrizprincipal() {
        return actrizprincipal;
    }
    
    
        //ToString

    @Override
    public String toString() {
        return super.toString() + " actorprincipal= " + actorprincipal + " , actrizprincipal= " + actrizprincipal;
    }

    
    
    
    

    
    
    
}
