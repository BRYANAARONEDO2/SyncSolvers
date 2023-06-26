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
    private boolean fixedToButton = true;
    private GreenfootImage imgLocal;
    
    Sprite(GreenfootImage img, Entity e, double scale){
        this.asoc = e;
        this.imgLocal = img;
        this.scale = e.getHeight() / img.getHeight() + scale;
        img.scale(((int)((double)e.getWidth() * scale)), ((int)((double)e.getHeight() * scale)));
        //img.scale(((int)((double)img.getWidth() * scale)), ((int)((double)img.getHeight() * scale)));
        setImage(img);
    }
    
    Sprite(GreenfootImage img, double scale){
        this.scale = scale;
        this.imgLocal = img;
        img.scale(((int)((double)img.getWidth() * scale)), ((int)((double)img.getHeight() * scale)));
        setImage(img);
    }
    
    public void updateSprite(GreenfootImage img){
        //img.scale(((int)((double)this.asoc.getWidth() * this.scale)), ((int)((double)this.asoc.getHeight() * this.scale)));
        this.imgLocal = img;
        img.scale(((int)((double)img.getWidth() * scale)), ((int)((double)img.getHeight() * scale)));
        setImage(img);
    }
    
    public void act()
    {
        // Add your action code here.
        
        if(this.fixedToButton){
            setLocation(this.asoc.getX(), this.asoc.getBotton() - this.imgLocal.getHeight() / 2);
        }else{
            setLocation(this.asoc.getX(), this.asoc.getY());
        }
        
    }
    
}
