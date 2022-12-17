
package boletin13;

import javax.swing.JOptionPane;
import org.danielcastelao.cristian.Personal.Personal;
/**
 *
 * @author crist
 */
public class Academica {
    public static int numReferencia = 2018;   
    
    private String nombre;
    private int nota;
    private Personal alumno;

    public Academica() {
        numReferencia++;
    }

    public Academica(String nombre, int nota, Personal alumno) {
        this.nombre = nombre;
        this.nota = nota;
        this.alumno = alumno;
    }

    public static int getNumReferencia() {
        return numReferencia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }

    public Personal getAlumno() {
        return alumno;
    }

    public static void setNumReferencia(int numReferencia) {
        Academica.numReferencia = numReferencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setAlumno(Personal alumno) {
        this.alumno = alumno;
    }
    
    public int checkMark(){
        do{
            nota = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es la nota?\n(Entre 0 y 10, ambos incluidos)"));
        }while(nota<1 || nota>10);
        return nota;
    }

    @Override
    public String toString() {
        return "Nombre= " + nombre + ", Nota= " + nota + ", Alumno= " + alumno;
    }
    }
