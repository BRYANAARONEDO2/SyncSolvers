import greenfoot.*;  // Import Greenfoot classes

public class Entity extends Actor {
    private int width;
    private int height;
    private Color HitBoxColor = new Color(255,0,0,0);
    private boolean ShowHitBox = true;
    private GreenfootImage texture;

    public Entity() {
        this.width = 10;
        this.height = 20;
        drawEntity();
    }
    
    public Entity(int width, int height) {
        this.width = width;
        this.height = height;
        drawEntity();
    }
    
    private void drawEntity() {
        GreenfootImage image = new GreenfootImage(width, height);
        if (ShowHitBox) HitBoxColor = new Color(255,0,0,255);
        image.setColor(HitBoxColor);
        image.drawRect(0, 0, width - 1, height - 1);
        setImage(image);
    }
    
    public int getHeight(){
        return this.height;
    }
    
    public int getWidth(){
        return this.width;
    }

    public void act() {
    }
}
