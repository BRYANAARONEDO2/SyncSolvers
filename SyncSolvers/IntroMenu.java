import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IntroBackground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IntroMenu extends World
{
    PlayButton pb = new PlayButton();
   public IntroMenu(){
       
         
       super(600, 400, 1); 
       prepare();
        
    }
    private void prepare()
    {
        Planeta p = new Planeta();
        addObject(p,283,206);        
        addObject(pb,283,206);
       
    }
    public void act(){
        if(Greenfoot.mouseClicked(pb)){
            SubWorlds worldmenu = new SubWorlds();
            Greenfoot.setWorld(worldmenu);
        }
    }
}
