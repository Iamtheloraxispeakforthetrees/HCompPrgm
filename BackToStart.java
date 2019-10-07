/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 801420
 */
public class BackToStart {
    private int x, y;
    
    public BackToStart(Cave cave) {
        this.x = (int)(Math.random() * cave.getWidth());
        this.y = (int)(Math.random() * cave.getHeight());
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
}
