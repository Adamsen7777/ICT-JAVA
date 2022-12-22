/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package innerclass;

/**
 *
 * @author ADAMSEN BRANAY
 */
public class Company {
    String name ="BMW";
    
    class Vehicle{
        String type = "CAR";
        
        public void name(){
            System.out.println("company name " + name);
        }
    }
    
}
