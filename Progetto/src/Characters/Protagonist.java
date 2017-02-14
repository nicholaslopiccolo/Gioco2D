package Characters;

import SideClasses.Sprite;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Protagonist extends Sprite{
    //********** attributes ***********
    //---- initialise frame size of animations
    private int MOVERIGHT_SIZE = 3;
    private int MOVELEFT_SIZE = 5;
    private int JUMP_SIZE = 5;
    private int ATTACK_SIZE = 5;
    //---- animations
    private BufferedImage[] Standby;
    private BufferedImage[] moveRight, moveLeft;
    private BufferedImage[] Jump;
    private BufferedImage[] Attack;
    private int frameCounter = 0;
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
        currentFrame = moveRight[0];
    }
    
    //********** setting/getting ***********
    public void setHealth(int h){this.Health = h;}
    //********** operators *********
    private final void loadFrames(){
        //!!!non avendo ancora le animazioni, questa parte lo facciamo dopo!!!
        try{
             for (int i = 0; i < moveRight.length; i++){
                moveRight[i] = ImageIO.read(getClass().getResource("../Graphics/Images/Protagonist/moveRight/" + Integer.toString(i) + ".png"));
             }  
        }catch(Exception ex){
            System.out.println("dasdasd");
        }

    }
    //********** operators ***********
    public void refreshFrame(){
        frameCounter = 0;
    }
    public void moveRight(){
        if (frameCounter >= moveRight.length) frameCounter = 0;
        currentFrame = moveRight[frameCounter];
        frameCounter++;
    }
    public void moveLeft(){
        if (frameCounter >= moveLeft.length) frameCounter = 0;
        currentFrame = moveLeft[frameCounter];
        frameCounter++;
    }
    public void Jump(){
        if (frameCounter >= Jump.length) frameCounter = 0;
        currentFrame = Jump[frameCounter];
        frameCounter++;
    }
    public void Attack(){
        if (frameCounter >= Attack.length) frameCounter = 0;
        currentFrame = Attack[frameCounter];
        frameCounter++;
    }
}
