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
        tileFrames = new BufferedImage[16];
        try{
            for (int i = 0; i < tileFrames.length; i++){
                tileFrames[i] = ImageIO.read(getClass().getResource("../Graphics/Images/Tiles/" + Integer.toString(i+1) + ".png"));
            }
            
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
    }
    
    private void loadScene(int scene){
        //-------- check and validate the path of scene
        String scenePath = levelPath + "/scene" + Integer.toString(scene) + ".txt";
        //---------- create Tiles
        loadTiles(scenePath);
        //------- load protagonist
        protagonist = new Protagonist(200,200,"protagonist",true,true,100);
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
                    switch(lineWord[word]){
                        case "1":{
                            tiles[tile_size] = new Tile(posx, posy, "tile", true, false);
                            tiles[tile_size].setCurrentFrame(tileFrames[0]);
                            tile_size++;
                            break;
                        }
                        case "2":{
                            tiles[tile_size] = new Tile(posx, posy, "tile", true, false);
                            tiles[tile_size].setCurrentFrame(tileFrames[1]);
                            tile_size++;
                            break;
                        }
                        case "3":{
                            tiles[tile_size] = new Tile(posx, posy, "tile", true, false);
                            tiles[tile_size].setCurrentFrame(tileFrames[2]);
                            tile_size++;
                            break;
                        }
                        case "4":{
                            tiles[tile_size] = new Tile(posx, posy, "tile", true, false);
                            tiles[tile_size].setCurrentFrame(tileFrames[3]);
                            tile_size++;
                            break;
                        }
                        case "5":{
                            tiles[tile_size] = new Tile(posx, posy, "tile", true, false);
                            tiles[tile_size].setCurrentFrame(tileFrames[4]);
                            tile_size++;
                            break;
                        }
                        case "6":{
                            tiles[tile_size] = new Tile(posx, posy, "tile", true, false);
                            tiles[tile_size].setCurrentFrame(tileFrames[5]);
                            tile_size++;
                            break;
                        }
                        case "7":{
                            tiles[tile_size] = new Tile(posx, posy, "tile", true, false);
                            tiles[tile_size].setCurrentFrame(tileFrames[6]);
                            tile_size++;
                            break;
                        }
                        case "8":{
                            tiles[tile_size] = new Tile(posx, posy, "tile", true, false);
                            tiles[tile_size].setCurrentFrame(tileFrames[7]);
                            tile_size++;
                            break;
                        }
                        case "9":{
                            tiles[tile_size] = new Tile(posx, posy, "tile", true, false);
                            tiles[tile_size].setCurrentFrame(tileFrames[8]);
                            tile_size++;
                            break;
                        }
                        case "10":{
                            tiles[tile_size] = new Tile(posx, posy, "tile", true, false);
                            tiles[tile_size].setCurrentFrame(tileFrames[9]);
                            tile_size++;
                            break;
                        }
                        case "11":{
                            tiles[tile_size] = new Tile(posx, posy, "tile", true, false);
                            tiles[tile_size].setCurrentFrame(tileFrames[10]);
                            tile_size++;
                            break;
                        }
                        case "12":{
                            tiles[tile_size] = new Tile(posx, posy, "tile", true, false);
                            tiles[tile_size].setCurrentFrame(tileFrames[11]);
                            tile_size++;
                            break;
                        }
                        case "13":{
                            tiles[tile_size] = new Tile(posx, posy, "tile", true, false);
                            tiles[tile_size].setCurrentFrame(tileFrames[12]);
                            tile_size++;
                            break;
                        }
                        case "14":{
                            tiles[tile_size] = new Tile(posx, posy, "tile", true, false);
                            tiles[tile_size].setCurrentFrame(tileFrames[13]);
                            tile_size++;
                            break;
                        }
                        case "15":{
                            tiles[tile_size] = new Tile(posx, posy, "tile", true, false);
                            tiles[tile_size].setCurrentFrame(tileFrames[14]);
                            tile_size++;
                            break;
                        }
                        case "16":{
                            tiles[tile_size] = new Tile(posx, posy, "tile", true, false);
                            tiles[tile_size].setCurrentFrame(tileFrames[15]);
                            tile_size++;
                            break;
                        }
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
