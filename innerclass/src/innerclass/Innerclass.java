/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package innerclass;

/**
 *
 * @author ADAMSEN BRANAY
 */
public class Innerclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Company company = new Company();
        Company.Vehicle vehicle = company.new Vehicle ();
        
        
        vehicle.name();
        
//        System.out.println("company name:" + company.name);
//        System.out.println("vehicle type:" + vehicle.type);
//        
    }
    
}
