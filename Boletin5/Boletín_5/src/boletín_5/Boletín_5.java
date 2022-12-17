/**Clase consumo, forma parte da centralita dun coche que ten os seguintes atributos:
* km (km percorridos polo coche)
* litros (litros de combustible consumidos)
* vMed (Velocidade media)
* pGas (precio gasolina)
* 
* Dous constructores: un con parámetros e outro sen eles.
* 
* getTempo (tempo empregado en realizar a viaxe)
* consumoMedio (consumo medio vehículo cada 100km)
* consumoEuros (consumo medio en € cada 100km)
* setKms (modifica o valos dos km)
* setLitros  ""   litros
* setvMed    ""   vMed
* setPGas    ""   pGas
*/

package boletín_5;

public class Boletín_5 {

    public static void main(String[] args) {
        
        Consumo obxConsumo1 = new Consumo();
        
        obxConsumo1.setlitros(50);
        obxConsumo1.setpGas(1.57f);
        
        Consumo obxConsumo2 = new Consumo(200, 12, 60, 1.57f);
        
        var consumoMedio = obxConsumo2.consumoMedio();
        System.out.println("consumo medio = " +consumoMedio);
        
        obxConsumo2.setlitros(15);
        
        var velocidadMedia = obxConsumo2.getvMed();
        System.out.println("velocidad media = " +velocidadMedia);
    
    }
    
  
}
