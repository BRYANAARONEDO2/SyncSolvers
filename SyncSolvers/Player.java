import greenfoot.*;

public class Player extends Entity {
    private static final int SPEED = 5;
    private static final int GRAVITY = 1;
    private static final int MAX_JUMP_HEIGHT = 10;
    private int velocity = 0;
    private int jumpCont = 0;
    private boolean jump = false;
    private boolean toLeft = false;
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
            this.toLeft = true;
            dx -= SPEED;
        }
        if (Greenfoot.isKeyDown("right")) {
            this.toLeft = false;
            dx += SPEED;
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
    
        Entity gdBlock = (Entity) getOneIntersectingObject(Ground.class);
    
        if (gdBlock != null) {
            if (velocity > 0 && gdBlock.getY() > getY()) {
                setLocation(getX(), gdBlock.getY() - getHeight() + 6);
                velocity = 0;
                jump = false;
                inGround = true;
            }
            if (velocity < 0 && gdBlock.getY() < getY()) {
                setLocation(getX(), gdBlock.getY() + gdBlock.getHeight());
                velocity = 0;
                jump = false;
                inGround = false;
            }
        } else {
            inGround = false;
        }
        
        Entity wlBlock = (Entity) getOneIntersectingObject(Wall.class);
    
        if (wlBlock != null) {
            // Colisión con paredes (horizontal)
                int playerLeft = getX();
                int playerRight = getX() + getWidth();
                int blockLeft = wlBlock.getX();
                int blockRight = wlBlock.getX() + wlBlock.getWidth();
                System.out.print("Colision horizontal - ");
                
                if (playerRight >= blockLeft && !toLeft) {
                    System.out.println("derecha");
                    setLocation(blockLeft - getWidth(), getY());
                }
                if (playerLeft <= blockRight && toLeft) {
                    System.out.println("izquierda");
                    setLocation(blockRight , getY());
                }
        }
    
        if (!inGround) {
            setLocation(getX(), getY() + velocity);
        }
    }


}
