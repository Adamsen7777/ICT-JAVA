/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mobile;

/**
 *
 * @author ADAMSEN BRANAY
 */
public class Mobile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        android samsung=new android();
        android oneplus=new android(); 
        
        samsung.name="SAMSUNG";
        oneplus.name="ONEPLUS";
        
        samsung.price=80000;
        oneplus.price=65000;
        
        samsung.phone();
        oneplus.phone();
        
        
        
    }
}
