import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Block here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Block extends Entity {
    public Block(int width, int height) {
        super(width, height);
    }
    
    public Block(int width) {
        super(width, width);
    }
    
    public int verticalHitbox(Player player){
        
        return 1;
    }
    
    public void act() {
        // Code for acting can go here
    }
}
