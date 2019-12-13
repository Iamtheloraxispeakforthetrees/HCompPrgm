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
public class KillWall {
    private final int strength;
    private int height, width;
    public Rectangle bounds;
  private Color color;
  public boolean exist = true;
    
    KillWall (Cave cave) {
        this.strength = 100;
        this.height = cave.w;
        this.width = cave.h;
        this.color =  Color.BLACK;
        this.bounds = new Rectangle(this.height, this.width);
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
        this.bounds = new Rectangle(this.width, this.height);
    }
    
 public int getStrength() {
    return strength;
}
 
}
