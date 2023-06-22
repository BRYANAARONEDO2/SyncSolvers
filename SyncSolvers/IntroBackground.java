import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IntroBackground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IntroBackground extends MyWorld
{

   public IntroBackground(){
        prepare();
        
    }
    private void prepare()
    {
        Planeta p = new Planeta();
        addObject(p,283,206);        
    }
}
