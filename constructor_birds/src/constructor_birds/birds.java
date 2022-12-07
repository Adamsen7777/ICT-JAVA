/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructor_birds;

/**
 *
 * @author ADAMSEN BRANAY
 */
class egg{
    void laying()
    {
        System.out.println("Birds come from eggs");
    }      
}




public class birds extends egg {
    String name;
    int legs;
    
    void birdspeed()
  
    {
        System.out.println( name + " fly at speed "+legs);
       
    }
    birds()
    {
        name="Parrot";
        legs=2;
    }
    
}
