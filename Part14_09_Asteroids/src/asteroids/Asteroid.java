/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroids;
 
import java.util.Random;
 
/**
 *
 * @author chloe
 */
public class Asteroid extends Character {
 
    private double rotationMovement;
 
    public Asteroid(int x, int y) {
        super(new PolygonFactory().createPolygon(), x, y);
 
        Random random = new Random();
 
        super.getCharacter().setRotate(random.nextInt(360));
 
        int accelerationAmount = 1 + random.nextInt(10);
 
        for (int i = 0; i < accelerationAmount; ++i) {
            accelerate();
        }
        this.rotationMovement = 0.5 + random.nextDouble();
    }
    
    @Override
    public void move() {
        super.move();
        super.getCharacter().setRotate(super.getCharacter().getRotate() + rotationMovement);
    }
    
    public void setRotation(int number) {
        this.rotationMovement = number;
    }
    
}