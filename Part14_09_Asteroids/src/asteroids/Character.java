/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroids;
 
import javafx.geometry.Point2D;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;
import javafx.scene.paint.Color;
 
/**
 *
 * @author chloe
 */
public abstract class Character {
 
    //instance variables
    private Polygon character;
    private Point2D movement;
    boolean status;
    boolean collided;
 
    //constructor
    public Character(Polygon polygon, int x, int y) {
        this.character = polygon;
        this.character.setTranslateX(x);
        this.character.setTranslateY(y);
        this.movement = new Point2D(0, 0);
        this.status = true;
        this.collided = false;
    }
 
    //method
    public Polygon getCharacter() {
        return character;
    }
 
    public void turnLeft() {
        this.character.setRotate(this.character.getRotate() - 5);
    }
 
    public void turnRight() {
        this.character.setRotate(this.character.getRotate() + 5);
    }
 
    public void move() {
        this.character.setTranslateX(this.character.getTranslateX() + this.movement.getX());
        this.character.setTranslateY(this.character.getTranslateY() + this.movement.getY());
 
        if (this.character.getTranslateX() < 0) {
            this.character.setTranslateX(this.character.getTranslateX() + AsteroidsApplication.width);
        }
 
        if (this.character.getTranslateX() > AsteroidsApplication.width) {
            this.character.setTranslateX(this.character.getTranslateX() % AsteroidsApplication.width);
        }
 
        if (this.character.getTranslateY() < 0) {
            this.character.setTranslateY(this.character.getTranslateY() + AsteroidsApplication.height);
        }
 
        if (this.character.getTranslateY() > AsteroidsApplication.height) {
            this.character.setTranslateY(this.character.getTranslateY() % AsteroidsApplication.height);
        }
    }
 
    public void accelerate() {
        double changeX = Math.cos(Math.toRadians(this.character.getRotate()));
        double changeY = Math.sin(Math.toRadians(this.character.getRotate()));
 
        changeX *= 0.05;
        changeY *= 0.05;
 
        this.movement = this.movement.add(changeX, changeY);
    }
 
    public boolean collide(Character other) {
        Shape collisionArea = Shape.intersect(this.character, other.getCharacter());
 
        if ((collisionArea.getBoundsInLocal().getWidth() != -1) == true) {
            this.collided = true;
        }
        return collisionArea.getBoundsInLocal().getWidth() != -1;
    }
 
    public boolean getCollidedStatus() {
        return this.collided;
    }
 
    public void setCollidedStatus(Boolean value) {
        this.collided = value;
    }
 
    public Point2D getMovement() {
        return this.movement;
    }
 
    public void setMovement(Point2D newMovement) {
        this.movement = newMovement;
    }
 
    public void setAlive(Boolean status) {
        this.status = status;
    }
 
    public boolean isAlive() {
        return this.status;
    }
 
    public void resetPosition(int x, int y) {
        this.character.setTranslateX(x);
        this.character.setTranslateY(y);
    }
 
    public void setColor(Color color) {
        this.character.setFill(color);
    }
 
}