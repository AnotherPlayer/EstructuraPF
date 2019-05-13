/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ezpadaz.background;

import java.util.Random;

/**
 *
 * @author Jorge
 */
public class GameTools {
    
    private Random rand = new Random();
    
    public GameTools(){
        System.out.println("GameTools boot.");
    }
    
    
    public String gtGenNum(){
        //Genera un numero de 4 digitos y lo retorna como string
        String resultado = "";
        int alt = rand.nextInt(9999-1000)+1000;
        resultado = String.valueOf(alt);
        return resultado;
    }
}
