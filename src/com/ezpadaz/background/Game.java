/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ezpadaz.background;

/**
 *
 * @author Jorge
 */
public class Game {
    private GameTools gt = new GameTools();
    private static String _generatedNumber = "";
    private int picas = 0;
    private int fijas = 0;
    private boolean isGameActive = false;
    
    
    public Game(){
        System.out.println("Game Class boot.");
    }
    
    public void startGame(){
    // este metodo iniciara el juego.
    // nada.
        _generatedNumber = gt.gtGenNum();
    //Debug purposes only.
        //System.out.println("El numero se ha generado correctamente: "+_generatedNumber);
        isGameActive = true;
    }
    
    public String getWinNumber(){
        return _generatedNumber;
    }
    
    public void verifyAnswer(String num){
        //verificacion.
        picas = 0;
        fijas = 0;
        //reset above avoids data leaks.     
        for(int i=0; i<num.length(); i++){
           String chr = Character.toString(num.charAt(i));
           if(_generatedNumber.contains(chr)){
               picas++;
           }
        }
        for(int i=0; i<num.length(); i++){
            if(_generatedNumber.charAt(i) == num.charAt(i)){
                fijas++;
            }
        } 
    }
    
    public boolean gameStatus(){
        return isGameActive;
    }
    
    public int getPicas(){
        return picas;
    }
    
    public int getFijas(){
        return fijas;
    }
}
