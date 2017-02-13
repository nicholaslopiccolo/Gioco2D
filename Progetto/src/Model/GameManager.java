package Model;


import Characters.Protagonist;
import Model.MainApp;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x.ruan
 */
public class GameManager {
    
    public static Level level;
    private boolean InGame;
    //********* constructor ***********
    public GameManager(){
        InGame = false;
    }
    //********* setting/getting *********
    public boolean InGame(){return InGame;}
    //********** operators ****************
    public void startGame(){
        level = new Level(1);
        InGame = true;
        //iniziare la collisione
        while(InGame){
            MainApp.gamePanel.repaint();
        }
    }
}
