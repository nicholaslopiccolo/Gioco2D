/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Characters.Protagonist;
import Graphics.Tile;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.imageio.ImageIO;
/**
 *
 * @author xinxin
 * !!!!!! SOLO I "NON" ANANANANNANANALFABETI DI INGLESE PUO LEGGERE IL CODICE !!!!!!
 */
public class Level {
    //********* OFFSETS **************
    public static int TILE_SIZE = 50;//variabile che definisce il array di [tiles]
    public static int GRID_OFFSET = 32;
    //********* attributes *************
    //-------- characters
    public static Protagonist protagonist;
    private BufferedImage[] tileFrames;
    public static Tile tiles[];
    //-------- level stats
    private String levelPath;
    private int currentLevel = 0;
    private int currentScene = 1;
    //*********** constructor *********
    public Level(int initialLevel){
        //********** Load tile frames ********
        tileFrames = new BufferedImage[1];
        try{
            tileFrames[0] = ImageIO.read(getClass().getResource("../Graphics/Images/Tiles/violetT.png"));
        }catch(Exception ex){}
        setCurrentLevel(initialLevel);//nel costruttore definisce il livello di inizio
        loadLevel(initialLevel);
    }
    //********** setting/getting *************
    public int getCurrentLevel(){return this.currentLevel;}
    public int getCurrentScene(){return this.currentScene;}
    public void setCurrentScene(int scene){loadScene(scene);}//set currentscene carica la scena, OVVIO!!
    private void setCurrentLevel(int i){this.currentLevel = i;}
    //*********** operators ***********
    private void loadLevel(int i){
        levelPath = "src/Model/Levels/" + Integer.toString(i);
        loadScene(currentScene);//carichiamo la scena
        //***** load characters ****
        protagonist = new Protagonist(200,200,"protagonist",true,true,100);
    }
    
    private void loadScene(int scene){
        //-------- check and validate the path of scene
        String scenePath = levelPath + "/scene" + Integer.toString(scene) + ".txt";
        //---------- create Tiles
        loadTiles(scenePath);
    }
    private final void loadTiles(String scenePath){//vuol dire carica mattonella
        tiles = new Tile[2000];
        String ThisLine = "";//definisce la riga di testo in cui il ciclo for lo leggera
        BufferedReader reader = null;
        try{//initializza il bufferedReader
             reader = new BufferedReader(new FileReader(scenePath));
        }catch(Exception ex){}
        //----- Tile stats
        int posx = 0;
        int posy = 0;
        int tile_size = 0;
        try{//---- read line by line
            for(int line = 0; (ThisLine = reader.readLine()) != null; line++){
                //----- read word by word
                String[] lineWord = ThisLine.split(" ");//prende questa riga di testo e le splitta in parole
                for (int word = 0; word < lineWord.length; word++){//scorri le parole splittate
                    if (lineWord[word].equalsIgnoreCase("tile")){
                        tiles[tile_size] = new Tile(posx, posy, "tile", true, false);
                        tiles[tile_size].setCurrentFrame(tileFrames[0]);
                        tile_size++;
                    }
                    posx += GRID_OFFSET;//ogni parola letta, si passa al prossimo quadretto
                }
                //------ finito leggere questa riga andiamo a capo
                posx = 0;//reset column
                posy += GRID_OFFSET;//next row
            }
            TILE_SIZE = tile_size;
        }catch(IOException ex){}
    }
}
