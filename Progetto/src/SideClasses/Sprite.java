
package SideClasses;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Sprite{
    //*********** attributes *********
    protected BufferedImage currentFrame;
    protected int PosX, PosY;//Sprite location
    protected String Tag;//example: enemies, protagonist etc.
    protected boolean IsSolid;//is it solid?
    protected boolean Gravity;//is it affected by gravity?
    protected char currentAction;//actions:[Standby = s] [moveRight = r] [moveLeft = l] [Jump = j] [Attack = a]
    //******** constructor ***********
    public Sprite(int posx, int posy, String tag, boolean solidity, boolean gravity){
        setPositionX(posx);
        setPositionY(posy);
        setTag(tag);
        setSolidity(solidity);
        setGravity(gravity);
    }
    
    public Sprite(){
        setPositionX(0);
        setPositionY(0);
        setTag(null);
        setSolidity(false);
        setGravity(false);
    }
    //********* setting/getting ************
    public BufferedImage getCurrentFrame(){return this.currentFrame;}
    public int getPositionX(){return this.PosX;}
    public int getPositionY(){return this.PosY;}
    public boolean IsSolid(){return this.IsSolid;}
    public boolean HasGravity(){return this.Gravity;}
    public char getCurrentAction(){return this.currentAction;}
    public void setCurrentFrame(BufferedImage frame){this.currentFrame = frame;}
    public void setPositionX(int x){this.PosX = x;}
    public Rectangle getBound(){return new Rectangle(PosX,PosY,currentFrame.getWidth(),currentFrame.getHeight());}
    public void setPositionY(int y){this.PosY = y;}
    public void setTag(String t){this.Tag = t;}
    public void setSolidity(boolean s){this.IsSolid = s;}
    public void setGravity(boolean g){this.Gravity = g;}
    public void setAction(char d){this.currentAction = d;}
    //*********** operators ****************
    protected void runAnimation(BufferedImage[] frames){
        for (int i = 0; i < frames.length; i++){
            currentFrame = frames[i];
            //slow down the animation
            try{
                Thread.sleep(150);
            }catch(Exception e){
                System.out.println("animation error");
            }
        }
    }
    
    protected void runAnimation(BufferedImage[] frames, char action){
        for (int i = 0; i < frames.length && currentAction == action;i++){//se currentAction e' diverso dal parametro [action], 
            currentFrame = frames[i];//do animation                       //vuol dire che l'azione e' cambiata, per cui non serve piu' continuare l'animazione
            //slow down the animation
            try{
                Thread.sleep(150);
            }catch(Exception e){
                System.out.println("animation error");
            }
        }
    }
}
