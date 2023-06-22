import greenfoot.*;

public class Player extends Entity {
    private static final int horizontalSpeed = 5;
    private static final int gravity = 1;
    private static final int maxJumpHeight = 10;
    private int verticalSpeed = 0;
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
    
        Entity gdBlock = (Entity) getOneIntersectingObject(Ground.class);
    
        if (gdBlock != null) {
            if (verticalSpeed > 0 && gdBlock.getY() > getY()) {
                setLocation(getX(), gdBlock.getY() - getHeight() + 6);
                verticalSpeed = 0;
                jump = false;
                inGround = true;
            }
            if (verticalSpeed < 0 && gdBlock.getY() < getY()) {
                setLocation(getX(), gdBlock.getY() + gdBlock.getHeight());
                verticalSpeed = 0;
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
            setLocation(getX(), getY() + verticalSpeed);
        }
    }


}
