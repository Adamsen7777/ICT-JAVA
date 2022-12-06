/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animal_project;

/**
 *
 * @author ADAMSEN BRANAY
 */
public class Animal_project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        animals lion = new animals();
        animals tiger= new animals();
        animals cheetah = new animals();
        
        lion.name= "LION";
        tiger.name="TIGER";
        cheetah.name= "CHEETAH";
        
        lion.speed= 80;
        tiger.speed=65;
        cheetah.speed=130;
        
        lion.animalspeed();
        tiger.animalspeed();
        cheetah.animalspeed();
       
        
        
        
    }
    
}
