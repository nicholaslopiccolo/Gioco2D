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
public class opzioniPanel extends JPanel{
    
    JButton audioButton = new JButton("Disabilita audio");
    JButton indietro = new JButton("Indietro");
    JButton salvaPartita = new JButton("Salva Partita");
    
    public opzioniPanel() {
        
      this.setPreferredSize(new Dimension(400,400));
      this.setLayout(new GridLayout(3,0,20,20));
      
      this.add(audioButton);
      this.add(salvaPartita);
      this.add(indietro);
      
      indietro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                indietroActionPerformed();
            }
        });
        
    }
    
    public void indietroActionPerformed(){
        if (JavaApplication3.oP.isVisible()) {
            
            JavaApplication3.f.getContentPane().remove(JavaApplication3.oP);
            JavaApplication3.f.add(JavaApplication3.sP, BorderLayout.CENTER);
            //validate e repaint servono per ridisegnare il contenuto del
            //frame
            JavaApplication3.f.validate();
            JavaApplication3.f.repaint();
            JavaApplication3.sP.setVisible(true);
            JavaApplication3.oP.setVisible(false);
        }
    }

    
    
}
