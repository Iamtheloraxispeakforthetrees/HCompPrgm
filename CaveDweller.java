
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 801420
 */
public class CaveDweller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("What is your caveman's name?");
        String username = kb.nextLine();
        Cave cave = new Cave(username);
        String prompt = "";
        while(!prompt.equals("close")) {
            prompt = kb.nextLine();
            cave.processPrompt(prompt);
        }
    }
    
}
