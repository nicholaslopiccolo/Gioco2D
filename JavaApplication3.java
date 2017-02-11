/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author t.erra
 */
public class JavaApplication3 {
    
    public static JFrame f = new JFrame("Menu");
    public static sceltaPanel sP = new sceltaPanel();
    public static opzioniPanel oP = new opzioniPanel();
    public static GrigliaPanel griglia = new GrigliaPanel();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        
        f.setSize(1360, 720);
        f.setLayout(new BorderLayout());
        f.add(sP, BorderLayout.CENTER);
        
               
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
    }
    
    
    
}
