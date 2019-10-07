/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 801420
 */
public class Cave {
 private Caveman cman;
 private Bomb bomb, bomb2, bomb3;
 private Potion potion, potion2, potion3;
 private int width, height;
 private final int MAX_WIDTH = 10, MAX_HEIGHT = 10;
 private Door door;
 private KillWall wall;
 private BackToStart bts;
 
 public Cave(String username) {
     this.width = (int) (Math.random() * MAX_WIDTH);
     this.height = (int) (Math.random() * MAX_HEIGHT);
     door = new Door(this);
     cman = new Caveman(username, this);
     bomb = new Bomb(this);
     bomb2 = new Bomb(this);
     bomb3 = new Bomb(this);
     potion = new Potion(this);
     potion2 = new Potion(this);
     potion3 = new Potion(this);
     wall = new KillWall(this);
     bts = new BackToStart(this);
 }
 
 public int getWidth() {
     return width;
 }
 
 public int getHeight() {
     return height;
 }
 
 public void checkCollisions() {
     if (cman.getX() == bomb.getX() && cman.getY() == bomb.getY()) {
         cman.detonate(bomb);
     }
     
     else if (cman.getX() == bomb2.getX() && cman.getY() == bomb2.getY()) {
         cman.detonate(bomb);
     }
     
     else if (cman.getX() == bomb3.getX() && cman.getY() == bomb3.getY()) {
         cman.detonate(bomb);
     }
     
     else if (cman.getX() == potion.getX() && cman.getY() == potion.getY()){
         cman.drink(potion);
     }
     
     else if (cman.getX() == potion2.getX() && cman.getY() == potion2.getY()){
         cman.drink(potion);
     }
     
     else if (cman.getX() == potion3.getX() && cman.getY() == potion3.getY()){
         cman.drink(potion);
     }
     
     else if (cman.getX() == width) {
         cman.killwall(wall);
     }
     
     else if (cman.getX() == -width) {
         cman.killwall(wall);
     }
     
     else if (cman.getY() == height) {
         cman.killwall(wall);
     }
     
     else if (cman.getY() == -height) {
         cman.killwall(wall);
     }
     
     else if (cman.getX() == door.getX() && cman.getY() == door.getY()) {
         cman.enter(door);
         System.exit(0);
     }
     
     else if (cman.getX() == bts.getX() && cman.getY() == bts.getY()) {
         cman.moveback(bts);
         cman.move(0, 0);
     }
 }
 
 public void processPrompt(String prompt) {
     if (prompt.equals("right")) {
         cman.move(1,0);
     }
     else if (prompt.equals("left")) {
         cman.move(-1,0);
     }
     else if (prompt.equals("forward")) {
         cman.move(0,1);
     }
     else if (prompt.equals("back")) {
         cman.move(0,-1);
     }
     checkCollisions();
 }
 
}
