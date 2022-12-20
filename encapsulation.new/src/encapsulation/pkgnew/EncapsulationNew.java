/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encapsulation.pkgnew;

/**
 *
 * @author ADAMSEN BRANAY
 */
public class EncapsulationNew {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        worker w1 = new worker();
        
        w1.setName("Adamsen");
        w1.setRoll_no(4);
        
        
        System.out.println("name is " + w1.getName());
        System.out.println("Roll no is " + w1.getRoll_no());
        
    }
    
}
