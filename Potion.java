/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 801420
 */
public class Potion {
    
    private int x, y;
    private final int strength;
    
    public Potion(Cave cave) {
        this.x = (int)(Math.random() * cave.getWidth());
        this.y = (int)(Math.random() * cave.getHeight());
        this.strength = (int)(Math.random() * 100);
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public int getStrength() {
        return strength;
    }
}
