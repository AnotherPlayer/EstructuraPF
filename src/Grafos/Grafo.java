/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jorge
 */
public class Grafo {
    private List<Nodo> nodos;
    
    public void agregarNodo(Nodo nodo){
        if(nodos == null){
            nodos = new ArrayList<>();
        }
        nodos.add(nodo);
    }
    
    public List<Nodo> getNodos(){
        return this.nodos;
    }
}
