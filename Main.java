/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gioco2d;

/**
 *
 * @author t.erra
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;


/**
 *
 * @author t.erra
 */
public class Main {
    
    public static JFrame f = new JFrame();
    public static SceltaPanel sP = new SceltaPanel();
    public static OpzioniPanel oP = new OpzioniPanel();
    public static GrigliaPanel griglia = new GrigliaPanel(); 
    
    static Container contentPane = f.getContentPane();
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        f.add(sP);
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER,0 ,150));
        f.setSize(1366, 768);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
    }


    
    
    
}
