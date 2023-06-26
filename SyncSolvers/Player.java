import greenfoot.*;

public class Player extends Entity {
    private static final int horizontalSpeed = 5;
    private static final int gravity = 1;
    private static final int maxJumpHeight = 15;
    private int verticalSpeed = 0;
    private int jumpCont = 0;
    private boolean jump = false;
    private boolean toLeft = false;
    private boolean inGround = false;
    
    Player(){
        super(new GreenfootImage("jugador 1.png"), 50, 1, true);
    }

    public void act() {
        super.act();
        
        applyGravity();
        checkJump();
        handleMovement();
        handleCollision();
    }
    
    private void applyGravity() {
        if (!inGround) {
            verticalSpeed += gravity;
        }
        
        if (jump && verticalSpeed >= 0) {
            jump = false; // Stop the jump if it reaches the maximum height
        }
    }
    
    private void checkJump() {
        if (Greenfoot.isKeyDown("up") && inGround) {
            jumpCont = maxJumpHeight;
            jump = true;
            inGround = false;
            verticalSpeed = -maxJumpHeight;
        }
    }
    
    private void handleMovement() {
        int dx = 0;
        if (Greenfoot.isKeyDown("left")) {
            this.toLeft = true;
            dx -= horizontalSpeed;
        }
        if (Greenfoot.isKeyDown("right")) {
            this.toLeft = false;
            dx += horizontalSpeed;
        }
        setLocation(getX() + dx, getY());
    }
    
    private void handleCollision() {
        if (jump && jumpCont > 0) {
            jumpCont--;
        }
    
        if (jumpCont == 0) {
            jump = false;
        }
        
        Entity wlBlock = (Entity) getOneIntersectingObject(Wall.class);
    
        if (wlBlock != null) {
            // Colisión con paredes (horizontal)
                if(this.getX() <= wlBlock.getX()){
                    toLeft = false;
                }else{
                    toLeft = true;
                }
                if(this.getLeft() > wlBlock.getLeft() && !toLeft){
                    this.setLeft(wlBlock.getLeft() - 1);
                }
                if(this.getRight() < wlBlock.getRight() && toLeft){
                    this.setRight(wlBlock.getRight() + 2);
                }
        }
    
        Entity gdBlock = (Entity) getOneIntersectingObject(Ground.class);
    
        if (gdBlock != null) {
            if (verticalSpeed > 0 && gdBlock.getTop() > getTop()) {
                setTop(gdBlock.getTop() - getHeight() + 1);
                verticalSpeed = 0;
                jump = false;
                inGround = true;
            }
            if (verticalSpeed < 0 && gdBlock.getTop() < getTop() + getHeight() - 1) {
                setTop(gdBlock.getTop() + gdBlock.getHeight());
                verticalSpeed = 0;
                jump = false;
                inGround = false;
            }
        }else{
            inGround = false;
        }
        
        
    
        if (!inGround) {
            setLocation(getX(), getY() + verticalSpeed);
        }
    }


}
