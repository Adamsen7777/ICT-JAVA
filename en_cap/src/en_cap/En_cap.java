/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package en_cap;

/**
 *
 * @author ADAMSEN BRANAY
 */
public class En_cap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bikeno sports = new bikeno();
        
        sports.setName("bmw");
        sports.setmodel_no(1000);
        
        System.out.println("name is  " + sports.getname());
        System.out.println("model no is" + sports.getmodel_no());
    }
    
}
