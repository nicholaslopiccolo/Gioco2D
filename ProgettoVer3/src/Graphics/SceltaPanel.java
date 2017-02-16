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
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Model.*;
/**
 *
 * @author t.erra
 */
public class SceltaPanel extends JPanel {
    
    JButton nuovaPartita = new JButton ("Nuova Partita");
    JButton caricaPartita = new JButton ("Carica Partita");
    JButton opzioni = new JButton ("Opzioni");
    JPanel appoggio = new JPanel();
    
    //*********** constructor *****************
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
        MainApp.gameWindow.remove(this);
        MainApp.gameWindow.add(MainApp.opzioniPanel);
        MainApp.opzioniPanel.setVisible(true);
        MainApp.gameWindow.repaint();
    }
    
    public void nuovaPartitaActionPerformed(){
        MainApp.gameWindow.remove(this);
        MainApp.gameWindow.add(MainApp.gamePanel);
        MainApp.gameWindow.pack();
        MainApp.gamePanel.setVisible(true);
        MainApp.gameWindow.repaint();
        //--------- start game at GameManager which is a thread
        MainApp.gameManager.start();
    }
}
