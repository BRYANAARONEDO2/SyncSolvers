import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import camera.*;

/**
 * Write a description of class TestLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestLevel extends Level
{

    /**
     * Constructor for objects of class TestLevel.
     * 
     */
    public TestLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super();
        prepare();
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Ground ground = new Ground(700);
        addObject(ground,302,291);
        ground.setLocation(310,335);
        Player player = new Player();
        addObject(player,0,0);
        player.setLocation(241,167);
        player.setLocation(283,281);
        Ground ground2 = new Ground(200);
        addObject(ground2,379,206);
        ground2.setLocation(441,238);
        ground2.setLocation(400,252);
        Wall wall = new Wall(100);
        addObject(wall,428,282);
        wall.setLocation(441,291);
        Wall wall2 = new Wall(100);
        addObject(wall2,102,293);
        super.setCamera(player);
        super.getCamera().zoomIn(2);
    }
}
