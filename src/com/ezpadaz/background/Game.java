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
public class Game {
    private static String _generatedNumber = "";
    private int picas = 0;
    private int fijas = 0;
    private int vidas = 0;
    private Random rand = new Random();
    
    
    public Game(){
        System.out.println("Clase principal de juego inciiado.");
    }
    
    public void startGame(){
     // este metodo iniciara el juego.
        _generatedNumber = getNum();
        System.out.println("Numero Generado: "+_generatedNumber);
    }
    
    public String getWinNumber(){
        return _generatedNumber;
    }
    
    public void verificar(String num){
        //verificacion.
        picas = 0;
        fijas = 0;
        //reset above avoids data leaks.     
        for(int i=0; i<num.length(); i++){
           if(num.contains(String.valueOf(_generatedNumber.charAt(i)))){
                picas++;
            }
        }
        for(int i=0; i<num.length(); i++){
            if(_generatedNumber.charAt(i) == num.charAt(i)){
                fijas++;
                if(picas>0){
                    picas--;
                }
            }
        } 
        vidas--;
    }
    
    public boolean isGuessed(String val){
        if(val.equals(_generatedNumber)){
            return true;
        }else{
            return false;
        }
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
    
    public void setVidas(int n){
        System.out.println("Numero de vidas ajustado a: "+n);
        this.vidas = n;
    }
    
    public int getVidas(){
        return vidas;
    }

    
    public int getPicas(){
        return picas;
    }
    
    public int getFijas(){
        return fijas;
    }
}
