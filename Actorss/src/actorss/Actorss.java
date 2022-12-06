/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actorss;

import static actorss.hero.ajith;
import static actorss.hero.vijay;

/**
 *
 * @author ADAMSEN BRANAY
 */
public class Actorss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
       hero.ajith= new hero();
       hero.vijay= new hero();
       
       ajith.name="Ajith";
       vijay.name="Vijay";
       
       ajith.age=50;
       vijay.age=48;
       
       ajith.acting();
       vijay.dancing();
       ajith.awards();
       
       
       
       
       
       
    }
    
}
