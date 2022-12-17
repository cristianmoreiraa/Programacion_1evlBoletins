package boletín_16;

/**
 *
 * @author crist
 */
public class CuentaCorriente extends Cuenta{
    private final double interes = 0.015;
    
        //contructores

    public CuentaCorriente(long numAcc, double saldo, Person cliente) {
        super(numAcc, saldo, cliente);
    }
    
        //toString

    @Override
    public String toString() {
        return "CuentaCorriente, interes=" + interes;
    }
    
}
