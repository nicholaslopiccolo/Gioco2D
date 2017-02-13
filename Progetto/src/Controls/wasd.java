
package Controls;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class wasd implements KeyListener{

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        char action = ke.getKeyChar();
        switch(action){
            case 'A': case 'a':
            {
                
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
