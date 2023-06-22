import greenfoot.*;  // Import Greenfoot classes

public class Entity extends Actor {
    private int width;
    private int height;
    private Color color = Color.RED;
    private boolean visible;

    public Entity() {
        this.width = 10;
        this.height = 20;
        this.visible = true;
        drawEntity();
    }
    
    public Entity(int width, int height, boolean visible) {
        this.width = width;
        this.height = height;
        this.visible = visible;
        drawEntity();
    }
    
    private void drawEntity() {
        GreenfootImage image = new GreenfootImage(width, height);
        if (visible) {
            image.setColor(color);
            image.fillRect(0, 0, width - 1, height - 1);
        } else {
            image.setColor(Color.RED);
            image.drawRect(0, 0, width - 1, height - 1);
        }
        setImage(image);
    }
    
    public int getHeight(){
        return this.height;
    }
    
    public int getWidth(){
        return this.width;
    }
    
    public boolean collidesWith(Actor actor) {
        return getOneIntersectingObject(actor.getClass()) != null;
    }
    
    public boolean collidesWith(Class<?> clazz) {
        return getOneIntersectingObject(clazz) != null;
    }

    public void updatePosition(Entity entity) {
        setLocation(entity.getX(), entity.getY());
    }

    public void act() {
    }
}
