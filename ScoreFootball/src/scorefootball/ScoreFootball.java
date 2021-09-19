/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorefootball;

import java.util.Scanner;

/**
 *
 * @author bossa
 */
public class ScoreFootball {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyPropertyBean myScore = new MyPropertyBean();
        P1 p1 = new P1();
        P2 p2 = new P2();
        myScore.addScore(p1);
        myScore.addScore(p2);
        
        Scanner sc = new Scanner(System.in);
        
        String tmp = sc.nextLine();
        
        while(!(tmp.equals(""))){
            myScore.setScore(tmp);
            tmp = sc.nextLine();
        }
        
    }
    
}
