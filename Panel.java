/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gioco2d;

import java.awt.*;
import static java.awt.BorderLayout.CENTER;
import javax.swing.*;

/**
 *
 * @author t.erra
 */
public class Panel extends JPanel {
    
    //Pannelli di inizio gioco
    JPanel sceltaPanel = new JPanel();
    JPanel opzioniPanel = new JPanel();
    
    //bottoni della scelta iniziale
    JButton nuovaPartita = new JButton("Nuova Partita");
    JButton caricaPartita = new JButton("Carica Partita");
    JButton opzioni = new JButton("Opzioni");
    
    //bottoni del pannello delle opzioni
    JButton audioButton = new JButton("Disabilita Audio");
    JButton salvaPartitaButton = new JButton("Salva Partita");
    JButton indietroButton = new JButton("Indietro");
   
    
    public Panel () {
      
        
        this.addPanel(sceltaPanel);
        sceltaPanel.setLayout(new GridLayout(3,0,20,20));
        sceltaPanel.setPreferredSize(new Dimension (400, 400));
        sceltaPanel.setBackground(Color.black);
        sceltaPanel.add(nuovaPartita);
        sceltaPanel.add(caricaPartita);
        sceltaPanel.add(opzioni);
        
        
        
        
    }
    
    //attacco i bottoni
    private void addButton(JButton b){
        this.add(b);
    }
    
    //attacco i pannelli
    private void addPanel(JPanel p) {
        this.add(p);
    }
}
