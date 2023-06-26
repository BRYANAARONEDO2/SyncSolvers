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
     * super.setCamera(player);
     */
    private void prepare()
    {
        GreenfootImage temp = new GreenfootImage(getBackground().getWidth(), getBackground().getWidth());
        temp.setColor(greenfoot.Color.GRAY);
        temp.fill();
        setBackground(temp);
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
        ground2.setLocation(453,269);
        wall.setLocation(430,282);
        ground2.setLocation(470,279);
        Ground ground3 = new Ground(50);
        addObject(ground3,661,196);
        ground3.setLocation(632,240);

        Ground ground4 = new Ground();
        addObject(ground4,869,290);
        Ground ground5 = new Ground();
        addObject(ground5,1202,276);
        Ground ground6 = new Ground();
        addObject(ground6,1014,458);
        Ground ground7 = new Ground();
        addObject(ground7,1307,409);
        Ground ground8 = new Ground();
        addObject(ground8,1450,336);
        Ground ground9 = new Ground();
        addObject(ground9,829,585);
        Ground ground10 = new Ground();
        addObject(ground10,1133,669);
        Ground ground11 = new Ground();
        addObject(ground11,1362,589);
        ground11.setLocation(1415,603);
        Ground ground12 = new Ground();
        addObject(ground12,1604,543);
        Wall wall3 = new Wall();
        addObject(wall3,1804,478);
        Ground ground13 = new Ground();
        addObject(ground13,1726,731);
        Ground ground14 = new Ground();
        addObject(ground14,1896,872);
        Ground ground15 = new Ground();
        addObject(ground15,1657,829);
        ground15.setLocation(1659,799);
        Ground ground16 = new Ground();
        addObject(ground16,1399,890);
        Wall wall4 = new Wall();
        addObject(wall4,1641,709);
        wall4.setLocation(1648,651);

        ground16.setLocation(1455,864);
        ground16.setLocation(1528,835);
        
        Ground ground17 = new Ground(30);
        addObject(ground17,440,221);
        ground17.setLocation(430,229);
        
        super.setCamera(player);
    }
}
