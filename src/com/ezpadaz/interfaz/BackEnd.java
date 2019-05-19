/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ezpadaz.interfaz;

import com.ezpadaz.background.Game;
import javax.swing.JOptionPane;

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
        ventana.updateStatus(false);
    }
    

    public void newGame(){
        juego.setVidas(ventana.getTableSize());
        juego.startGame();
        ventana.updateStatus(true);
        ventana.setEdit(true);
        ventana.eraseTable();
    }
    
    public void gameOver(boolean success){
        String texSuccess = "<html>"
                + "<body>"
                + "<font color='green'><b>Felicidades!</b></font>"
                + "<br>"
                + "Adivinaste el número: "+juego.getWinNumber()
                + "<br>";
        
        String textFail = "<html>"
                + "<body>"
                + "<font color='red'><b>Mejor a la proxima :(</b></font>"
                + "<br>"
                + "El numero era: "+juego.getWinNumber()
                + "<br>";
        
        ventana.updateStatus(false);
        ventana.setEdit(false);
        
        if(success){
            JOptionPane.showMessageDialog(null, texSuccess);
        }else{
            JOptionPane.showMessageDialog(null, textFail);
        }
    }
    
    public void sendValue(String val){
        if(juego.getVidas()!=0){
            juego.verificar(val);
            ventana.addTableData(temp, val, juego.getPicas(), juego.getFijas());
            if(juego.isGuessed(val)){
                gameOver(true);
            }
            temp++;
        }else{
            gameOver(false);
        }
    }
}
