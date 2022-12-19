/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wildanimal;

/**
 *
 * @author ADAMSEN BRANAY
 */
 class lion{
     String animalname;
     int age;
     
     void pet()
     {
         System.out.println(animalname + " has an age of " + age);
     }
     
 }
        


public class animal extends lion {
     String cubname;
     int days;
     
     void love()
     {
         System.out.println( cubname + " has " + days + " old ");
     }
}
