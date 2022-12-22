/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package director;

/**
 *
 * @author ADAMSEN BRANAY
 */
public class Director {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        music anirudh = new music();
        music yuvan = new music();
        
        anirudh.name = "ANIRUDH";
        yuvan.name = "YUVAN"; 
        
        anirudh.model ="RAP SONGS";
        yuvan.model = "MELODY SONGS";
        
        anirudh.age =30;
        yuvan.age = 45;
        
        anirudh.albumsongs();
        yuvan.lovesong();
        
    }
    
}
