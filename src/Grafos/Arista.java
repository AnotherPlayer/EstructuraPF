/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafos;

/**
 *
 * @author Jorge
 */
public class Arista {
    private Nodo origen;
    private Nodo destino;
    //Eficiencia de un nodo a otro (determinado por el numero de picas o fijas de uno a otro).
    private int eff;
    
    public Arista(Nodo origen, Nodo destino, int eff){
        this.origen = origen;
        this.destino = destino;
        this.eff = eff;
    }
    
    public Nodo getOrigen(){
        return this.origen;
    }
    
    public Nodo getDestino(){
        return this.destino;
    }
    
    public void setDestino(Nodo destino){
        this.destino = destino;
    }
}
