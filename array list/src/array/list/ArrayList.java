/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array.list;

/**
 *
 * @author ADAMSEN BRANAY
 *  
 */
   import java.util.ArrayList;

public class ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String>flowers= new ArrayList<String>();
        flowers.add("marigold");
        flowers.add("lotus");
        flowers.add("jasmine");
        flowers.add("lily");
        flowers.add("hibuscus");
        
        
        System.out.println(flowers);
        System.out.println(flowers.get(3));
    }
    
}
