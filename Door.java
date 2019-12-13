package cavedweller;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 801420
 */
public class Door {
    private int x, y, height, width;
    public Rectangle bounds;
    private Color color;

    
    public Door(Cave cave) {
        this.x = (int)(Math.random() * cave.w);
        this.y = (int)(Math.random() * cave.h);
        this.height = 50;
        this.width = 50;
       this.bounds = new Rectangle(this.x, this.y, this.width, this.height);
        this.color = Color.RED;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public Rectangle getBounds() {
        return bounds;
    }
    
    public void draw(Graphics g) {
        g.setColor(this.color);
        Graphics2D g2d = (Graphics2D) g;
        g2d.fill(bounds);
    }
    
    public void update() {
        this.bounds = new Rectangle(this.x, this.y, this.width, this.height);
    }
}
 