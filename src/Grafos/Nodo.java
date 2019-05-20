/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Jorge
 */
public class Nodo {
    private String numero;
    private List<Arista> aristas;
    
    public Nodo(String numero){
        this.numero = numero;
    }
    
    public String getNumero(){
        return this.numero;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public List<Arista> getAristas(){
        return aristas;
    }
    
    public void addArista(Arista arista){
         if(aristas ==  null){
             aristas = new ArrayList<Arista>();
         }
         
         aristas.add(arista);
    }
}
