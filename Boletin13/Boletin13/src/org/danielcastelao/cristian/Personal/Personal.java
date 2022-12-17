
package org.danielcastelao.cristian.Personal;

/**
 *
 * @author crist
 */
public class Personal {
    
    private String telefono, correo;

    public Personal() {
    }

    public Personal(String telefono, String correo) {
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Teléfono = " + telefono + ", Correo = " + correo;
    }
    
    
    
}