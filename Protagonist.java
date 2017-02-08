
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xinxin
 */
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
        HitBox = new Rectangle(new Dimension(currentFrame.getWidth(), currentFrame.getHeight()));
    }
    
    //********** setting/getting ***********
    public void setHealth(int h){this.Health = h;}
    //********** operators *********
    private final void loadFrames(){
        //!!!non avendo ancora le animazioni, questa parte lo facciamo dopo!!!
    }
    //********** operators ***********
    public void moveRight(){runAnimation(moveRight, currentAction);}
    public void moveLeft(){runAnimation(moveLeft, currentAction);}
    public void Jump(){runAnimation(Jump, currentAction);}
    public void Attack(){runAnimation(Attack, currentAction);}
}
