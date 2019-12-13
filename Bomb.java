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
public class Bomb {
  public int x, y, vx, vy, height, width;
  private final int strength;
  public Rectangle bounds;
  private Color color;
  public boolean exist = true;
  
  Bomb (Cave cave) {
      this.x = (int)(Math.random() * cave.w);
      this.y = (int)(Math.random() * cave.h);
      this.height = 45;
      this.width = 45;
      this.strength = (int)(Math.random() * 100);
      this.color = Color.darkGray;
      this.bounds = new Rectangle(this.x, this.y, this.width, this.height);
  }
  
  public int getX(){
      return x;
  }
  
  public Rectangle getBounds() {
        return bounds;
    }
  
  public int getY() {
      return y;
  }
  
  public int getStrength() {
      return strength;
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
