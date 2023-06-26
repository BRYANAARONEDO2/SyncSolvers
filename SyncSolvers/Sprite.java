import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sprite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sprite extends Actor
{
    private Entity asoc;
    private double scale;
    private boolean isDrawed = false;
    
    Sprite(GreenfootImage img, Entity e, double scale){
        this.asoc = e;
        this.scale = scale;
        img.scale(((int)((double)e.getWidth() * scale)), ((int)((double)e.getHeight() * scale)));
        setImage(img);
    }
    
    Sprite(GreenfootImage img, double scale){
        this.scale = scale;
        img.scale(((int)((double)img.getWidth() * scale)), ((int)((double)img.getHeight() * scale)));
        setImage(img);
    }
    
    public void act()
    {
        // Add your action code here.
        setLocation(this.asoc.getX(), this.asoc.getY());
    }
}
