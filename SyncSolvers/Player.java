import greenfoot.*;

public class Player extends Entity {
    private static final int SPEED = 5;
    private static final int GRAVITY = 1;
    private static final int MAX_JUMP_HEIGHT = 10;
    private int velocity = 0;
    private int jumpCont = 0;
    private boolean jump = false;
    private boolean inGround = false;

    public void act() {
        super.act();
        
        applyGravity();
        checkJump();
        handleMovement();
        handleCollision();
    }
    
    private void applyGravity() {
        if (!inGround) {
            velocity += GRAVITY;
        }
        
        if (jump && velocity >= 0) {
            jump = false; // Stop the jump if it reaches the maximum height
        }
    }
    
    private void checkJump() {
        if (Greenfoot.isKeyDown("up") && inGround) {
            jumpCont = MAX_JUMP_HEIGHT;
            jump = true;
            inGround = false;
            velocity = -MAX_JUMP_HEIGHT;
        }
    }
    
    private void handleMovement() {
        int dx = 0;
        if (Greenfoot.isKeyDown("left")) {
            dx -= SPEED;
        }
        if (Greenfoot.isKeyDown("right")) {
            dx += SPEED;
        }
        setLocation(getX() + dx, getY());
    }
    
    private void handleCollision() {
        
        if(jump && jumpCont > 0){
            jumpCont--;
        }
        
        if(jumpCont == 0){
            jump = false;
        }
        
        Entity block = (Entity) getOneIntersectingObject(Block.class);
        
        if (block != null) {
            if (velocity > 0) {
                setLocation(getX(), block.getY() - getHeight()/2);
                velocity = 0;
                jump = false;
                inGround = true;
            }
        }else{
            inGround = false;
        }
        if(!inGround)
            setLocation(getX(), getY() + velocity);
    }

}
