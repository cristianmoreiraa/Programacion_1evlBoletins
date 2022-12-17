
package boletín6_2;


public class Satelite {
    
    private double meridiano;
    private double paralelo;
    private double distanciaTierra;
    

public Satelite() {
  meridiano = paralelo = distanciaTierra = 0 ;
    
}

public Satelite (double m, double p , double d) {
    meridiano = m;
    paralelo= p;
    distanciaTierra= d;
    
}
 

public void verPosicion(){

    System.out.println("El satélite se encuentra en el paralelo " + paralelo + " en el meridiano " +meridiano+ " y a una distancia a la tierra de " +distanciaTierra);
    


}
    
    
}
