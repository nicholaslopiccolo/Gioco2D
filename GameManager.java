
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
    ArrayList gameCharacters = new ArrayList();
    private boolean InGame;
    private Level level;
    //********* constructor ***********
    public GameManager(){
        
    }
    //********** operators ****************
    public void startGame(){
        InGame = true;
        
        //iniziare la collisione
        while(InGame){
            MainApp.gamePanel.repaint();
        }
    }
    
    public void addCharacter(Protagonist p){
        gameCharacters.add(p);
    }
    public void addCharacter(Mob m){
        gameCharacters.add(m);
    }
    public void removeCharacter(Protagonist p){
        gameCharacters.remove(p);
    }
    public void removeCharacter(Mob m){
        gameCharacters.remove(m);
    }
    
}
