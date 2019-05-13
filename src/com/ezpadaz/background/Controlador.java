/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ezpadaz.background;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Controlador {
    
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        Game g = new Game();
        
        g.startGame();
        
        while(g.gameStatus()){
            System.out.println("PICAS: "+g.getPicas()+"  FIJAS: "+g.getFijas());
            System.out.println("Porfavor introduce un numero (o x, para salir)");
            String guess = kb.nextLine();
            if(guess.length()>4){
                System.out.println("That aint a valid opt boi.");
            }else if(guess.contains("x")){
                break;
            }else if(guess.contains("c")){
                System.out.println(g.getWinNumber());
            }else{
                g.verifyAnswer(guess);
            }
        }
    }
}
