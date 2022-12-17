
package boletín6_3;

public class Boletín6_3 {
    
    
    public static void main(String[] args) {
        
        Circulo obx1 = new Circulo(2);
        Circulo obx2 = new Circulo();
        obx2.setRadio(4);
        
        double area = obx1.calcularArea();
        double diametro = obx2.calcularDiametro();
        
            System.out.println("El area del circulo 1 = " +area);
            System.out.println("El diametro del circulo 2 = " +diametro);
        
        
        
        
        
        
    }
    
}
