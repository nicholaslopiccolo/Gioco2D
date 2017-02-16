/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics;

/**
 *
 * @author t.erra
 */
import Model.MainApp;
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
    //**************** constructor *******************
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
        if (MainApp.opzioniPanel.isVisible()) {
            
            MainApp.gameWindow.getContentPane().remove(MainApp.opzioniPanel);
            MainApp.gameWindow.add(MainApp.sceltaPanel, BorderLayout.CENTER);
            //validate e repaint servono per ridisegnare il contenuto del
            //frame
            MainApp.gameWindow.validate();
            MainApp.gameWindow.repaint();
            MainApp.sceltaPanel.setVisible(true);
            MainApp.opzioniPanel.setVisible(false);
        }
    }

    
    
}
