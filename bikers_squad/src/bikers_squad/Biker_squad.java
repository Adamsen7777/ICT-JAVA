/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bikers_squad;


/**
 *
 * @author ADAMSEN BRANAY
 */
public class Biker_squad {
      
      
     
   
    public static void main(String[] args) {
         squad_members adam= new squad_members();
         squad_members anon= new squad_members();
         squad_members jain= new squad_members();
          
          adam.name="Ademsen Branay";
          anon.name= "Anon Bianco";
          jain.name= "Abinesh Jain";
 
          adam.bikenumbers = 1390;
           anon.bikenumbers =8989;
           jain.bikenumbers = 7474;
           
    adam.members();
    anon.members();
    jain.members();
    
    }
    
    
}
