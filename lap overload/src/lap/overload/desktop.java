/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap.overload;

/**
 *
 * @author ADAMSEN BRANAY
 */
public class desktop {
    String name;
    int price;
     void system() 
     {
    System.out.println( name + " is a good desktop ");
    
     }  
     
     void system(int i)
             
     {
         System.out.println ( name  +  price  + " is price ");
     }
     
     desktop()
     {
         name = "dell";
         price = 65100;
         
     }
     
      desktop(int i)
      {
          name = " apple";
          price = 100000;
      }
     
     
}


