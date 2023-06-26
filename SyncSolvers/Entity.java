import greenfoot.*;  // Import Greenfoot classes
import greenfoot.World;

public class Entity extends Actor {
    private int width;
    private int height;
    private Color HitBoxColor = new Color(255,0,0,0);
    private boolean ShowHitBox = true;
    private Sprite texture;
    private boolean isDrawed = false;

    public Entity(GreenfootImage img, int widthOfHitbox, double scale, boolean ShowHitbox) {
        this.ShowHitBox = ShowHitbox;
        double tmp = (double)img.getHeight() / (double)img.getWidth(); 
        this.width = widthOfHitbox;
        this.height = (int)((double)widthOfHitbox * tmp);
        img.scale(this.width, this.height);
        this.texture = new Sprite(img, this, scale);
        drawEntity();
    }
    
    public Entity(int width, int height) {
        this.width = width;
        this.height = height;
        drawEntity();
    }
    
    public void drawEntity() {
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
    
    public void setTop(int y){
        setLocation(getX(), y + this.getHeight() / 2);
    }
    
    public int getTop(){
        return getY() - this.getHeight() / 2;
    }
    
    public void setLeft(int x){
        setLocation(x + this.getHeight() / 2, getY());
    }
    
    public int getLeft(){
        return getX() - this.getHeight() / 2;
    }

    public void setBotton(int y){
        setLocation(getX(), y - this.getHeight() / 2);
    }
    
    public int getBotton(){
        return getY() + this.getHeight() / 2;
    }
    
    public void setRight(int x){
        setLocation(x - this.getHeight() / 2, getY());
    }
    
    public int getRight(){
        return getX() + this.getHeight() / 2;
    }
    
    public void drawTexture(){
        this.getWorld().addObject(this.texture, 0, 0);
    }
    
    public void act() {
        if (!isDrawed) {
            this.drawTexture();
            isDrawed = true;
        }
    }
}
