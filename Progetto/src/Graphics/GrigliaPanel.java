/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics;

import Model.Level;
import Model.MainApp;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author t.erra
 */
public class GrigliaPanel extends JPanel {
    
    //grandezza cella
    private int Height=512;
    private int Width=1024;
    
    public GrigliaPanel () {
        this.setPreferredSize(new Dimension(Width, Height));
        this.setBackground(Color.DARK_GRAY);
        this.setDoubleBuffered(true);
    }
    
    protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            //lo casto in un oggetto Graphics2D in modo da poter usare l'antialiasing
            Graphics2D g2=(Graphics2D)g;
            //uso l'antialiasing per disegnare linee e immagini maggiormente definite
            //posso farlo xke uso un oggetto Graphics2D
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            if (MainApp.gameManager.InGame()) render(g2);
    }
    
    private final void render(Graphics2D g2){
            //disegno una griglia di celle giusto per dare un'idea del mondo in cui si muove il personaggio
            for(int i=0; i < 64; i++){
                g2.drawLine(0, i*32, HEIGHT, i*32);
                g2.drawLine(i*32, 0, i*32, WIDTH);
            }
            //---------------! disegno le mattonelle !----------------
            for (int i = 0; i < Level.TILE_SIZE; i++){
                g2.drawImage(Level.tiles[i].getCurrentFrame(),Level.tiles[i].getPositionX(), Level.tiles[i].getPositionY(),null);
            }
    }
}
