import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScreenEffect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScreenEffect extends Actor
{
    private String color = "Black";
    private int intensidad;
    private int velocidad;
    /**
     * Act - do whatever the ScreenEffect wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected ScreenEffect(){
        
    }
    
    protected ScreenEffect(String c, int i , int v){
        this.color = c;
        this.intensidad = i;
        this.velocidad = v;
    }
    
    public void setColor(String c){
        this.color = c;
    }
    
     public void setIntensidad(int i){
        this.intensidad = i;
    }
    
    public void setVelocidad(int v){
        this.velocidad = v;
    }
    
    public String getColor(){
        return this.color;
    }
    
     public int getIntensidad(){
        return this.intensidad;
    }
    
    public int getVelocidad(){
        return this.velocidad;
    }
    
    
}
