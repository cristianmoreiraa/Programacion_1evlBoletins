
package boletin_4;


public class LibroClass {
    
    //declaramos atributos 
    
    private String titulo, autor;
    private int ano;
    private short numPaginas;
    private float valoracion;
    
    //constructores ---->
    public LibroClass(){      //constructor por defecto
    
    }
    
    //constructor parametrizado
    public LibroClass(String ti, String aut, int an, short nPag){
    titulo= ti;
    autor= aut;
    ano= an;
    numPaginas= nPag;
  
    }
    
    //métodos de acceso ------> (getter y setters)
    
    public void setAutor(String aut){
    autor= aut;
    }
    
    public String getAutor(){
    return autor;    
        
    }
    
    public void setTitulo(String ti){
    titulo= ti;  
        
    }
    
    public String getTitulo(){
    return titulo;
        
    }
    
    public void setAno(int an){
    ano= an;
    }
    
    public int getAno(){
    return ano;
    }
    
    public void setnumPaginas(short nPag){
    numPaginas= nPag;
    }
    
    public short getnumPaginas(){
    return numPaginas;
    }
    
    public void amosar(){
    
        System.out.println("El nombre del libro es: " +titulo+ " , el autor es " +autor+ " , el año de publicación del libro fue en " +ano+ " , el número de páginas que contiene el libro es de " +numPaginas+ " y la valoración es de " +valoracion);
        
    
    
    
    }
    
    
}
