
package Characters;

import SideClasses.Sprite;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Mob extends Sprite {
    
    //-------- fps
    final int TARGET_FPS = 12;
    private double OPTIMAL_TIME = 1000000000 / TARGET_FPS;
    private double accumulatedTime = 0;
    private double lastTime = System.nanoTime();
    
    //---- initialise frame size of animations
    private int MOVERIGHT_SIZE = 3;
    private int MOVELEFT_SIZE = 5;
    private int JUMP_SIZE = 5;
    private int ATTACK_SIZE = 5;
    
    //---- animations
    private BufferedImage[] Standby;
    private BufferedImage[] moveRight, moveLeft;
    private BufferedImage[] Attack;
    private int frameCounter = 0;
    
    //costruttore
    
    public Mob (int posx, int posy, String tag, boolean solidity, boolean gravity, int health){
        super(posx,posy,tag,solidity,gravity);
        
        moveRight = new BufferedImage[MOVERIGHT_SIZE];
        moveLeft = new BufferedImage[MOVELEFT_SIZE];
        Attack = new BufferedImage[ATTACK_SIZE];
        
        loadFrames();//load animation frames
        
        currentFrame = moveRight[0];
    }
    
    private final void loadFrames(){
        //!!!non avendo ancora le animazioni, questa parte lo facciamo dopo!!!
        try{
             for (int i = 0; i < moveRight.length; i++){
                 
                 //cambia le immagini del mob mancano anche i movimenti randomici
                moveRight[i] = ImageIO.read(getClass().getResource("../Graphics/Images/Protagonist/moveRight/" + Integer.toString(i) + ".png"));
             }  
        }catch(Exception ex){}

    }
    
    public void refreshFrame(){frameCounter = 0;}
    
    public void Update(){
        double now = System.nanoTime();
        double updateLength = now - lastTime;
        lastTime = now;
        // update the frame counter
        accumulatedTime += updateLength;
    }
}
    
