package com.cristian.partes;


public class Monitor {
    
    
   private float pulgadas;

    public Monitor(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    public Monitor (){}
 
    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    public float getPulgadas() {
        return pulgadas;
    }
    
 
    @Override
    public String toString() {
        return "Monitor{" + "pulgadas=" + pulgadas + '}';
    }
    
    
    
    
    
}