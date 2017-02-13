package Characters;

import SideClasses.Sprite;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Protagonist extends Sprite{
    //********** attributes ***********
    //---- initialise frame size of animations
    private int MOVERIGHT_SIZE = 5;
    private int MOVELEFT_SIZE = 5;
    private int JUMP_SIZE = 5;
    private int ATTACK_SIZE = 5;
    //---- animations
    private BufferedImage[] Standby;
    private BufferedImage[] moveRight, moveLeft;
    private BufferedImage[] Jump;
    private BufferedImage[] Attack;
    //----- properties
    private int Health;
    private int movementSpeed;
    //********** constructor ************
    public Protagonist(int posx, int posy, String tag, boolean solidity, boolean gravity, int health){
        super(posx,posy,tag,solidity,gravity);
        //----- initialise attributes
        moveRight = new BufferedImage[MOVERIGHT_SIZE];
        moveLeft = new BufferedImage[MOVELEFT_SIZE];
        Jump = new BufferedImage[JUMP_SIZE];
        Attack = new BufferedImage[ATTACK_SIZE];
        
        loadFrames();//load animation frames
        //----- initialise properties
        setHealth(health);
        currentFrame = Standby[0];
        
    }
    
    //********** setting/getting ***********
    public void setHealth(int h){this.Health = h;}
    //********** operators *********
    private final void loadFrames(){
        //!!!non avendo ancora le animazioni, questa parte lo facciamo dopo!!!
    }
    //********** operators ***********
    public void moveRight(){/***** DA IMPLEMENTARE*****/}
    public void moveLeft(){/***** DA IMPLEMENTARE****/}
    public void Jump(){/***** DA IMPLEMENTARE****/}
    public void Attack(){/***** DA IMPLEMENTARE****/}
}
