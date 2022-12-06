 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fruits;

/**
 *
 * @author ADAMSEN BRANAY
 */
public class Fruits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        fruits_class apple = new fruits_class();
        fruits_class mango = new fruits_class();
        fruits_class orange = new fruits_class();
        
        apple.name="Apple";
        mango.name="mango";
        orange.name="orange";
        
        apple.seed=6;
        mango.seed=1;
        orange.seed=5;
        
        apple.sweet_fruits();
        mango.sweet_fruits();
        orange.sweet_fruits();
        
        apple.taste="good";
        
        apple.taste();
    }
    
    
    
}
