
package boletín_16;

public class Boletín_16 {

    
    public static void main(String[] args) {
        Person objPer = new Person("Cristian" ,"Moreira Alén", "12345678Y");
        CuentaCorriente objCor = new CuentaCorriente(123,8000,objPer);
        
        objCor.deposit();
        objCor.withdraw();
        objCor.showSaldo();
    }
    
}
