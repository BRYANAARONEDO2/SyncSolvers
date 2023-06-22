import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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

        Ground ground = new Ground(500, 10);
        addObject(ground,180,312);
        ground.setLocation(300,353);
        Ground ground2 = new Ground(200, 10);
        addObject(ground2,346,238);
        ground2.setLocation(423,309);
        Ground ground3 = new Ground(200, 10);
        addObject(ground3,143,269);
        ground3.setLocation(161,263);
        Wall wall = new Wall(10, 100);
        addObject(wall,182,196);
        wall.setLocation(453,270);
        Wall wall2 = new Wall(10, 100);
        addObject(wall2,121,305);
        wall2.setLocation(75,307);
        wall2.setLocation(169,302);
        Ground ground4 = new Ground(20, 10);
        addObject(ground4,55,314);
        ground4.setLocation(26,309);
        Ground ground5 = new Ground(300, 10);
        addObject(ground5,298,133);
        ground5.setLocation(321,205);
        Wall wall3 = new Wall(10, 100);
        addObject(wall3,417,155);
        wall3.setLocation(313,158);
        Ground ground6 = new Ground(20, 10);
        addObject(ground6,281,166);
        ground6.setLocation(267,159);
        Player player = new Player();
        addObject(player,490,330);
    }
}
