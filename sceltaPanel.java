/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author t.erra
 */
public class sceltaPanel extends JPanel  {
    
    JButton nuovaPartita = new JButton ("Nuova Partita");
    JButton caricaPartita = new JButton ("Carica Partita");
    JButton opzioni = new JButton ("Opzioni");
    
    public sceltaPanel() {
    
    this.setPreferredSize(new Dimension(400,400));
    this.setLayout(new GridLayout(3,0,20,20));
    
        
    this.add(nuovaPartita);
    this.add(caricaPartita);
    this.add(opzioni);
    
    opzioni.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               opzioniActionPerformed();
            }
        });
}
    
    public void opzioniActionPerformed(){
        if (JavaApplication3.sP.isVisible()) {
            
            JavaApplication3.f.getContentPane().remove(JavaApplication3.sP);
            JavaApplication3.f.add(JavaApplication3.oP, BorderLayout.CENTER);
            //validate e repaint servono per ridisegnare il contenuto del
            //frame
            JavaApplication3.f.validate();
            JavaApplication3.f.repaint();
            JavaApplication3.oP.setVisible(true);
            JavaApplication3.sP.setVisible(false);
        }
    }
    }
    
    
    
    

