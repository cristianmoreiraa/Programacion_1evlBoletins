
package boletín_16;

import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class Cuenta extends Person {
                    //ATRIBUTOS
    private long numAcc;
    private double saldo;
    private Person cliente;
    
                    //CONSTRUCTOR   

    public Cuenta() {
    }

    public Cuenta(long numAcc, double saldo, Person cliente) {
        this.numAcc = numAcc;
        this.saldo = saldo;
        this.cliente = cliente;
    }
    
                    //getters & setters

    public long getNumAcc() {
        return numAcc;
    }

    public double getSaldo() {
        return saldo;
    }

    public Person getCliente() {
        return cliente;
    }

    public void setNumAcc(long numAcc) {
        this.numAcc = numAcc;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setCliente(Person cliente) {
        this.cliente = cliente;
    }
    
    
                    //metodos
    public void deposit(){
       long askAcc = Long.parseLong(JOptionPane.showInputDialog("Introduce tu número de cuenta: "));
       if (askAcc == numAcc){
           JOptionPane.showMessageDialog(null, "Hola, "+cliente+ "\nTu saldo es de " +saldo+ "€");
           double deposit1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de € que deseas ingresar: "));
           double nuevoSaldo1 = deposit1 + saldo;
           saldo = nuevoSaldo1;
           JOptionPane.showMessageDialog(null, "Su deposito se ha realizado con éxito, su nuevo saldo es de: " +nuevoSaldo1 );
       }else{
           JOptionPane.showMessageDialog(null, "El número de cuenta es incorrecto o algo ha ido mal.");
       }
    }
    
    public void withdraw(){
        long askAcc =  Long.parseLong(JOptionPane.showInputDialog("Introduce tu número de cuenta: "));
        if ((askAcc == numAcc)&& (saldo>0)){
            JOptionPane.showMessageDialog(null,"Hola, " +cliente+ " tu saldo es de " +saldo+ "€");
            double withdraw1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de € que deseas retirar"));
            double newSaldo = saldo - withdraw1;
            saldo = newSaldo;
            JOptionPane.showMessageDialog(null, "Su saldo ha cambiado correctamente,\nsu nuevo saldo es de: " +newSaldo+"€");
        }else if (askAcc != numAcc){
            JOptionPane.showMessageDialog(null, "El número de cuenta es incorrecto o algo ha ido mal.");
        }else {
            JOptionPane.showMessageDialog(null, "No tienes suficientes saldo, para realizar esta operacióm.");
        }
    }
    
    public void showSaldo(){
        JOptionPane.showMessageDialog(null, "Tu saldo actual es de: " +saldo);
    }
    
    
    
    
    
    
}