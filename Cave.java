package cavedweller;
        
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 801420
 */
public class Cave extends JPanel {
 Caveman cman;
 Bomb bomb, bomb2, bomb3;
 Potion potion, potion2, potion3;
 Door door;
 KillWall wall;
 Timer timer;
 int w = 1366;
 int h = 768;
 public Cave(String username) {
     
     super();
        cman = new Caveman(this);
        bomb = new Bomb(this);
        bomb2 = new Bomb(this);
        bomb3 = new Bomb(this);
        potion = new Potion(this);
        potion2 = new Potion(this);
        potion3 = new Potion(this);
        wall = new KillWall(this);
        door = new Door(this);
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduleTask(), 100, 1000/12);
 }
 
 
 public void checkCollisions() {
     if (cman.bounds.intersects(bomb.bounds)) {
         cman.detonate(bomb);
         bomb.exist = false;
     }
     
     else if (cman.bounds.intersects(bomb2.bounds)) {
         cman.detonate(bomb2);
         bomb2.exist = false;
     }
     
     else if (cman.bounds.intersects(bomb3.bounds)) {
         cman.detonate(bomb3);
         bomb3.exist = false;
     }
     
     else if (cman.bounds.intersects(potion.bounds)){
         cman.drink(potion);
         potion.exist = false;
     }
     
     else if (cman.bounds.intersects(potion2.bounds)){
         cman.drink(potion2);
         potion2.exist = false;
     }
     
     else if (cman.bounds.intersects(potion3.bounds)){
         cman.drink(potion3);
         potion3.exist = false;
     }
     
     //else if (cman.bounds.intersects(wall.bounds)) {
     //    cman.killwall(wall);
     //}
     
     else if (cman.bounds.intersects(door.bounds)) {
         cman.enter(door);
         System.exit(0);
     }
     
    
 }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
           cman.move("right");
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            cman.move("left");
        }
        else if (e.getKeyCode() == KeyEvent.VK_UP) {
            cman.move("up");
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            cman.move("down");
        }
        
        if (e.getKeyCode() == KeyEvent.VK_D) {
           cman.move("right");
        }
        else if (e.getKeyCode() == KeyEvent.VK_A) {
            cman.move("left");
        }
        else if (e.getKeyCode() == KeyEvent.VK_W) {
            cman.move("up");
        }
        else if (e.getKeyCode() == KeyEvent.VK_S) {
            cman.move("down");
        }
        
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
           System.exit(0);  
        }
    }   
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            cman.stop();
        }
            
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            cman.stop();
        }
            
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            cman.stop();
        }
            
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
           cman.stop();
        }
        
        if (e.getKeyCode() == KeyEvent.VK_D) {
            cman.stop();
        }
            
        if (e.getKeyCode() == KeyEvent.VK_A) {
            cman.stop();
        }
            
        if (e.getKeyCode() == KeyEvent.VK_W) {
            cman.stop();
        }
            
        if (e.getKeyCode() == KeyEvent.VK_S) {
           cman.stop();
        }
            
    }
    
    
    private class ScheduleTask extends TimerTask {

        @Override
        public void run() {
            bomb.update();
            door.update();
            //wall.update();
            potion.update();
            cman.update();
            checkCollisions();
            repaint();
        }
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
       if (bomb.exist == true){
           bomb.draw(g);
       }
      if (bomb2.exist == true) {
           bomb2.draw(g);
       }
      if (bomb3.exist == true) {
           bomb3.draw(g);
        }
            door.draw(g);
        
        //wall.draw(g);
        
      if (potion.exist == true) {
            potion.draw(g);
        }
        if (potion2.exist == true) {
            potion2.draw(g);
        }
      if (potion3.exist == true) {
            potion3.draw(g);
        }
        cman.draw(g);
    }
 }
