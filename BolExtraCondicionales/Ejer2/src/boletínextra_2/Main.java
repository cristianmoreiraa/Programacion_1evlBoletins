
package boletínextra_2;

/**
 *
 * @author crist
 */
public class Main {

    
    public static void main(String[] args) {
        Account obj1 = new Account("Cristian", "50", 37.8 , 5000);
        Account obj2 = new Account("Federico", "69", 37.8,6000);
        
        obj2.transferencia(obj2, 300);
        System.out.println(obj1.getSaldo()+"\n"+obj2.getSaldo());
    }
    
}
