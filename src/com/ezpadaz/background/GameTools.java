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
    
    public String getNum(){
        String gen = "";
        int repeat = 0;
        
        while(gen.length()< 4){
            int selected = rand.nextInt(10);
            if(gen.contains(String.valueOf(selected))){
                //Si la cadena ya contiene ese numero, skip.
            }else{
                if(repeat == 0 && selected == 0){
                    // Si es el primero numero, y el primer numero es 0, se hace skip.
                }else{
                    gen += selected;
                }
            }
        }   
        return gen;
    }
}
