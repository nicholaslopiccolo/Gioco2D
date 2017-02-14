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
import javax.swing.*;

/**
 *
 * @author t.erra
 */
public class OpzioniPanel extends JPanel{
    
    JButton audioButton = new JButton("Disabilita audio");
    JButton indietro = new JButton("Indietro");
    JButton salvaPartita = new JButton("Salva Partita");
    
    public OpzioniPanel() {
        
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
        if (Main.oP.isVisible()) {
            
            Main.f.getContentPane().remove(Main.oP);
            Main.f.add(Main.sP, BorderLayout.CENTER);
            //validate e repaint servono per ridisegnare il contenuto del
            //frame
            Main.f.validate();
            Main.f.repaint();
            Main.sP.setVisible(true);
            Main.oP.setVisible(false);
        }
    }

    
    
}
