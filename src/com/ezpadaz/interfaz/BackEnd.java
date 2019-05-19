/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ezpadaz.interfaz;

import com.ezpadaz.background.Game;

/**
 *
 * @author Jorge
 */
public class BackEnd{
    
    private Ventana ventana;
    private Game juego;
    private int temp = 0;
    
    public BackEnd(Ventana ventana){
        this.ventana = ventana;
        juego = new Game();
        ventana.updateStatus(juego.gameStatus());
    }
    

    public void newGame(){
        juego.setVidas(ventana.getTableSize());
        juego.startGame();
        ventana.updateStatus(juego.gameStatus());
    }
    
    public void sendValue(String val){
        if(juego.getVidas()!=0){
            juego.verificar(val);
            ventana.addTableData(temp, val, juego.getPicas(), juego.getFijas());
            temp++;
        }else{
            ventana.updateStatus(false);
            ventana.setEdit(true);
        }
    }
}
