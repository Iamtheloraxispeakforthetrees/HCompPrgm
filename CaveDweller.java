package cavedweller;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cavedweller.Cave;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;



/**
 *
 * @author 801420
 */
public class CaveDweller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame j = new JFrame("Cave Dweller");
        Cave c = new Cave("Cave");
        j.add(c);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(1366, 768);
        j.setVisible(true);
        j.setLocationRelativeTo(null);
j.addKeyListener(new KeyAdapter() {  
            @Override
            public void keyPressed(KeyEvent e) {
                c.keyPressed(e);
            }
            @Override
            public void keyReleased(KeyEvent e) {
                c.keyReleased(e);
            }
  
        });
    }
    }
