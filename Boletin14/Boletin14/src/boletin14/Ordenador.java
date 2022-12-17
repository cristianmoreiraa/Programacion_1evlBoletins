package boletin14;
import com.cristian.partes.Cpu;
import com.cristian.partes.Monitor;
import com.cristian.partes.Teclado;


public class Ordenador {
    
    
    private float precio;
    private Monitor mo;
    private Teclado te;
    private Cpu pro;
   

    public Ordenador(float precio, Monitor mo, Teclado te, Cpu pro) {
        this.precio = precio;
        this.mo = mo;
        this.te = te;
        this.pro = pro;
    }
    
    public Ordenador (){}
    

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    

    public void setMo(Monitor mo) {
        this.mo = mo;
    }

    
    public void setTe(Teclado te) {
        this.te = te;
    }
    
    
    public void setPro(Cpu pro) {
        this.pro = pro;
    }
    
    
    public float getPrecio() {
        return precio;
    }

   
    public Monitor getMo() {
        return mo;
    }

    
    public Teclado getTe() {
        return te;
    }

    
    public Cpu getPro() {
        return pro;
    }
    
    
    @Override
    public String toString() {
        return "Ordenador{" + "precio=" + precio + ", mo=" + mo + ", te=" + te + ", pro=" + pro + '}';
    }
    
    
    
    
   
    
}