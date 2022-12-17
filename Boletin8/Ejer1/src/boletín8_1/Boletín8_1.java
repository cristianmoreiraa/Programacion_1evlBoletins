/* Un almacén clasifica los productos según la siguiente tabla de ventas anuales
        ventas anuales -------------------------  consumo
            <=100                                   bajo
            >100 y <=500                            medio
            >500 y <=1000                           alto
            >1000                                   primera necesidad


*/
package boletín8_1;

import javax.swing.JOptionPane;


public class Boletín8_1 {

    
    public static void main(String[] args) {
        
        
//pedimos el nombre y la cantidad por pantalla

    String nombre = JOptionPane.showInputDialog("Introduce el nombre del producto: ");
    int ventas = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de ventas totales:"));
    

//creamos un objeto:
    Productos objProd = new Productos();
        objProd.tipoArticulo(nombre, ventas);
    
    
    }
    
}
