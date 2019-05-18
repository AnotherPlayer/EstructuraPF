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
//        
        System.out.println(g.getWinNumber());
    }
}
