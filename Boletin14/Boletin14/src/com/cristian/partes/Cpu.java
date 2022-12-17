package com.cristian.partes;


public class Cpu {
    
   private int velocidad;
    
    public Cpu(int velocidad) {
        this.velocidad = velocidad;
    }
    
    public Cpu (){}
   
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }
    
    
    @Override
    public String toString() {
        return "Cpu{" + "velocidad=" + velocidad + '}';
    }
    
    
}