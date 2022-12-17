//obtenemos el nombre de los productos y el número de ventas indicando de que tipo son.
package boletín8_1;

import javax.swing.JOptionPane;
public class Productos {
/*
public class Productos {
        private String nombre;
        private int ventas;
        
        
public Productos(String nom, int vent){
    nombre = nom;
    ventas = vent;

}
*/
public void tipoArticulo(String nombre, int ventas){
      
    if(ventas <=100){ 
            JOptionPane.showMessageDialog(null, "El producto " +nombre+ " es de consumo bajo");  }
    else if (ventas >100 && ventas <=500) { 
            JOptionPane.showMessageDialog(null, "El producto " +nombre+ " es de consumo medio");}
    else if (ventas >500 && ventas <= 1000) {
            JOptionPane.showMessageDialog(null, "El producto " +nombre+ " es de consumo alto");}
        
        else {JOptionPane.showInternalMessageDialog(null, "El producto " +nombre+ " es de primera necesidad.");}
       // no va  else {JOptionPane.showMessageDialog(null, "El nombre del producto o la cantidad de ventas no es correcto.");};

    }
}
    

