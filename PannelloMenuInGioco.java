package gioco2d.Content;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author nicholas
 */
public class PannelloMenuInGioco extends JPanel {
    private JButton opzioni = new JButton("Opzioni");
    private JButton audio = new JButton("Audio");
    private JButton torna_al_gioco = new JButton("Opzioni");
    public PannelloMenuInGioco(){
        this.setPreferredSize(new Dimension(150,150));
        this.setLayout(new GridLayout(3,1));
        addBt(opzioni);
        addBt(audio);
        addBt(torna_al_gioco);
        this.setVisible(true);
    }
    private void addBt(JButton b) {
        b.setBackground(Color.GRAY);
        b.setForeground(Color.WHITE);
        this.add(b);
    }
}
