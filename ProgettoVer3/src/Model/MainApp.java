
package Model;

import Graphics.GameWindow;
import Graphics.GrigliaPanel;
import Graphics.OpzioniPanel;
import Graphics.SceltaPanel;

public class MainApp {
    public static GameWindow gameWindow;
    public static GameManager gameManager;
    public static GrigliaPanel gamePanel;
    public static OpzioniPanel opzioniPanel;
    public static SceltaPanel sceltaPanel;
    
    
    public static void main(String[] args) {
        //****** initialise window ******
        //------- setup window
        gameManager = new GameManager();
        gameWindow = new GameWindow();
        opzioniPanel = new OpzioniPanel();
        sceltaPanel = new SceltaPanel();
        gamePanel = new GrigliaPanel();
        
        gameWindow.add(sceltaPanel);
        gameWindow.validate();
        gameWindow.pack();
        gameWindow.setVisible(true);
    }
}
