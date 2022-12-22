/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dad.and.son.pkgclass;

/**
 *
 * @author ADAMSEN BRANAY
 */
 class egg {
     void laying(){
         System.out.println("birds come from eggs ");
     }
    
}
public class birds extends egg {
    String name;
    int wings;
    
    void lovebirds(){
        System.out.println( name +" has " + wings + " wings " );
    }
    
}
