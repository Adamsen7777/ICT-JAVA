/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructor_birds;

/**
 *
 * @author ADAMSEN BRANAY
 */
public class Constructor_birds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        birds parrot = new birds();
        birds eagle=new birds();
        
        parrot.birdspeed();//constructor usage
        eagle.birdspeed();
        parrot.laying();//using parent class method-inheritance
        
    }
    
}
