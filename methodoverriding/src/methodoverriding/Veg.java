/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methodoverriding;

/**
 *
 * @author ADAMSEN BRANAY
 */
public class Fruits {
    public void apple(){
        System.out.println("apple can increase a blood count");
    }
    
}

public class Veg extends Fruits{
        
        @Override
        public void apple(){
            System.out.println("fruits is better than vegitables");
        }
        
            
                
       
}
