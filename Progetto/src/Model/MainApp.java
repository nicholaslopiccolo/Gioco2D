
package Model;

import Graphics.GameWindow;
import Graphics.GrigliaPanel;

public class MainApp {
    public static GameManager gameManager;
    public static GrigliaPanel gamePanel;
    public static void main(String[] args) {
        //****** initialise window ******
        //------- setup window
        gameManager = new GameManager();
        GameWindow gameWindow = new GameWindow();
        gamePanel = new GrigliaPanel();
        gameWindow.add(gamePanel);
        gameWindow.validate();
        gameWindow.pack();
        gameWindow.setVisible(true);
        gameManager.startGame();
    }
}
