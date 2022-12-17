
package boletín_5;

public class Consumo {
    
    //declaramos atributos:
    
    private float km, litros, vMed, pGas;
    
    //instanciamos los constructores:
            //---> constructor por defecto
    
    public Consumo(){
    
    }
            
    
            //--->constructor parametrizado ----> (getter y setters)
    
    
    public Consumo(int km, int litros, int vMed, float pGas){
            this.km = km;
            this.litros = litros;
            this.vMed = vMed;
            this.pGas = pGas;
    }
    
    //Métodos---------------->
    
    public float getTempo(){
        return (1/vMed * km);
    }
    
    public float consumoMedio(){
        return ((litros * 100) / km);
    }
    
    public float consumoEuros(){
        return  ((litros * 100 / km)/pGas);
    }
    
    public void setkm(float km){
        this.km = km;
    }
    
    public float getkm(){
        return this.km;
    }
    
    public void setlitros(float litros){
        this.litros = litros;
    }
    
    public float getlitros(){
        return this.litros;
    }
    
    public void setvMed(float vMed){
        this.vMed = vMed;
    }
    
    public float getvMed(){
        return this.vMed;
    }
    
    public void setpGas(float pGas){
        this.pGas = pGas;
    }
    
    public float getpGas(){
        return this.pGas;
    }
    
    
    
}
