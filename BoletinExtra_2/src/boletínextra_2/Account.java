
package boletínextra_2;

/**
 *
 * @author crist
 */
public class Account {
    private String nombre, ncuenta;
    private double tinteres, saldo;
    
        
    //constructores
    public Account(){
        
    }

    public Account(String nombre, String ncuenta, double tinteres, double saldo) {
        this.nombre = nombre;
        this.ncuenta = ncuenta;
        this.tinteres = tinteres;
        this.saldo = saldo;
    }
    
    //getter y setter

    public String getNombre() {
        return nombre;
    }

    public String getNcuenta() {
        return ncuenta;
    }

    public double getTinteres() {
        return tinteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNcuenta(String ncuenta) {
        this.ncuenta = ncuenta;
    }

    public void setTinteres(double tinteres) {
        this.tinteres = tinteres;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void transferencia(Account C2 , double importe){
        this.saldo -= importe;
        C2.saldo += importe;
    }
    public void ingreso(double ingreso){
        saldo += ingreso;
    }
    public void reintegro(double reintegro){
        saldo -= reintegro;
    }
    
    
}
