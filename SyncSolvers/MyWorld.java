import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Block block = new Block(600, 10);
        addObject(block,303,361);
        Player player = new Player();
        addObject(player,299,156);
        Block block2 = new Block(250, 10);
        addObject(block2,391,256);
        block.setLocation(455,369);
        block2.setLocation(514,275);
        block.setLocation(318,400);
        block2.setLocation(307,289);
        block2.setLocation(396,259);
        block2.setLocation(341,334);
    }
}
