import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IntroBackground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IntroMenu extends World
{

   public IntroMenu(){
       super(600, 400, 1); 
       prepare();
        
    }
    private void prepare()
    {
        Planeta p = new Planeta();
        addObject(p,283,206);        
        Actor pb = new PlayButton();
        addObject(pb,283,206); 
        if(Greenfoot.mouseClicked(pb)){
            SubWorlds worldmenu = new SubWorlds();
            Greenfoot.setWorld(worldmenu);
        }
    }
}
