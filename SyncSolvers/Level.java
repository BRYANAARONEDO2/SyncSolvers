import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends World
{

    private double scaleFactor = 1.0;  // Factor de escala inicial
    private int originalWidth;  // Ancho original del escenario
    private int originalHeight;  // Altura original del escenario
    private Camera camera;
    
    /**
     * Constructor for objects of class Level.
     * 
     */
    
    public void setCamera(Actor a){
        this.camera = new Camera(this, a);
        Greenfoot.setWorld(new Camera(this, getObjects(Player.class).get(0)));
    }
    
    public Camera getCamera(){
        return this.camera;
    }
    
    public Level()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(2000, 1200, 1);
        
    }

}
