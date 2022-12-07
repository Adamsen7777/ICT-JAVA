/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance;

/**
 *
 * @author ADAMSEN BRANAY
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        child adam = new child();
        child bretlee=new child();
        
        adam.name="Adamsen";
        adam.age=23;
        adam.get_age();
        adam.parent_name="Raja";
        adam.parent_age=60;
        adam.get_parent();
        
        bretlee.name="Bretlee";
        bretlee.age=17;
        bretlee.get_age();
        
    }
    
}
