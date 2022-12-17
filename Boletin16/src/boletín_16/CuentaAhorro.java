
package boletín_16;

import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class CuentaAhorro extends Cuenta {
    private double interes, minWage;
    
        //contructores

    public CuentaAhorro(double interes, double minWage, long numAcc, double saldo, Person cliente) {
        super(numAcc, saldo, cliente);
        this.interes = interes;
        this.minWage = minWage;
    }
        
        //métodos
    public void changeInteres(){
        double newInteres = Double.parseDouble(JOptionPane.showInputDialog("Introduce el nuevo interés: "));
        interes = newInteres;
    }

        //toString
    @Override
    public String toString() {
        return "CuentaAhorro tiene un interes de :" + interes + ", minWage=" + minWage;
    }
    
        

 
    
    
    
}
