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
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author t.erra
 */
public class SceltaPanel extends JPanel {
    
    JButton nuovaPartita = new JButton ("Nuova Partita");
    JButton caricaPartita = new JButton ("Carica Partita");
    JButton opzioni = new JButton ("Opzioni");
    JPanel appoggio = new JPanel();
    
    
    public SceltaPanel()  {
        
    
    this.setPreferredSize(new Dimension(400,400));
    this.setLayout(new GridLayout(3,0,20,20));
    this.setBackground(Color.BLACK);
        
    this.add(nuovaPartita);
    this.add(caricaPartita);
    this.add(opzioni);
    
    opzioni.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               opzioniActionPerformed();
            }
        });
    
    nuovaPartita.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               nuovaPartitaActionPerformed();
            }
        });
}
    
    public void opzioniActionPerformed(){
        if (Main.sP.isVisible()) {
            
            Main.f.getContentPane().remove(Main.sP);
            Main.f.add(Main.oP, BorderLayout.CENTER);
            //validate e repaint servono per ridisegnare il contenuto del
            //frame
            Main.f.validate();
            Main.f.repaint();
            Main.oP.setVisible(true);
            Main.sP.setVisible(false);
        }
    }
    
    public void nuovaPartitaActionPerformed(){
        
        if (Main.sP.isVisible()) {
            
            Main.f.getContentPane().remove(Main.sP);
            Main.f.add(Main.griglia, new FlowLayout(FlowLayout.CENTER,0 , 0));
            Main.contentPane.setLayout(new FlowLayout(FlowLayout.CENTER,0 ,0));
            //validate e repaint servono per ridisegnare il contenuto del
            //frame
            Main.f.validate();
            Main.f.repaint();
            Main.griglia.setVisible(true);
            Main.sP.setVisible(false);
        }
    }
}
