/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gioco2d;

import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author t.erra
 */
public class Gioco2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //creo un jframe
        JFrame f = new JFrame("Gioco 2D");
        Panel mainPanel = new Panel();
       
        f.setSize(1380, 735);
        f.setLayout(new BorderLayout());
        
        f.add(mainPanel, BorderLayout.CENTER);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}
