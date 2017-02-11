/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gioco2d;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author t.erra
 */
public class GrigliaPanel extends JPanel {
    
    //grandezza cella
    public static final int HEIGHT=1344;
    public static final int WIDTH=768;
    
    public GrigliaPanel () {
        
        this.setPreferredSize(new Dimension(HEIGHT, WIDTH));
        
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

            //disegno una griglia di celle giusto per dare un'idea del mondo in cui si muove il personaggio
            for(int i=0; i<64; i++){
                    g2.drawLine(0, i*32, HEIGHT, i*32);
                    g2.drawLine(i*32, 0, i*32, WIDTH);
            }

            //disegno il personaggio
            //System.out.println("Disegno hero, coordinate: " + hero.getCurrentX() + " " + hero.getCurrentY());
            //g2.drawImage(hero.getImmagineCorrente(),hero.getCurrentX(),hero.getCurrentY(),null);
            
    }
    
}
